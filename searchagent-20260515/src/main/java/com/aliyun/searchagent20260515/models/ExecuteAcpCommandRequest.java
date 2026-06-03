// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchagent20260515.models;

import com.aliyun.tea.*;

public class ExecuteAcpCommandRequest extends TeaModel {
    @NameInMap("agentName")
    public String agentName;

    @NameInMap("id")
    public String id;

    @NameInMap("jsonrpc")
    public String jsonrpc;

    @NameInMap("method")
    public String method;

    @NameInMap("params")
    public java.util.Map<String, ?> params;

    public static ExecuteAcpCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAcpCommandRequest self = new ExecuteAcpCommandRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAcpCommandRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ExecuteAcpCommandRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecuteAcpCommandRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ExecuteAcpCommandRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ExecuteAcpCommandRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

}
