// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UnbindAgentHotlinePhoneRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

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
