// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailWithChannelRequest extends TeaModel {
    // 坐席账号名称(唯一值)，外部账号与XP账号登录名的映射
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineAgentDetailWithChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailWithChannelRequest self = new GetHotlineAgentDetailWithChannelRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailWithChannelRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetHotlineAgentDetailWithChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetHotlineAgentDetailWithChannelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
