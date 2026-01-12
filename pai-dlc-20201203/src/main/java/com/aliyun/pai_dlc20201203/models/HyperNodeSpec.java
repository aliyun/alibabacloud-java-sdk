// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class HyperNodeSpec extends TeaModel {
    @NameInMap("HyperNodeName")
    public String hyperNodeName;

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
