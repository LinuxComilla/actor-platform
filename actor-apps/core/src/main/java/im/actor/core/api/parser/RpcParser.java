package im.actor.core.api.parser;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.rpc.*;
import im.actor.core.api.base.*;

public class RpcParser extends BaseParser<RpcScope> {
    @Override
    public RpcScope read(int type, byte[] payload) throws IOException {
        switch(type) {
            case 191: return RequestStartPhoneAuth.fromBytes(payload);
            case 197: return RequestSendCodeByPhoneCall.fromBytes(payload);
            case 185: return RequestStartEmailAuth.fromBytes(payload);
            case 189: return RequestValidateCode.fromBytes(payload);
            case 194: return RequestGetOAuth2Params.fromBytes(payload);
            case 196: return RequestCompleteOAuth2.fromBytes(payload);
            case 190: return RequestSignUp.fromBytes(payload);
            case 80: return RequestGetAuthSessions.fromBytes(payload);
            case 82: return RequestTerminateSession.fromBytes(payload);
            case 83: return RequestTerminateAllSessions.fromBytes(payload);
            case 84: return RequestSignOut.fromBytes(payload);
            case 3: return RequestSignInObsolete.fromBytes(payload);
            case 4: return RequestSignUpObsolete.fromBytes(payload);
            case 1: return RequestSendAuthCodeObsolete.fromBytes(payload);
            case 90: return RequestSendAuthCallObsolete.fromBytes(payload);
            case 96: return RequestEditUserLocalName.fromBytes(payload);
            case 53: return RequestEditName.fromBytes(payload);
            case 205: return RequestEditNickName.fromBytes(payload);
            case 206: return RequestCheckNickName.fromBytes(payload);
            case 212: return RequestEditAbout.fromBytes(payload);
            case 31: return RequestEditAvatar.fromBytes(payload);
            case 91: return RequestRemoveAvatar.fromBytes(payload);
            case 7: return RequestImportContacts.fromBytes(payload);
            case 87: return RequestGetContacts.fromBytes(payload);
            case 89: return RequestRemoveContact.fromBytes(payload);
            case 114: return RequestAddContact.fromBytes(payload);
            case 112: return RequestSearchContacts.fromBytes(payload);
            case 92: return RequestSendMessage.fromBytes(payload);
            case 55: return RequestMessageReceived.fromBytes(payload);
            case 57: return RequestMessageRead.fromBytes(payload);
            case 98: return RequestDeleteMessage.fromBytes(payload);
            case 99: return RequestClearChat.fromBytes(payload);
            case 100: return RequestDeleteChat.fromBytes(payload);
            case 118: return RequestLoadHistory.fromBytes(payload);
            case 104: return RequestLoadDialogs.fromBytes(payload);
            case 65: return RequestCreateGroup.fromBytes(payload);
            case 199: return RequestEnterGroup.fromBytes(payload);
            case 85: return RequestEditGroupTitle.fromBytes(payload);
            case 86: return RequestEditGroupAvatar.fromBytes(payload);
            case 101: return RequestRemoveGroupAvatar.fromBytes(payload);
            case 69: return RequestInviteUser.fromBytes(payload);
            case 70: return RequestLeaveGroup.fromBytes(payload);
            case 71: return RequestKickUser.fromBytes(payload);
            case 211: return RequestEditGroupTopic.fromBytes(payload);
            case 213: return RequestEditGroupAbout.fromBytes(payload);
            case 214: return RequestMakeUserAdmin.fromBytes(payload);
            case 177: return RequestGetGroupInviteUrl.fromBytes(payload);
            case 179: return RequestRevokeInviteUrl.fromBytes(payload);
            case 180: return RequestJoinGroup.fromBytes(payload);
            case 201: return RequestGetPublicGroups.fromBytes(payload);
            case 182: return RequestGetIntegrationToken.fromBytes(payload);
            case 184: return RequestRevokeIntegrationToken.fromBytes(payload);
            case 27: return RequestTyping.fromBytes(payload);
            case 29: return RequestSetOnline.fromBytes(payload);
            case 77: return RequestGetFileUrl.fromBytes(payload);
            case 97: return RequestGetFileUploadUrl.fromBytes(payload);
            case 122: return RequestCommitFileUpload.fromBytes(payload);
            case 142: return RequestGetFileUploadPartUrl.fromBytes(payload);
            case 134: return RequestGetParameters.fromBytes(payload);
            case 128: return RequestEditParameter.fromBytes(payload);
            case 51: return RequestRegisterGooglePush.fromBytes(payload);
            case 76: return RequestRegisterApplePush.fromBytes(payload);
            case 52: return RequestUnregisterPush.fromBytes(payload);
            case 9: return RequestGetState.fromBytes(payload);
            case 11: return RequestGetDifference.fromBytes(payload);
            case 32: return RequestSubscribeToOnline.fromBytes(payload);
            case 33: return RequestSubscribeFromOnline.fromBytes(payload);
            case 74: return RequestSubscribeToGroupOnline.fromBytes(payload);
            case 75: return RequestSubscribeFromGroupOnline.fromBytes(payload);
            case 193: return ResponseStartPhoneAuth.fromBytes(payload);
            case 186: return ResponseStartEmailAuth.fromBytes(payload);
            case 195: return ResponseGetOAuth2Params.fromBytes(payload);
            case 5: return ResponseAuth.fromBytes(payload);
            case 81: return ResponseGetAuthSessions.fromBytes(payload);
            case 2: return ResponseSendAuthCodeObsolete.fromBytes(payload);
            case 103: return ResponseEditAvatar.fromBytes(payload);
            case 8: return ResponseImportContacts.fromBytes(payload);
            case 88: return ResponseGetContacts.fromBytes(payload);
            case 113: return ResponseSearchContacts.fromBytes(payload);
            case 119: return ResponseLoadHistory.fromBytes(payload);
            case 105: return ResponseLoadDialogs.fromBytes(payload);
            case 66: return ResponseCreateGroup.fromBytes(payload);
            case 200: return ResponseEnterGroup.fromBytes(payload);
            case 115: return ResponseEditGroupAvatar.fromBytes(payload);
            case 215: return ResponseMakeUserAdmin.fromBytes(payload);
            case 178: return ResponseInviteUrl.fromBytes(payload);
            case 181: return ResponseJoinGroup.fromBytes(payload);
            case 202: return ResponseGetPublicGroups.fromBytes(payload);
            case 183: return ResponseIntegrationToken.fromBytes(payload);
            case 78: return ResponseGetFileUrl.fromBytes(payload);
            case 121: return ResponseGetFileUploadUrl.fromBytes(payload);
            case 138: return ResponseCommitFileUpload.fromBytes(payload);
            case 141: return ResponseGetFileUploadPartUrl.fromBytes(payload);
            case 135: return ResponseGetParameters.fromBytes(payload);
            case 12: return ResponseGetDifference.fromBytes(payload);
            case 50: return ResponseVoid.fromBytes(payload);
            case 72: return ResponseSeq.fromBytes(payload);
            case 102: return ResponseSeqDate.fromBytes(payload);
            case 209: return ResponseBool.fromBytes(payload);
            case 13: return SeqUpdate.fromBytes(payload);
            case 73: return FatSeqUpdate.fromBytes(payload);
            case 26: return WeakUpdate.fromBytes(payload);
            case 25: return SeqUpdateTooLong.fromBytes(payload);
        }
        throw new IOException();
    }
}
