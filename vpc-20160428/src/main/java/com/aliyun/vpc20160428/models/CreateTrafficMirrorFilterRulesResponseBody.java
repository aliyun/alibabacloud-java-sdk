// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRulesResponseBody extends TeaModel {
    @NameInMap("EgressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesResponseBodyEgressRules> egressRules;

    @NameInMap("IngressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesResponseBodyIngressRules> ingressRules;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTrafficMirrorFilterRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterRulesResponseBody self = new CreateTrafficMirrorFilterRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterRulesResponseBody setEgressRules(java.util.List<CreateTrafficMirrorFilterRulesResponseBodyEgressRules> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRulesResponseBodyEgressRules> getEgressRules() {
        return this.egressRules;
    }

    public CreateTrafficMirrorFilterRulesResponseBody setIngressRules(java.util.List<CreateTrafficMirrorFilterRulesResponseBodyIngressRules> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<CreateTrafficMirrorFilterRulesResponseBodyIngressRules> getIngressRules() {
        return this.ingressRules;
    }

    public CreateTrafficMirrorFilterRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTrafficMirrorFilterRulesResponseBodyEgressRules extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateTrafficMirrorFilterRulesResponseBodyEgressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRulesResponseBodyEgressRules self = new CreateTrafficMirrorFilterRulesResponseBodyEgressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRulesResponseBodyEgressRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateTrafficMirrorFilterRulesResponseBodyIngressRules extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static CreateTrafficMirrorFilterRulesResponseBodyIngressRules build(java.util.Map<String, ?> map) throws Exception {
            CreateTrafficMirrorFilterRulesResponseBodyIngressRules self = new CreateTrafficMirrorFilterRulesResponseBodyIngressRules();
            return TeaModel.build(map, self);
        }

        public CreateTrafficMirrorFilterRulesResponseBodyIngressRules setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
