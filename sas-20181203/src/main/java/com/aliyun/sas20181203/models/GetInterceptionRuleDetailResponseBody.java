// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionRuleDetailResponseBody extends TeaModel {
    @NameInMap("InterceptionRuleDetail")
    public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail interceptionRuleDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInterceptionRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionRuleDetailResponseBody self = new GetInterceptionRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterceptionRuleDetailResponseBody setInterceptionRuleDetail(GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail interceptionRuleDetail) {
        this.interceptionRuleDetail = interceptionRuleDetail;
        return this;
    }
    public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail getInterceptionRuleDetail() {
        return this.interceptionRuleDetail;
    }

    public GetInterceptionRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Ports")
        public java.util.List<String> ports;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("TargetId")
        public Integer targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        public static GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget build(java.util.Map<String, ?> map) throws Exception {
            GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget self = new GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget();
            return TeaModel.build(map, self);
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setPorts(java.util.List<String> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<String> getPorts() {
            return this.ports;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setTargetId(Integer targetId) {
            this.targetId = targetId;
            return this;
        }
        public Integer getTargetId() {
            return this.targetId;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("TargetId")
        public Integer targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        public static GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget build(java.util.Map<String, ?> map) throws Exception {
            GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget self = new GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget();
            return TeaModel.build(map, self);
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setTargetId(Integer targetId) {
            this.targetId = targetId;
            return this;
        }
        public Integer getTargetId() {
            return this.targetId;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail extends TeaModel {
        @NameInMap("DstTarget")
        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget dstTarget;

        @NameInMap("InterceptType")
        public Long interceptType;

        @NameInMap("OrderIndex")
        public Long orderIndex;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("SrcTarget")
        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget srcTarget;

        public static GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail self = new GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail();
            return TeaModel.build(map, self);
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setDstTarget(GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget dstTarget) {
            this.dstTarget = dstTarget;
            return this;
        }
        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget getDstTarget() {
            return this.dstTarget;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setInterceptType(Long interceptType) {
            this.interceptType = interceptType;
            return this;
        }
        public Long getInterceptType() {
            return this.interceptType;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setOrderIndex(Long orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public Long getOrderIndex() {
            return this.orderIndex;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setRuleSwitch(Integer ruleSwitch) {
            this.ruleSwitch = ruleSwitch;
            return this;
        }
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail setSrcTarget(GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget srcTarget) {
            this.srcTarget = srcTarget;
            return this;
        }
        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailSrcTarget getSrcTarget() {
            return this.srcTarget;
        }

    }

}
