// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
    public java.util.List<DetachHostAccountsFromUserResponseBodyResults> results;

    public static DetachHostAccountsFromUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserResponseBody self = new DetachHostAccountsFromUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostAccountsFromUserResponseBody setResults(java.util.List<DetachHostAccountsFromUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostAccountsFromUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostAccountsFromUserResponseBodyResultsHostAccounts extends TeaModel {
        /**
         * <p>The return code that indicates whether permissions on the specified host accounts were revoked from the user. Valid values:</p>
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
         * <p>The host account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        public static DetachHostAccountsFromUserResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromUserResponseBodyResultsHostAccounts self = new DetachHostAccountsFromUserResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromUserResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromUserResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public DetachHostAccountsFromUserResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachHostAccountsFromUserResponseBodyResults extends TeaModel {
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
         * <p>The result of revoking permissions on the specified host accounts from the user.</p>
         */
        @NameInMap("HostAccounts")
        public java.util.List<DetachHostAccountsFromUserResponseBodyResultsHostAccounts> hostAccounts;

        /**
         * <p>The host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DetachHostAccountsFromUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostAccountsFromUserResponseBodyResults self = new DetachHostAccountsFromUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostAccountsFromUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostAccountsFromUserResponseBodyResults setHostAccounts(java.util.List<DetachHostAccountsFromUserResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<DetachHostAccountsFromUserResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public DetachHostAccountsFromUserResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DetachHostAccountsFromUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachHostAccountsFromUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
