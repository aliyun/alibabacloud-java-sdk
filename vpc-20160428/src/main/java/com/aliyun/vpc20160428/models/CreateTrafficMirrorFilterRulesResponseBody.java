// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterRulesResponseBody extends TeaModel {
    /**
     * <p>The list of outbound rules.</p>
     */
    @NameInMap("EgressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesResponseBodyEgressRules> egressRules;

    /**
     * <p>The list of inbound rules.</p>
     */
    @NameInMap("IngressRules")
    public java.util.List<CreateTrafficMirrorFilterRulesResponseBodyIngressRules> ingressRules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>07F272E2-6AD5-433A-8207-A607C76F1676</p>
     */
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
        /**
         * <p>The ID of the outbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tmr-j6cok23ugp53eeib5****</p>
         */
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
        /**
         * <p>The ID of the inbound rule.</p>
         * 
         * <strong>example:</strong>
         * <p>tmr-j6c6rtallo51ouzv3****</p>
         */
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
