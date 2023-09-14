// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateSceneRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Flows")
    public java.util.List<UpdateSceneRequestFlows> flows;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    public static UpdateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneRequest self = new UpdateSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSceneRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSceneRequest setFlows(java.util.List<UpdateSceneRequestFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<UpdateSceneRequestFlows> getFlows() {
        return this.flows;
    }

    public UpdateSceneRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateSceneRequestFlows extends TeaModel {
        @NameInMap("FlowCode")
        public String flowCode;

        @NameInMap("FlowName")
        public String flowName;

        public static UpdateSceneRequestFlows build(java.util.Map<String, ?> map) throws Exception {
            UpdateSceneRequestFlows self = new UpdateSceneRequestFlows();
            return TeaModel.build(map, self);
        }

        public UpdateSceneRequestFlows setFlowCode(String flowCode) {
            this.flowCode = flowCode;
            return this;
        }
        public String getFlowCode() {
            return this.flowCode;
        }

        public UpdateSceneRequestFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

}
