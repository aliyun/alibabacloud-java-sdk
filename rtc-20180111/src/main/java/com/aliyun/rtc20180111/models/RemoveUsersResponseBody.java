// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<RemoveUsersResponseBodyUsers> users;

    public static RemoveUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersResponseBody self = new RemoveUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveUsersResponseBody setUsers(java.util.List<RemoveUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<RemoveUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class RemoveUsersResponseBodyUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>1811****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RemoveUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            RemoveUsersResponseBodyUsers self = new RemoveUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public RemoveUsersResponseBodyUsers setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public RemoveUsersResponseBodyUsers setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
