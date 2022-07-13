// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAgentWorkStatusRequest extends TeaModel {
    // 坐席账号名称(唯一值)，外部账号与XP账号的映射
    @NameInMap("AccountName")
    public String accountName;

    // 客户请求唯一id，用于幂等校验，可以用uuid生成
    @NameInMap("ClientToken")
    public String clientToken;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAgentWorkStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentWorkStatusRequest self = new GetAgentWorkStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentWorkStatusRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetAgentWorkStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetAgentWorkStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
