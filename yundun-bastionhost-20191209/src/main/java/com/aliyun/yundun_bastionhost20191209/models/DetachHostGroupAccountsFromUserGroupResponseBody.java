// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostGroupAccountsFromUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResults> results;

    public static DetachHostGroupAccountsFromUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostGroupAccountsFromUserGroupResponseBody self = new DetachHostGroupAccountsFromUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostGroupAccountsFromUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostGroupAccountsFromUserGroupResponseBody setResults(java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames extends TeaModel {
        /**
         * <p>The return code that indicates whether permissions on the specified host account were revoked from the specified user group. Valid values:</p>
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
         * <p>The name of the host account.</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        public static DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames self = new DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachHostGroupAccountsFromUserGroupResponseBodyResults extends TeaModel {
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
        @NameInMap("HostAccountNames")
        public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames> hostAccountNames;

        /**
         * <p>The ID of the host group.</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

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

        public static DetachHostGroupAccountsFromUserGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostGroupAccountsFromUserGroupResponseBodyResults self = new DetachHostGroupAccountsFromUserGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setHostAccountNames(java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<DetachHostGroupAccountsFromUserGroupResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachHostGroupAccountsFromUserGroupResponseBodyResults setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
