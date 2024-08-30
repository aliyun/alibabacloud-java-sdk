// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodeTypeStatistic extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("CanBeBoundCount")
    public Integer canBeBoundCount;

    /**
     * <strong>example:</strong>
     * <p>ecs.g6.4xlarge</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static NodeTypeStatistic build(java.util.Map<String, ?> map) throws Exception {
        NodeTypeStatistic self = new NodeTypeStatistic();
        return TeaModel.build(map, self);
    }

    public NodeTypeStatistic setCanBeBoundCount(Integer canBeBoundCount) {
        this.canBeBoundCount = canBeBoundCount;
        return this;
    }
    public Integer getCanBeBoundCount() {
        return this.canBeBoundCount;
    }

    public NodeTypeStatistic setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public NodeTypeStatistic setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
