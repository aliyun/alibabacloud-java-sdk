// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class RegisterInstanceRequest extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("source")
    public String source;

    @NameInMap("description")
    public String description;

    @NameInMap("params")
    public String params;

    public static RegisterInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterInstanceRequest self = new RegisterInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RegisterInstanceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RegisterInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RegisterInstanceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public RegisterInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegisterInstanceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
