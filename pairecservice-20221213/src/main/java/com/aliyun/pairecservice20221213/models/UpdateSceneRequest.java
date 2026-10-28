// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateSceneRequest extends TeaModel {
    /**
     * <p>The description of the scene.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of flows.</p>
     */
    @NameInMap("Flows")
    public java.util.List<UpdateSceneRequestFlows> flows;

    /**
     * <p>Instance ID of the instance. You can call the ListInstances operation to obtain instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the scene.</p>
     * 
     * <strong>example:</strong>
     * <p>scene1</p>
     */
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
        /**
         * <p>The code of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>liuliang1</p>
         */
        @NameInMap("FlowCode")
        public String flowCode;

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Flow 1</p>
         */
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
