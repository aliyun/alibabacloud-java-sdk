// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateOutboundCallRestrictionRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The outbound call restriction.</p>
     */
    @NameInMap("OutboundCallRestriction")
    public java.util.List<CreateOutboundCallRestrictionRequestOutboundCallRestriction> outboundCallRestriction;

    /**
     * <p>The policy. Valid values:
     * 0: blacklist.
     * 1: whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Policy")
    public Integer policy;

    public static CreateOutboundCallRestrictionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOutboundCallRestrictionRequest self = new CreateOutboundCallRestrictionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOutboundCallRestrictionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOutboundCallRestrictionRequest setOutboundCallRestriction(java.util.List<CreateOutboundCallRestrictionRequestOutboundCallRestriction> outboundCallRestriction) {
        this.outboundCallRestriction = outboundCallRestriction;
        return this;
    }
    public java.util.List<CreateOutboundCallRestrictionRequestOutboundCallRestriction> getOutboundCallRestriction() {
        return this.outboundCallRestriction;
    }

    public CreateOutboundCallRestrictionRequest setPolicy(Integer policy) {
        this.policy = policy;
        return this;
    }
    public Integer getPolicy() {
        return this.policy;
    }

    public static class CreateOutboundCallRestrictionRequestOutboundCallRestriction extends TeaModel {
        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>02032734241</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Do-not-disturb user</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static CreateOutboundCallRestrictionRequestOutboundCallRestriction build(java.util.Map<String, ?> map) throws Exception {
            CreateOutboundCallRestrictionRequestOutboundCallRestriction self = new CreateOutboundCallRestrictionRequestOutboundCallRestriction();
            return TeaModel.build(map, self);
        }

        public CreateOutboundCallRestrictionRequestOutboundCallRestriction setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public CreateOutboundCallRestrictionRequestOutboundCallRestriction setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
