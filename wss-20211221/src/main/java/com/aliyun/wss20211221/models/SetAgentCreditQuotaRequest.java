// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class SetAgentCreditQuotaRequest extends TeaModel {
    /**
     * <p>The list of Agent IDs.</p>
     */
    @NameInMap("AgentIds")
    public java.util.List<String> agentIds;

    /**
     * <p>The Agent type.</p>
     * 
     * <strong>example:</strong>
     * <p>JVSClaw</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The credit quota.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CreditQuota")
    public Integer creditQuota;

    /**
     * <p>The operator scenarios type. Valid values:</p>
     * <ul>
     * <li>If this parameter is not specified or is set to NaturalMonthlyOwn: calendar month exclusive.</li>
     * <li>JzYearlyShare: Jiaozi yearly shared.</li>
     * <li>JzYearlyOwn: Jiaozi yearly exclusive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NaturalMonthlyOwn</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

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

    public SetAgentCreditQuotaRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
