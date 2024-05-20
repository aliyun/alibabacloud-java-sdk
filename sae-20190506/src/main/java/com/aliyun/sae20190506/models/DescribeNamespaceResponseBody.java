// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information of the namespace.</p>
     */
    @NameInMap("Data")
    public DescribeNamespaceResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned if the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned if the request fails. For more information, see the **Error codes** section in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned. Valid values:</p>
     * <br>
     * <p>*   success: If the call is successful, **success** is returned.</p>
     * <p>*   An error code: If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information about the namespace was queried successfully. Valid values:</p>
     * <br>
     * <p>*   **true**: The information was queried.</p>
     * <p>*   **false**: The image failed to be found.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceResponseBody self = new DescribeNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNamespaceResponseBody setData(DescribeNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNamespaceResponseBodyData getData() {
        return this.data;
    }

    public DescribeNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNamespaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeNamespaceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the SAE built-in registry is enabled. </p>
         * <p>Valid values:</p>
         * <p>* true</p>
         * <p>* false</p>
         */
        @NameInMap("EnableMicroRegistration")
        public Boolean enableMicroRegistration;

        /**
         * <p>The short ID of the namespace.</p>
         */
        @NameInMap("NameSpaceShortId")
        public String nameSpaceShortId;

        /**
         * <p>The description of the namespace.</p>
         */
        @NameInMap("NamespaceDescription")
        public String namespaceDescription;

        /**
         * <p>The ID of the namespace. The information about the default namespace cannot be queried or modified. The default namespace cannot be deleted.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNamespaceResponseBodyData self = new DescribeNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNamespaceResponseBodyData setEnableMicroRegistration(Boolean enableMicroRegistration) {
            this.enableMicroRegistration = enableMicroRegistration;
            return this;
        }
        public Boolean getEnableMicroRegistration() {
            return this.enableMicroRegistration;
        }

        public DescribeNamespaceResponseBodyData setNameSpaceShortId(String nameSpaceShortId) {
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        public DescribeNamespaceResponseBodyData setNamespaceDescription(String namespaceDescription) {
            this.namespaceDescription = namespaceDescription;
            return this;
        }
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        public DescribeNamespaceResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeNamespaceResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public DescribeNamespaceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
