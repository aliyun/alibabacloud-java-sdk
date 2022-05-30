// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ValidateStatusResponseBody extends TeaModel {
    // 结果码
    @NameInMap("Code")
    public String code;

    // 结果
    @NameInMap("Data")
    public ValidateStatusResponseBodyData data;

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

    public static ValidateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateStatusResponseBody self = new ValidateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateStatusResponseBody setData(ValidateStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateStatusResponseBodyData getData() {
        return this.data;
    }

    public ValidateStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateStatusResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public ValidateStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateStatusResponseBodyDataAppExtPopList extends TeaModel {
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

        public static ValidateStatusResponseBodyDataAppExtPopList build(java.util.Map<String, ?> map) throws Exception {
            ValidateStatusResponseBodyDataAppExtPopList self = new ValidateStatusResponseBodyDataAppExtPopList();
            return TeaModel.build(map, self);
        }

        public ValidateStatusResponseBodyDataAppExtPopList setExtId(Long extId) {
            this.extId = extId;
            return this;
        }
        public Long getExtId() {
            return this.extId;
        }

        public ValidateStatusResponseBodyDataAppExtPopList setFlowIp(java.util.List<String> flowIp) {
            this.flowIp = flowIp;
            return this;
        }
        public java.util.List<String> getFlowIp() {
            return this.flowIp;
        }

        public ValidateStatusResponseBodyDataAppExtPopList setFlowUrl(java.util.List<String> flowUrl) {
            this.flowUrl = flowUrl;
            return this;
        }
        public java.util.List<String> getFlowUrl() {
            return this.flowUrl;
        }

        public ValidateStatusResponseBodyDataAppExtPopList setOriginalIpList(java.util.List<String> originalIpList) {
            this.originalIpList = originalIpList;
            return this;
        }
        public java.util.List<String> getOriginalIpList() {
            return this.originalIpList;
        }

        public ValidateStatusResponseBodyDataAppExtPopList setOriginalUrlList(java.util.List<String> originalUrlList) {
            this.originalUrlList = originalUrlList;
            return this;
        }
        public java.util.List<String> getOriginalUrlList() {
            return this.originalUrlList;
        }

    }

    public static class ValidateStatusResponseBodyData extends TeaModel {
        @NameInMap("AppExtPopList")
        public java.util.List<ValidateStatusResponseBodyDataAppExtPopList> appExtPopList;

        // 是否处于免流状态，取值范围为true/false
        @NameInMap("FreeFlow")
        public Boolean freeFlow;

        // 伪码
        @NameInMap("PseudoCode")
        public String pseudoCode;

        public static ValidateStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateStatusResponseBodyData self = new ValidateStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateStatusResponseBodyData setAppExtPopList(java.util.List<ValidateStatusResponseBodyDataAppExtPopList> appExtPopList) {
            this.appExtPopList = appExtPopList;
            return this;
        }
        public java.util.List<ValidateStatusResponseBodyDataAppExtPopList> getAppExtPopList() {
            return this.appExtPopList;
        }

        public ValidateStatusResponseBodyData setFreeFlow(Boolean freeFlow) {
            this.freeFlow = freeFlow;
            return this;
        }
        public Boolean getFreeFlow() {
            return this.freeFlow;
        }

        public ValidateStatusResponseBodyData setPseudoCode(String pseudoCode) {
            this.pseudoCode = pseudoCode;
            return this;
        }
        public String getPseudoCode() {
            return this.pseudoCode;
        }

    }

}
