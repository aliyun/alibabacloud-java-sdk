// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ParamListResponseBody extends TeaModel {
    // 结果数据
    @NameInMap("Data")
    public java.util.List<ParamListResponseBodyData> data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // exStack
    @NameInMap("ExStack")
    public String exStack;

    @NameInMap("RequestId")
    public String requestId;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    public static ParamListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParamListResponseBody self = new ParamListResponseBody();
        return TeaModel.build(map, self);
    }

    public ParamListResponseBody setData(java.util.List<ParamListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ParamListResponseBodyData> getData() {
        return this.data;
    }

    public ParamListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ParamListResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ParamListResponseBody setExStack(String exStack) {
        this.exStack = exStack;
        return this;
    }
    public String getExStack() {
        return this.exStack;
    }

    public ParamListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParamListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ParamListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ParamListResponseBodyData extends TeaModel {
        // 平台ID
        @NameInMap("PlatformId")
        public String platformId;

        // 平台名称
        @NameInMap("PlatformName")
        public String platformName;

        // 平台类型
        @NameInMap("PlatformType")
        public Long platformType;

        public static ParamListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ParamListResponseBodyData self = new ParamListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ParamListResponseBodyData setPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }
        public String getPlatformId() {
            return this.platformId;
        }

        public ParamListResponseBodyData setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public ParamListResponseBodyData setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

    }

}
