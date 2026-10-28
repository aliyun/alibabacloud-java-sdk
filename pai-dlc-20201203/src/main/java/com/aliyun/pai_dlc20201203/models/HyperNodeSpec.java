// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class HyperNodeSpec extends TeaModel {
    /**
     * <p>The name of the HyperNode.</p>
     * 
     * <strong>example:</strong>
     * <p>mg1234567</p>
     */
    @NameInMap("HyperNodeName")
    public String hyperNodeName;

    /**
     * <p>The comma-separated names of the specified nodes in the HyperNode. If you leave this parameter empty, all nodes in the HyperNode are specified.</p>
     * 
     * <strong>example:</strong>
     * <p>lingjxxxxxxxx</p>
     */
    @NameInMap("NodeNames")
    public String nodeNames;

    public static HyperNodeSpec build(java.util.Map<String, ?> map) throws Exception {
        HyperNodeSpec self = new HyperNodeSpec();
        return TeaModel.build(map, self);
    }

    public HyperNodeSpec setHyperNodeName(String hyperNodeName) {
        this.hyperNodeName = hyperNodeName;
        return this;
    }
    public String getHyperNodeName() {
        return this.hyperNodeName;
    }

    public HyperNodeSpec setNodeNames(String nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public String getNodeNames() {
        return this.nodeNames;
    }

}
