// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UnbindPolarClawAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ChannelAccountId")
    public String channelAccountId;

    public static UnbindPolarClawAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPolarClawAgentRequest self = new UnbindPolarClawAgentRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPolarClawAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UnbindPolarClawAgentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UnbindPolarClawAgentRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UnbindPolarClawAgentRequest setChannelAccountId(String channelAccountId) {
        this.channelAccountId = channelAccountId;
        return this;
    }
    public String getChannelAccountId() {
        return this.channelAccountId;
    }

}
