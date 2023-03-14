// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostGroupAccountsFromUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<DetachHostGroupAccountsFromUserResponseBodyResults> results;

    public static DetachHostGroupAccountsFromUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachHostGroupAccountsFromUserResponseBody self = new DetachHostGroupAccountsFromUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachHostGroupAccountsFromUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachHostGroupAccountsFromUserResponseBody setResults(java.util.List<DetachHostGroupAccountsFromUserResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DetachHostGroupAccountsFromUserResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames extends TeaModel {
        /**
         * <p>The return code that indicates whether permissions on the specified host account were revoked from the user. Valid values:</p>
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

        public static DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames build(java.util.Map<String, ?> map) throws Exception {
            DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames self = new DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames();
            return TeaModel.build(map, self);
        }

        public DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames setHostAccountName(String hostAccountName) {
            this.hostAccountName = hostAccountName;
            return this;
        }
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        public DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DetachHostGroupAccountsFromUserResponseBodyResults extends TeaModel {
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
         * <p>The result of revoking permissions on the specified host accounts from the user.</p>
         */
        @NameInMap("HostAccountNames")
        public java.util.List<DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames> hostAccountNames;

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

        public static DetachHostGroupAccountsFromUserResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DetachHostGroupAccountsFromUserResponseBodyResults self = new DetachHostGroupAccountsFromUserResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DetachHostGroupAccountsFromUserResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachHostGroupAccountsFromUserResponseBodyResults setHostAccountNames(java.util.List<DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }
        public java.util.List<DetachHostGroupAccountsFromUserResponseBodyResultsHostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        public DetachHostGroupAccountsFromUserResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public DetachHostGroupAccountsFromUserResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachHostGroupAccountsFromUserResponseBodyResults setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
