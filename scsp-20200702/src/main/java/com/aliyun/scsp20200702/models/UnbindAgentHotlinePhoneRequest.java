// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UnbindAgentHotlinePhoneRequest extends TeaModel {
    // 坐席账号名称(唯一值)，外部账号与XP账号登录名的映射
    @NameInMap("AccountName")
    public String accountName;

    // 客户请求唯一id，用于幂等校验，可以用uuid生成
    @NameInMap("ClientToken")
    public String clientToken;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    public static UnbindAgentHotlinePhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAgentHotlinePhoneRequest self = new UnbindAgentHotlinePhoneRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAgentHotlinePhoneRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public UnbindAgentHotlinePhoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UnbindAgentHotlinePhoneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
