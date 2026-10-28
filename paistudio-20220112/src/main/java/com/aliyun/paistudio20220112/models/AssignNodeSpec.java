// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AssignNodeSpec extends TeaModel {
    /**
     * <p>The anti-affinity node names.</p>
     * 
     * <strong>example:</strong>
     * <p>node3</p>
     */
    @NameInMap("AntiAffinityNodeNames")
    public String antiAffinityNodeNames;

    /**
     * <p>Specifies whether to enable the specified node.</p>
     */
    @NameInMap("EnableAssignNode")
    public Boolean enableAssignNode;

    /**
     * <p>The node names.</p>
     * 
     * <strong>example:</strong>
     * <p>lingjxxxx</p>
     */
    @NameInMap("NodeNames")
    public String nodeNames;

    public static AssignNodeSpec build(java.util.Map<String, ?> map) throws Exception {
        AssignNodeSpec self = new AssignNodeSpec();
        return TeaModel.build(map, self);
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

    public AssignNodeSpec setNodeNames(String nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public String getNodeNames() {
        return this.nodeNames;
    }

}
