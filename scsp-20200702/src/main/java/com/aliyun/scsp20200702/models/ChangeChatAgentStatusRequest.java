// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ChangeChatAgentStatusRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Method")
    public String method;

    public static ChangeChatAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeChatAgentStatusRequest self = new ChangeChatAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeChatAgentStatusRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ChangeChatAgentStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ChangeChatAgentStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeChatAgentStatusRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
