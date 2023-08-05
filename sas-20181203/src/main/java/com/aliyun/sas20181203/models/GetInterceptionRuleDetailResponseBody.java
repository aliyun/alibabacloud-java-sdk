// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionRuleDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("InterceptionRuleDetail")
    public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetail interceptionRuleDetail;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>An array that consists of the name of the image specified for the network object.</p>
         */
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        /**
         * <p>The namespace to which the network object belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>An array that consists of the port range of the destination network object.</p>
         */
        @NameInMap("Ports")
        public java.util.List<String> ports;

        /**
         * <p>The type of the rule.</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>An array that consists of the labels specified for the network object.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The ID of the network object.</p>
         */
        @NameInMap("TargetId")
        public Integer targetId;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the network object.</p>
         */
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
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The images of the network object.</p>
         */
        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        /**
         * <p>The namespace to which the network object belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The type of the rule.</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The labels specified for the network object.</p>
         */
        @NameInMap("TagList")
        public java.util.List<String> tagList;

        /**
         * <p>The ID of the network object.</p>
         */
        @NameInMap("TargetId")
        public Integer targetId;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the network object.</p>
         */
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
        /**
         * <p>The destination network object.</p>
         */
        @NameInMap("DstTarget")
        public GetInterceptionRuleDetailResponseBodyInterceptionRuleDetailDstTarget dstTarget;

        /**
         * <p>The interception mode. Valid values:</p>
         * <br>
         * <p>*   **0**: monitor</p>
         * <p>*   **1**: block</p>
         * <p>*   **2**: alert</p>
         * <p>*   **3**: allow</p>
         */
        @NameInMap("InterceptType")
        public Long interceptType;

        /**
         * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         */
        @NameInMap("OrderIndex")
        public Long orderIndex;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the defense rule. Valid values:</p>
         * <br>
         * <p>*   **1**: The rule is enabled.</p>
         * <p>*   **0**: The rule is disabled.</p>
         */
        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **suggest**: a suggestion rule</p>
         * <p>*   **customize**: a custom rule</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The source network object.</p>
         */
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
