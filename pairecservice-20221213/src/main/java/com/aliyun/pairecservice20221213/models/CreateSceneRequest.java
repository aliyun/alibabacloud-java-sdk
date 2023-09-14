// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateSceneRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Flows")
    public java.util.List<CreateSceneRequestFlows> flows;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    public static CreateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRequest self = new CreateSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateSceneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSceneRequest setFlows(java.util.List<CreateSceneRequestFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<CreateSceneRequestFlows> getFlows() {
        return this.flows;
    }

    public CreateSceneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateSceneRequestFlows extends TeaModel {
        @NameInMap("FlowCode")
        public String flowCode;

        @NameInMap("FlowName")
        public String flowName;

        public static CreateSceneRequestFlows build(java.util.Map<String, ?> map) throws Exception {
            CreateSceneRequestFlows self = new CreateSceneRequestFlows();
            return TeaModel.build(map, self);
        }

        public CreateSceneRequestFlows setFlowCode(String flowCode) {
            this.flowCode = flowCode;
            return this;
        }
        public String getFlowCode() {
            return this.flowCode;
        }

        public CreateSceneRequestFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

}
