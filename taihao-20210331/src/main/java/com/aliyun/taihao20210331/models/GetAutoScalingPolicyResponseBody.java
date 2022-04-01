// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetAutoScalingPolicyResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetAutoScalingPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingPolicyResponseBody self = new GetAutoScalingPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoScalingPolicyResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public GetAutoScalingPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoScalingPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Data extends TeaModel {
        @NameInMap("clusterId")
        public String clusterId;

        // clusterScriptId
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        // clusterScriptId
        @NameInMap("scalingPolicyId")
        public String scalingPolicyId;

        @NameInMap("scalingRules")
        public java.util.List<ScalingRule> scalingRules;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public Data setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public Data setScalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        public Data setScalingRules(java.util.List<ScalingRule> scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }
        public java.util.List<ScalingRule> getScalingRules() {
            return this.scalingRules;
        }

    }

}
