// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineWaitingNumberRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AccountName")
    public String accountName;

    public static GetHotlineWaitingNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineWaitingNumberRequest self = new GetHotlineWaitingNumberRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineWaitingNumberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetHotlineWaitingNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHotlineWaitingNumberRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
