// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddUsersToGroupResponseBody extends TeaModel {
    /**
     * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~315526~~).</p>
     * <br>
     * <p>For more information about sample requests, see the "Examples" section of this topic.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Adds one or more users to a user group.</p>
     */
    @NameInMap("Results")
    public java.util.List<AddUsersToGroupResponseBodyResults> results;

    public static AddUsersToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUsersToGroupResponseBody self = new AddUsersToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUsersToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddUsersToGroupResponseBody setResults(java.util.List<AddUsersToGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddUsersToGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddUsersToGroupResponseBodyResults extends TeaModel {
        /**
         * <p>AddUsersToGroup</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>WB01014029</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>AddUsersToGroup</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserId")
        public String userId;

        public static AddUsersToGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddUsersToGroupResponseBodyResults self = new AddUsersToGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddUsersToGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddUsersToGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddUsersToGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public AddUsersToGroupResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
