// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<AttachHostAccountsToUserResponseBodyResults> results;

    public static AttachHostAccountsToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserResponseBody self = new AttachHostAccountsToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostAccountsToUserResponseBody setResults(java.util.List<AttachHostAccountsToUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostAccountsToUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostAccountsToUserResponseBodyResultsHostAccounts extends TeaModel {
        /**
         * <p>The return code that indicates whether the user was authorized to manage the specified host account. Valid values:</p>
         * <br>
         * <p>*   **OK**: The call was successful.</p>
         * <p>*   **UNEXPECTED**: An unknown error occurred.</p>
         * <p>*   **INVALID_ARGUMENT**: A request parameter is invalid.</p>
         * <p>*   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.</p>
         * <p>*   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the host account.</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        public static AttachHostAccountsToUserResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserResponseBodyResultsHostAccounts self = new AttachHostAccountsToUserResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public AttachHostAccountsToUserResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachHostAccountsToUserResponseBodyResults extends TeaModel {
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
         * <p>The result of authorizing the specified user to manage the specified host accounts.</p>
         */
        @NameInMap("HostAccounts")
        public java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> hostAccounts;

        /**
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AttachHostAccountsToUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserResponseBodyResults self = new AttachHostAccountsToUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserResponseBodyResults setHostAccounts(java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public AttachHostAccountsToUserResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public AttachHostAccountsToUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostAccountsToUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
