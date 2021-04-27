// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartChatWorkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // accountName
    @NameInMap("AccountName")
    public String accountName;

    public static StartChatWorkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartChatWorkRequest self = new StartChatWorkRequest();
        return TeaModel.build(map, self);
    }

    public StartChatWorkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartChatWorkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
