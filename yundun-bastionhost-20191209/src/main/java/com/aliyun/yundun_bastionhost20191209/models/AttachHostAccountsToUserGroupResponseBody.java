// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserGroupResponseBody extends TeaModel {
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
    public java.util.List<AttachHostAccountsToUserGroupResponseBodyResults> results;

    public static AttachHostAccountsToUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserGroupResponseBody self = new AttachHostAccountsToUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostAccountsToUserGroupResponseBody setResults(java.util.List<AttachHostAccountsToUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostAccountsToUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts extends TeaModel {
        /**
         * <p>The return code that indicates whether the user group was authorized to manage the specified host account. Valid values:</p>
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
         * <p>1</p>
         */
        @NameInMap("HostAccountId")
        public String hostAccountId;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("Message")
        public String message;

        public static AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts self = new AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts setHostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }
        public String getHostAccountId() {
            return this.hostAccountId;
        }

        public AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachHostAccountsToUserGroupResponseBodyResults extends TeaModel {
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
         * <p>The result of authorizing the specified user group to manage the specified host accounts.</p>
         */
        @NameInMap("HostAccounts")
        public java.util.List<AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts> hostAccounts;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static AttachHostAccountsToUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostAccountsToUserGroupResponseBodyResults self = new AttachHostAccountsToUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setHostAccounts(java.util.List<AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts> hostAccounts) {
            this.hostAccounts = hostAccounts;
            return this;
        }
        public java.util.List<AttachHostAccountsToUserGroupResponseBodyResultsHostAccounts> getHostAccounts() {
            return this.hostAccounts;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostAccountsToUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
