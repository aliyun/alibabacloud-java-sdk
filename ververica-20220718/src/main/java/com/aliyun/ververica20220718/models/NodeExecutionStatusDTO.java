// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class NodeExecutionStatusDTO extends TeaModel {
    @NameInMap("executionId")
    public String executionId;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("resourceId")
    public String resourceId;

    @NameInMap("status")
    public String status;

    @NameInMap("type")
    public String type;

    @NameInMap("workspace")
    public String workspace;

    public static NodeExecutionStatusDTO build(java.util.Map<String, ?> map) throws Exception {
        NodeExecutionStatusDTO self = new NodeExecutionStatusDTO();
        return TeaModel.build(map, self);
    }

    public NodeExecutionStatusDTO setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public NodeExecutionStatusDTO setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public NodeExecutionStatusDTO setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public NodeExecutionStatusDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NodeExecutionStatusDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public NodeExecutionStatusDTO setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
