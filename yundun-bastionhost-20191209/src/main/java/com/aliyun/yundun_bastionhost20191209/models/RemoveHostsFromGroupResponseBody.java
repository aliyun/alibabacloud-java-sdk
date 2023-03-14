// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the call.</p>
     */
    @NameInMap("Results")
    public java.util.List<RemoveHostsFromGroupResponseBodyResults> results;

    public static RemoveHostsFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveHostsFromGroupResponseBody self = new RemoveHostsFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveHostsFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveHostsFromGroupResponseBody setResults(java.util.List<RemoveHostsFromGroupResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<RemoveHostsFromGroupResponseBodyResults> getResults() {
        return this.results;
    }

    public static class RemoveHostsFromGroupResponseBodyResults extends TeaModel {
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

        public static RemoveHostsFromGroupResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            RemoveHostsFromGroupResponseBodyResults self = new RemoveHostsFromGroupResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public RemoveHostsFromGroupResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveHostsFromGroupResponseBodyResults setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public RemoveHostsFromGroupResponseBodyResults setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public RemoveHostsFromGroupResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
