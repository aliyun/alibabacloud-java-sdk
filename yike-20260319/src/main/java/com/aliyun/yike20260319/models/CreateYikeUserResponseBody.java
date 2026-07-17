// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeUserResponseBody extends TeaModel {
    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("UserInfo")
    public CreateYikeUserResponseBodyUserInfo userInfo;

    public static CreateYikeUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeUserResponseBody self = new CreateYikeUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYikeUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateYikeUserResponseBody setUserInfo(CreateYikeUserResponseBodyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreateYikeUserResponseBodyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class CreateYikeUserResponseBodyUserInfo extends TeaModel {
        /**
         * <p>The user nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>nick</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>spaceId</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateYikeUserResponseBodyUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateYikeUserResponseBodyUserInfo self = new CreateYikeUserResponseBodyUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateYikeUserResponseBodyUserInfo setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public CreateYikeUserResponseBodyUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateYikeUserResponseBodyUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateYikeUserResponseBodyUserInfo setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
