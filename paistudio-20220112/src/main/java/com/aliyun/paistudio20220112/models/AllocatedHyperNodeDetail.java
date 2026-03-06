// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AllocatedHyperNodeDetail extends TeaModel {
    @NameInMap("AllocatedNodeNum")
    public Long allocatedNodeNum;

    @NameInMap("EmptyNodeNum")
    public Long emptyNodeNum;

    @NameInMap("HyperNodeName")
    public String hyperNodeName;

    @NameInMap("TotalNodeNum")
    public Long totalNodeNum;

    public static AllocatedHyperNodeDetail build(java.util.Map<String, ?> map) throws Exception {
        AllocatedHyperNodeDetail self = new AllocatedHyperNodeDetail();
        return TeaModel.build(map, self);
    }

    public AllocatedHyperNodeDetail setAllocatedNodeNum(Long allocatedNodeNum) {
        this.allocatedNodeNum = allocatedNodeNum;
        return this;
    }
    public Long getAllocatedNodeNum() {
        return this.allocatedNodeNum;
    }

    public AllocatedHyperNodeDetail setEmptyNodeNum(Long emptyNodeNum) {
        this.emptyNodeNum = emptyNodeNum;
        return this;
    }
    public Long getEmptyNodeNum() {
        return this.emptyNodeNum;
    }

    public AllocatedHyperNodeDetail setHyperNodeName(String hyperNodeName) {
        this.hyperNodeName = hyperNodeName;
        return this;
    }
    public String getHyperNodeName() {
        return this.hyperNodeName;
    }

    public AllocatedHyperNodeDetail setTotalNodeNum(Long totalNodeNum) {
        this.totalNodeNum = totalNodeNum;
        return this;
    }
    public Long getTotalNodeNum() {
        return this.totalNodeNum;
    }

}
