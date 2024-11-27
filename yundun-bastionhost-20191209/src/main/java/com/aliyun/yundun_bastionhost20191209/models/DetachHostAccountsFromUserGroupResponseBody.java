// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
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
         * <ul>
         * <li><strong>OK</strong>: The call was successful.</li>
         * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
         * <li><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</li>
         * <li><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</li>
         * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object on which you want to perform the operation already exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>１</p>
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
         * <ul>
         * <li><strong>OK</strong>: The call was successful.</li>
         * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
         * <li><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</li>
         * <li><strong>OBJECT_NOT_FOUND</strong>: The specified object on which you want to perform the operation does not exist.</li>
         * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object on which you want to perform the operation already exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
         * 
         * <strong>example:</strong>
         * <p>１</p>
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
         * 
         * <strong>example:</strong>
         * <p>１</p>
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
