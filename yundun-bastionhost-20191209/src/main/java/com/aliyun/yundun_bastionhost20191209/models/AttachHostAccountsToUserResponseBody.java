// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The results of the API call.</p>
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
         * <p>The result returned for the operation of authorizing host accounts for the user. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The operation is successful.</li>
         * <li><strong>UNEXPECTED</strong>: An unknown error occurred.</li>
         * <li><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</li>
         * <li><strong>OBJECT_NOT_FOUND</strong>: The object on which the operation is performed does not exist.</li>
         * <li><strong>OBJECT_AlREADY_EXISTS</strong>: The object on which the operation is performed already exists.</li>
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
         * <p>1</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
         * <p>The result of the API call. Valid values:</p>
         * <ul>
         * <li><p><strong>OK</strong>: The operation is successful.</p>
         * </li>
         * <li><p><strong>UNEXPECTED</strong>: An unknown error occurred.</p>
         * </li>
         * <li><p><strong>INVALID_ARGUMENT</strong>: A request parameter is invalid.</p>
         * <blockquote>
         * <p>Check the request parameters, ensure that they are correct, and then call the operation again.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>OBJECT_NOT_FOUND</strong>: The object on which the operation is performed does not exist.</p>
         * <blockquote>
         * <p>Check whether the ID of the Bastionhost instance exists, whether the host exists, and whether the host ID is correct, and then call the operation again.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>OBJECT_AlREADY_EXISTS</strong>: The object on which the operation is performed already exists.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The results returned for the operation of authorizing host accounts for the user.</p>
         */
        @NameInMap("HostAccounts")
        public java.util.List<AttachHostAccountsToUserResponseBodyResultsHostAccounts> hostAccounts;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
