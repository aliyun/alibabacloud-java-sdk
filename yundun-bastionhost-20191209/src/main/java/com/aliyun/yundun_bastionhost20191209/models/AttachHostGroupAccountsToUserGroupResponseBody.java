// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserGroupResponseBody extends TeaModel {
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
    public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResults> results;

    public static AttachHostGroupAccountsToUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserGroupResponseBody self = new AttachHostGroupAccountsToUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostGroupAccountsToUserGroupResponseBody setResults(java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames extends TeaModel {
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
         * <p>The name of the host account.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        public static AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames self = new AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachHostGroupAccountsToUserGroupResponseBodyResults extends TeaModel {
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
         * <p>The result of authorizing the user group to manage the specified host accounts.</p>
         */
        @NameInMap("HostAccountNames")
        public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames> hostAccountNames;

        /**
         * <p>The ID of the host group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>This parameter is deprecated.</p>
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

        public static AttachHostGroupAccountsToUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserGroupResponseBodyResults self = new AttachHostGroupAccountsToUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setHostAccountNames(java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<AttachHostGroupAccountsToUserGroupResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostGroupAccountsToUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
