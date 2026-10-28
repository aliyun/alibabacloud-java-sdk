// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class AllocatedHyperNodeDetail extends TeaModel {
    /**
     * <p>The number of allocated nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AllocatedNodeNum")
    public Long allocatedNodeNum;

    /**
     * <p>The number of idle nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EmptyNodeNum")
    public Long emptyNodeNum;

    /**
     * <p>The name of the hypernode.</p>
     * 
     * <strong>example:</strong>
     * <p>mg123456</p>
     */
    @NameInMap("HyperNodeName")
    public String hyperNodeName;

    /**
     * <p>The total number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
