// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkValidateStatusResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public SdkValidateStatusResponseBodyData data;

    // 结果描述
    @NameInMap("Message")
    public String message;

    // 请求链路ID，如POP请求进来的requestId，返回时原样返回
    @NameInMap("RequestId")
    public String requestId;

    // 服务端处理耗时，ms
    @NameInMap("Rt")
    public Long rt;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static SdkValidateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkValidateStatusResponseBody self = new SdkValidateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkValidateStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SdkValidateStatusResponseBody setData(SdkValidateStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SdkValidateStatusResponseBodyData getData() {
        return this.data;
    }

    public SdkValidateStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SdkValidateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SdkValidateStatusResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public SdkValidateStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SdkValidateStatusResponseBodyDataAppExtPopList extends TeaModel {
        @NameInMap("ExtId")
        public Long extId;

        // cdn ip
        @NameInMap("FlowIp")
        public java.util.List<String> flowIp;

        // cdn 域名信息
        @NameInMap("FlowUrl")
        public java.util.List<String> flowUrl;

        // 业务方ip集合
        @NameInMap("OriginalIpList")
        public java.util.List<String> originalIpList;

        // 业务方域名集合
        @NameInMap("OriginalUrlList")
        public java.util.List<String> originalUrlList;

        public static SdkValidateStatusResponseBodyDataAppExtPopList build(java.util.Map<String, ?> map) throws Exception {
            SdkValidateStatusResponseBodyDataAppExtPopList self = new SdkValidateStatusResponseBodyDataAppExtPopList();
            return TeaModel.build(map, self);
        }

        public SdkValidateStatusResponseBodyDataAppExtPopList setExtId(Long extId) {
            this.extId = extId;
            return this;
        }
        public Long getExtId() {
            return this.extId;
        }

        public SdkValidateStatusResponseBodyDataAppExtPopList setFlowIp(java.util.List<String> flowIp) {
            this.flowIp = flowIp;
            return this;
        }
        public java.util.List<String> getFlowIp() {
            return this.flowIp;
        }

        public SdkValidateStatusResponseBodyDataAppExtPopList setFlowUrl(java.util.List<String> flowUrl) {
            this.flowUrl = flowUrl;
            return this;
        }
        public java.util.List<String> getFlowUrl() {
            return this.flowUrl;
        }

        public SdkValidateStatusResponseBodyDataAppExtPopList setOriginalIpList(java.util.List<String> originalIpList) {
            this.originalIpList = originalIpList;
            return this;
        }
        public java.util.List<String> getOriginalIpList() {
            return this.originalIpList;
        }

        public SdkValidateStatusResponseBodyDataAppExtPopList setOriginalUrlList(java.util.List<String> originalUrlList) {
            this.originalUrlList = originalUrlList;
            return this;
        }
        public java.util.List<String> getOriginalUrlList() {
            return this.originalUrlList;
        }

    }

    public static class SdkValidateStatusResponseBodyData extends TeaModel {
        @NameInMap("AppExtPopList")
        public java.util.List<SdkValidateStatusResponseBodyDataAppExtPopList> appExtPopList;

        // 是否处于免流状态，取值范围为true/false
        @NameInMap("FreeFlow")
        public Boolean freeFlow;

        // 伪码
        @NameInMap("PseudoCode")
        public String pseudoCode;

        public static SdkValidateStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SdkValidateStatusResponseBodyData self = new SdkValidateStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SdkValidateStatusResponseBodyData setAppExtPopList(java.util.List<SdkValidateStatusResponseBodyDataAppExtPopList> appExtPopList) {
            this.appExtPopList = appExtPopList;
            return this;
        }
        public java.util.List<SdkValidateStatusResponseBodyDataAppExtPopList> getAppExtPopList() {
            return this.appExtPopList;
        }

        public SdkValidateStatusResponseBodyData setFreeFlow(Boolean freeFlow) {
            this.freeFlow = freeFlow;
            return this;
        }
        public Boolean getFreeFlow() {
            return this.freeFlow;
        }

        public SdkValidateStatusResponseBodyData setPseudoCode(String pseudoCode) {
            this.pseudoCode = pseudoCode;
            return this;
        }
        public String getPseudoCode() {
            return this.pseudoCode;
        }

    }

}
