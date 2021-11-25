// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class StartCallV2Request extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JsonMsg")
    public String jsonMsg;

    public static StartCallV2Request build(java.util.Map<String, ?> map) throws Exception {
        StartCallV2Request self = new StartCallV2Request();
        return TeaModel.build(map, self);
    }

    public StartCallV2Request setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartCallV2Request setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartCallV2Request setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartCallV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartCallV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartCallV2Request setJsonMsg(String jsonMsg) {
        this.jsonMsg = jsonMsg;
        return this;
    }
    public String getJsonMsg() {
        return this.jsonMsg;
    }

}
