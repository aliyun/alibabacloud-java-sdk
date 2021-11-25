// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class StartChatWorkRequest extends TeaModel {
    // accountName
    @NameInMap("AccountName")
    public String accountName;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartChatWorkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartChatWorkRequest self = new StartChatWorkRequest();
        return TeaModel.build(map, self);
    }

    public StartChatWorkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartChatWorkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
