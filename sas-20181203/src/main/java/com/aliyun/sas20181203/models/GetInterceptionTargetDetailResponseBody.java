// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionTargetDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleTarget")
    public GetInterceptionTargetDetailResponseBodyRuleTarget ruleTarget;

    public static GetInterceptionTargetDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionTargetDetailResponseBody self = new GetInterceptionTargetDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterceptionTargetDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInterceptionTargetDetailResponseBody setRuleTarget(GetInterceptionTargetDetailResponseBodyRuleTarget ruleTarget) {
        this.ruleTarget = ruleTarget;
        return this;
    }
    public GetInterceptionTargetDetailResponseBodyRuleTarget getRuleTarget() {
        return this.ruleTarget;
    }

    public static class GetInterceptionTargetDetailResponseBodyRuleTarget extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ImageList")
        public java.util.List<String> imageList;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        @NameInMap("TargetId")
        public Long targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        public static GetInterceptionTargetDetailResponseBodyRuleTarget build(java.util.Map<String, ?> map) throws Exception {
            GetInterceptionTargetDetailResponseBodyRuleTarget self = new GetInterceptionTargetDetailResponseBodyRuleTarget();
            return TeaModel.build(map, self);
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setImageList(java.util.List<String> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public GetInterceptionTargetDetailResponseBodyRuleTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
