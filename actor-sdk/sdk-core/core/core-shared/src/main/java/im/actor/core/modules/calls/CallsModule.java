package im.actor.core.modules.calls;

import java.util.HashMap;

import im.actor.core.webrtc.WebRTCProvider;
import im.actor.core.api.rpc.ResponseDoCall;
import im.actor.core.entity.signals.AbsSignal;
import im.actor.core.modules.AbsModule;
import im.actor.core.modules.ModuleContext;
import im.actor.core.viewmodel.Command;
import im.actor.runtime.actors.ActorRef;

import static im.actor.runtime.actors.ActorSystem.system;

public class CallsModule extends AbsModule {

    public static final int MAX_CALLS_COUNT = 1;
    public static final int CALL_TIMEOUT = 10;
    public static boolean CALLS_ENABLED = false;
    public static boolean MULTIPLE_CALLS_ENABLED = false;

    public static final String TAG = "CALLS";

    private HashMap<Long, ActorRef> calls = new HashMap<>();
    private WebRTCProvider provider;
    private ActorRef callNotifier;
    private ActorRef callManager;

    public CallsModule(ModuleContext context) {
        super(context);

        provider = context().getConfiguration().getWebRTCProvider();
    }

    public void run() {
        if (provider == null) {
            return;
        }

        callManager = system().actorOf("calls/manager", CallManagerActor.CONSTRUCTOR(context()));
        // provider.init();

//        if (CALLS_ENABLED) {
//            request(new RequestSubscribeToCalls());
//            context().getEvents().subscribe(new BusSubscriber() {
//                @Override
//                public void onBusEvent(Event event) {
//                    request(new RequestSubscribeToCalls());
//                }
//            }, NewSessionCreated.EVENT);
//        }
    }

    public ActorRef getCallManager() {
        return callManager;
    }

    public Command<ResponseDoCall> makeCall(final int uid, final CallCallback callCallback) {
//        return new Command<ResponseDoCall>() {
//            @Override
//            public void start(final CommandCallback<ResponseDoCall> callback) {
//                User u = users().getValue(uid);
//                request(new RequestDoCall(new ApiOutPeer(ApiPeerType.PRIVATE, u.getUid(), u.getAccessHash()), CALL_TIMEOUT), new RpcCallback<ResponseDoCall>() {
//                    @Override
//                    public void onResult(final ResponseDoCall response) {
//                        callback.onResult(response);
//
//                        Log.d(TAG, "make call " + response.getCallId());
//                        calls.put(response.getCallId(),
//                                system().actorOf(Props.create(new ActorCreator() {
//                                    @Override
//                                    public Actor create() {
//                                        return new CallActor(response.getCallId(), callCallback, context());
//                                    }
//                                }), "actor/call_" + response.getCallId()));
//
//
//                    }
//
//                    @Override
//                    public void onError(RpcException e) {
//                        callback.onError(e);
//                    }
//                });
//            }
//        };
        return null;
    }

    public void callInProgress(long callId) {
        // request(new RequestCallInProgress(callId, CALL_TIMEOUT));
    }

    public void handleCall(final long callId, final CallCallback callback) {
//        ActorRef call = calls.get(callId);
//        if (call != null) {
//            call.send(new CallActor.HandleCall(callback));
//        } else {
//            //can't find call - close fragment
//            callback.onCallEnd();
//        }
    }

    //do end call
    public void endCall(long callId) {
//        Log.d(TAG, "do end call" + callId);
//
//        request(new RequestEndCall(callId));
//        ActorRef call = calls.get(callId);
//        if (call != null) {
//            Log.d(TAG, "call exist - end it");
//
//            call.send(new CallActor.EndCall());
//        } else {
//            Log.d(TAG, "call not exist - remove it");
//            onCallEnded(callId);
//        }
    }

    public void onIncomingCall(long callId, int uid) {
        if (provider == null) {
            return;
        }

        callManager.send(new CallManagerActor.OnIncomingCall(callId, uid));
    }


    //after end call update processed by CallActor
    public void onCallEnded(long callId) {
//        Log.d(TAG, "on callActor ended call: " + callId);
//        calls.remove(callId);
    }


    public void sendSignal(long callId, AbsSignal signal) {
        // request(new RequestSendCallSignal(callId, signal.toByteArray()));
    }

    public interface CallCallback {
        void onCallEnd();

        void onSignal(byte[] data);
    }
}
