// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchagent20260515.models;

import com.aliyun.tea.*;

public class GenerateAcpCompletionRequest extends TeaModel {
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

    public static GenerateAcpCompletionRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAcpCompletionRequest self = new GenerateAcpCompletionRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAcpCompletionRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public GenerateAcpCompletionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GenerateAcpCompletionRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public GenerateAcpCompletionRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public GenerateAcpCompletionRequest setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

}
