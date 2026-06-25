// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeComponentsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li><p><strong>2xx</strong>: success</p>
     * </li>
     * <li><p><strong>3xx</strong>: redirect</p>
     * </li>
     * <li><p><strong>4xx</strong>: request error</p>
     * </li>
     * <li><p><strong>5xx</strong>: server error</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>An array of supported application components.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeComponentsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>If the request is successful, the <strong>ErrorCode</strong> parameter is empty.</p>
     * </li>
     * <li><p>If the request fails, the <strong>ErrorCode</strong> parameter indicates an error code. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query call details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsResponseBody self = new DescribeComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeComponentsResponseBody setData(java.util.List<DescribeComponentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeComponentsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeComponentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeComponentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComponentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeComponentsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeComponentsResponseBodyData extends TeaModel {
        /**
         * <p>The component description.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("ComponentDescription")
        public String componentDescription;

        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("ComponentKey")
        public String componentKey;

        /**
         * <p>Indicates whether the component is expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The component is expired.</p>
         * </li>
         * <li><p><strong>false</strong>: The component is not expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>JDK</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeComponentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentsResponseBodyData self = new DescribeComponentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeComponentsResponseBodyData setComponentDescription(String componentDescription) {
            this.componentDescription = componentDescription;
            return this;
        }
        public String getComponentDescription() {
            return this.componentDescription;
        }

        public DescribeComponentsResponseBodyData setComponentKey(String componentKey) {
            this.componentKey = componentKey;
            return this;
        }
        public String getComponentKey() {
            return this.componentKey;
        }

        public DescribeComponentsResponseBodyData setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeComponentsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
