// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddUsersToGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
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
