// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecificationsResponseBody extends TeaModel {
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
    public java.util.List<DescribeInstanceSpecificationsResponseBodyData> data;

    public static DescribeInstanceSpecificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecificationsResponseBody self = new DescribeInstanceSpecificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSpecificationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceSpecificationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceSpecificationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceSpecificationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeInstanceSpecificationsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeInstanceSpecificationsResponseBody setData(java.util.List<DescribeInstanceSpecificationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstanceSpecificationsResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeInstanceSpecificationsResponseBodyData extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        public Integer cpu;

        @NameInMap("Enable")
        @Validation(required = true)
        public Boolean enable;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Memory")
        @Validation(required = true)
        public Integer memory;

        @NameInMap("SpecInfo")
        @Validation(required = true)
        public String specInfo;

        @NameInMap("Version")
        @Validation(required = true)
        public Integer version;

        public static DescribeInstanceSpecificationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSpecificationsResponseBodyData self = new DescribeInstanceSpecificationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSpecificationsResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstanceSpecificationsResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeInstanceSpecificationsResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeInstanceSpecificationsResponseBodyData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeInstanceSpecificationsResponseBodyData setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

        public DescribeInstanceSpecificationsResponseBodyData setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
