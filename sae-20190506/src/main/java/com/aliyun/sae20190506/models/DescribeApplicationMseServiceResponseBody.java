// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationMseServiceResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Valid values: 2xx: The request was successful. 3xx: The request was redirected. 4xx: The request was invalid. 5xx: A server error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationMseServiceResponseBodyData data;

    /**
     * <p>The error code. Value description:</p>
     * <ul>
     * <li>If the request succeeds, this field is not returned.</li>
     * <li>For more information, see the <strong>Error codes</strong> section of this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>System.Upgrading</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Value description:</p>
     * <ul>
     * <li>If the request was successful, <strong>success</strong> is returned.</li>
     * <li>If the request failed, an error code is returned.</li>
     * </ul>
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
     * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application instance groups were obtained successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace, which is used to query the exact call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationMseServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationMseServiceResponseBody self = new DescribeApplicationMseServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationMseServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationMseServiceResponseBody setData(DescribeApplicationMseServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationMseServiceResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationMseServiceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationMseServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationMseServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationMseServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationMseServiceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationMseServiceResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-hvm47******</p>
         */
        @NameInMap("MseAppId")
        public String mseAppId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("MseAppName")
        public String mseAppName;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-ent</p>
         */
        @NameInMap("MseAppNameSpace")
        public String mseAppNameSpace;

        /**
         * <p>The application status. Valid values:</p>
         * <ul>
         * <li>EXPIRED</li>
         * <li>REBOOTING</li>
         * <li>WAITING</li>
         * <li>FAIL</li>
         * <li>NULL/SUCCESS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeApplicationMseServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationMseServiceResponseBodyData self = new DescribeApplicationMseServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationMseServiceResponseBodyData setMseAppId(String mseAppId) {
            this.mseAppId = mseAppId;
            return this;
        }
        public String getMseAppId() {
            return this.mseAppId;
        }

        public DescribeApplicationMseServiceResponseBodyData setMseAppName(String mseAppName) {
            this.mseAppName = mseAppName;
            return this;
        }
        public String getMseAppName() {
            return this.mseAppName;
        }

        public DescribeApplicationMseServiceResponseBodyData setMseAppNameSpace(String mseAppNameSpace) {
            this.mseAppNameSpace = mseAppNameSpace;
            return this;
        }
        public String getMseAppNameSpace() {
            return this.mseAppNameSpace;
        }

        public DescribeApplicationMseServiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
