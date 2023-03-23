// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeEdasContainersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of components.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeEdasContainersResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of container components of a microservice application was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the list was obtained.</p>
     * <p>*   **false**: indicates that the list could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeEdasContainersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdasContainersResponseBody self = new DescribeEdasContainersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdasContainersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEdasContainersResponseBody setData(java.util.List<DescribeEdasContainersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEdasContainersResponseBodyData> getData() {
        return this.data;
    }

    public DescribeEdasContainersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeEdasContainersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEdasContainersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdasContainersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEdasContainersResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeEdasContainersResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the component is disabled. Valid values:</p>
         * <br>
         * <p>*   **true**: indicates that the component is disabled.</p>
         * <p>*   **false**: indicates that the component is not disabled.</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The version of the container, such as Ali-Tomcat, in which a High-speed Service Framework (HSF) application runs.</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        public static DescribeEdasContainersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdasContainersResponseBodyData self = new DescribeEdasContainersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEdasContainersResponseBodyData setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeEdasContainersResponseBodyData setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

    }

}
