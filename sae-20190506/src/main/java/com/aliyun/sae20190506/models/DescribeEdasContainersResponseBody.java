// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeEdasContainersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeEdasContainersResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Disabled")
        public Boolean disabled;

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
