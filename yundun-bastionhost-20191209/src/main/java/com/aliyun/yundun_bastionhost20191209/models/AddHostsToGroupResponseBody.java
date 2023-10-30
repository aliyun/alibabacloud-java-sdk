// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddHostsToGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<AddHostsToGroupResponseBodyResults> results;

    public static AddHostsToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddHostsToGroupResponseBody self = new AddHostsToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddHostsToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHostsToGroupResponseBody setResults(java.util.List<AddHostsToGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<AddHostsToGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class AddHostsToGroupResponseBodyResults extends TeaModel {
        /**
         * <p>The return code that indicates whether the call was successful. Valid values:</p>
         * <br>
         * <p>*   **OK**: The call was successful.</p>
         * <br>
         * <p>*   **UNEXPECTED**: An unknown error occurred.</p>
         * <br>
         * <p>*   **INVALID_ARGUMENT**: A request parameter is invalid.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note**Make sure that the request parameters are valid and call the operation again.</p>
         * <br>
         * <p>*   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.</p>
         * <br>
         * <p>    **</p>
         * <br>
         * <p>    **Note**Check whether the specified ID of the bastion host exists, whether the specified hosts exist, and whether the specified host IDs are valid. Then, call the operation again.</p>
         * <br>
         * <p>*   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the host group.</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

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

        public static AddHostsToGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AddHostsToGroupResponseBodyResults self = new AddHostsToGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AddHostsToGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddHostsToGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public AddHostsToGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public AddHostsToGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
