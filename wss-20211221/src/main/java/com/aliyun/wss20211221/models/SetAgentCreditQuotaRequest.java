// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class SetAgentCreditQuotaRequest extends TeaModel {
    @NameInMap("AgentIds")
    public java.util.List<String> agentIds;

    /**
     * <strong>example:</strong>
     * <p>JVSClaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CreditQuota")
    public Integer creditQuota;

    public static SetAgentCreditQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAgentCreditQuotaRequest self = new SetAgentCreditQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetAgentCreditQuotaRequest setAgentIds(java.util.List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<String> getAgentIds() {
        return this.agentIds;
    }

    public SetAgentCreditQuotaRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public SetAgentCreditQuotaRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SetAgentCreditQuotaRequest setCreditQuota(Integer creditQuota) {
        this.creditQuota = creditQuota;
        return this;
    }
    public Integer getCreditQuota() {
        return this.creditQuota;
    }

}
