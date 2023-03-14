// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<DetachHostAccountsFromUserGroupResponseBodyResults> results;

    public static DetachHostAccountsFromUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserGroupResponseBody self = new DetachHostAccountsFromUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostAccountsFromUserGroupResponseBody setResults(java.util.List<DetachHostAccountsFromUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostAccountsFromUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts extends TeaModel {
        /**
         * <p>The return code that indicates whether permissions on the specified host account were revoked from the user group. Valid values:</p>
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

        public static DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts self = new DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachHostAccountsFromUserGroupResponseBodyResults extends TeaModel {
        /**
         * <p>The return code that indicates whether the call was successful. Valid values:</p>
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
         * <p>The result of revoking permissions on the specified host accounts from the user group.</p>
         */
        @NameInMap("HostAccounts")
        public java.util.List<DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts> hostAccounts;

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
         * <p>The ID of the group.</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static DetachHostAccountsFromUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromUserGroupResponseBodyResults self = new DetachHostAccountsFromUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromUserGroupResponseBodyResults setHostAccounts(java.util.List<DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<DetachHostAccountsFromUserGroupResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public DetachHostAccountsFromUserGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DetachHostAccountsFromUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachHostAccountsFromUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
