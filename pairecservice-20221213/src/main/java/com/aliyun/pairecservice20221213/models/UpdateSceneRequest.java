// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateSceneRequest extends TeaModel {
    /**
     * <p>The scene description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The flows.</p>
     */
    @NameInMap("Flows")
    public java.util.List<UpdateSceneRequestFlows> flows;

    /**
     * <p>The instance ID. To obtain the ID, call the <code>ListInstances</code> API.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-abcdefg1234</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The scene name.</p>
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
         * <p>The flow code.</p>
         * 
         * <strong>example:</strong>
         * <p>liuliang1</p>
         */
        @NameInMap("FlowCode")
        public String flowCode;

        /**
         * <p>The flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>流量1</p>
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
