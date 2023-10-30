// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupResponseBody extends TeaModel {
    /**
     * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~315526~~).</p>
     * <br>
     * <p>For more information about sample requests, see the "Examples" section of this topic.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Removes one or more users from a user group.</p>
     */
    @NameInMap("Results")
    public java.util.List<RemoveUsersFromGroupResponseBodyResults> results;

    public static RemoveUsersFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupResponseBody self = new RemoveUsersFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveUsersFromGroupResponseBody setResults(java.util.List<RemoveUsersFromGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveUsersFromGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RemoveUsersFromGroupResponseBodyResults extends TeaModel {
        /**
         * <p>RemoveUsersFromGroup</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>WB01014029</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>RemoveUsersFromGroup</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserId")
        public String userId;

        public static RemoveUsersFromGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveUsersFromGroupResponseBodyResults self = new RemoveUsersFromGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveUsersFromGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveUsersFromGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveUsersFromGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public RemoveUsersFromGroupResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
