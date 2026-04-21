// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeUserResponseBody extends TeaModel {
    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserInfo")
    public GetYikeUserResponseBodyUserInfo userInfo;

    public static GetYikeUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeUserResponseBody self = new GetYikeUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYikeUserResponseBody setUserInfo(GetYikeUserResponseBodyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetYikeUserResponseBodyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetYikeUserResponseBodyUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nick</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>spaceId</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("YikeUserId")
        public String yikeUserId;

        public static GetYikeUserResponseBodyUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetYikeUserResponseBodyUserInfo self = new GetYikeUserResponseBodyUserInfo();
            return TeaModel.build(map, self);
        }

        public GetYikeUserResponseBodyUserInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public GetYikeUserResponseBodyUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetYikeUserResponseBodyUserInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetYikeUserResponseBodyUserInfo setYikeUserId(String yikeUserId) {
            this.yikeUserId = yikeUserId;
            return this;
        }
        public String getYikeUserId() {
            return this.yikeUserId;
        }

    }

}
