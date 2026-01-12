// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class AssignNodeSpec extends TeaModel {
    @NameInMap("AntiAffinityHyperNodes")
    public java.util.List<HyperNodeSpec> antiAffinityHyperNodes;

    /**
     * <strong>example:</strong>
     * <p>lingjxxxxxxxx</p>
     */
    @NameInMap("AntiAffinityNodeNames")
    public String antiAffinityNodeNames;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAssignNode")
    public Boolean enableAssignNode;

    @NameInMap("HyperNodes")
    public java.util.List<HyperNodeSpec> hyperNodes;

    /**
     * <strong>example:</strong>
     * <p>lingjxxxxxxxx</p>
     */
    @NameInMap("NodeNames")
    public String nodeNames;

    public static AssignNodeSpec build(java.util.Map<String, ?> map) throws Exception {
        AssignNodeSpec self = new AssignNodeSpec();
        return TeaModel.build(map, self);
    }

    public AssignNodeSpec setAntiAffinityHyperNodes(java.util.List<HyperNodeSpec> antiAffinityHyperNodes) {
        this.antiAffinityHyperNodes = antiAffinityHyperNodes;
        return this;
    }
    public java.util.List<HyperNodeSpec> getAntiAffinityHyperNodes() {
        return this.antiAffinityHyperNodes;
    }

    public AssignNodeSpec setAntiAffinityNodeNames(String antiAffinityNodeNames) {
        this.antiAffinityNodeNames = antiAffinityNodeNames;
        return this;
    }
    public String getAntiAffinityNodeNames() {
        return this.antiAffinityNodeNames;
    }

    public AssignNodeSpec setEnableAssignNode(Boolean enableAssignNode) {
        this.enableAssignNode = enableAssignNode;
        return this;
    }
    public Boolean getEnableAssignNode() {
        return this.enableAssignNode;
    }

    public AssignNodeSpec setHyperNodes(java.util.List<HyperNodeSpec> hyperNodes) {
        this.hyperNodes = hyperNodes;
        return this;
    }
    public java.util.List<HyperNodeSpec> getHyperNodes() {
        return this.hyperNodes;
    }

    public AssignNodeSpec setNodeNames(String nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public String getNodeNames() {
        return this.nodeNames;
    }

}
