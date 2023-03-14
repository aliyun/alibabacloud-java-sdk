// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<AttachHostGroupAccountsToUserResponseBodyResults> results;

    public static AttachHostGroupAccountsToUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserResponseBody self = new AttachHostGroupAccountsToUserResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachHostGroupAccountsToUserResponseBody setResults(java.util.List<AttachHostGroupAccountsToUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AttachHostGroupAccountsToUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames extends TeaModel {
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
         * <p>The name of the host account.</p>
         */
        @NameInMap("HostAccountName")
        public String hostAccountName;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("Message")
        public String message;

        public static AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames self = new AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachHostGroupAccountsToUserResponseBodyResults extends TeaModel {
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
         * <p>The result of authorizing the user to manage the specified host accounts.</p>
         */
        @NameInMap("HostAccountNames")
        public java.util.List<AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames> hostAccountNames;

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
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AttachHostGroupAccountsToUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachHostGroupAccountsToUserResponseBodyResults self = new AttachHostGroupAccountsToUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setHostAccountNames(java.util.List<AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<AttachHostGroupAccountsToUserResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachHostGroupAccountsToUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
