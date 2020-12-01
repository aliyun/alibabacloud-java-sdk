// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeEdasContainersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeEdasContainersResponseBodyData> data;

    public static DescribeEdasContainersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdasContainersResponseBody self = new DescribeEdasContainersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdasContainersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdasContainersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEdasContainersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEdasContainersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEdasContainersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeEdasContainersResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeEdasContainersResponseBody setData(java.util.List<DescribeEdasContainersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeEdasContainersResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeEdasContainersResponseBodyData extends TeaModel {
        @NameInMap("Disabled")
        @Validation(required = true)
        public Boolean disabled;

        @NameInMap("EdasContainerVersion")
        @Validation(required = true)
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
