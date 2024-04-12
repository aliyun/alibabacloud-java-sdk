// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
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
         * <p>The return code that indicates whether the call was successful. Valid values:</p>
         * <br>
         * <p>*   **OK**: The call was successful.</p>
         * <br>
         * <p>*   **UNEXPECTED**: An unknown error occurred.</p>
         * <br>
         * <p>*   **INVALID_ARGUMENT**: A request parameter is invalid.</p>
         * <br>
         * <p>> Make sure that the request parameters are valid and call the operation again.</p>
         * <br>
         * <p>*   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.</p>
         * <br>
         * <p>> Check whether the specified ID of the bastion host exists, whether the specified hosts exist, and whether the specified host IDs are valid. Then, call the operation again.</p>
         * <br>
         * <p>*   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>The ID of the user.</p>
         */
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
