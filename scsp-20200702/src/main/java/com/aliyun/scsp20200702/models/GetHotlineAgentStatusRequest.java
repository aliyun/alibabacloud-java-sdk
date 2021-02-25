// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineAgentStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    public static GetHotlineAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentStatusRequest self = new GetHotlineAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHotlineAgentStatusRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
