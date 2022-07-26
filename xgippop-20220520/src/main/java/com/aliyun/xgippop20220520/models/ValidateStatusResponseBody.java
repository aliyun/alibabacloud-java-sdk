// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ValidateStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ValidateStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rt")
    public Long rt;

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

    public static class SdkValidateStatusResponseBodyDataAppExtPopList extends TeaModel {
        @NameInMap("ExtId")
        public Long extId;

        @NameInMap("FlowIp")
        public java.util.List<String> flowIp;

        @NameInMap("FlowUrl")
        public java.util.List<String> flowUrl;

        @NameInMap("OriginalIpList")
        public java.util.List<String> originalIpList;

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

        @NameInMap("FreeFlow")
        public Boolean freeFlow;

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

    public static class ValidateStatusResponseBodyDataAppExtPopList extends TeaModel {
        @NameInMap("ExtId")
        public Long extId;

        @NameInMap("FlowIp")
        public java.util.List<String> flowIp;

        @NameInMap("FlowUrl")
        public java.util.List<String> flowUrl;

        @NameInMap("OriginalIpList")
        public java.util.List<String> originalIpList;

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

        @NameInMap("FreeFlow")
        public Boolean freeFlow;

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
