// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaNodeStatistics extends TeaModel {
    /**
     * <p>The guaranteed minimum number of hyper nodes available in the quota.</p>
     */
    @NameInMap("ActualMinHyperNodeNum")
    public Long actualMinHyperNodeNum;

    /**
     * <p>The guaranteed minimum number of nodes available in the quota.</p>
     */
    @NameInMap("ActualMinNodeNum")
    public Long actualMinNodeNum;

    /**
     * <p>The details of an allocated hyper node.</p>
     */
    @NameInMap("AllocatedHyperNodeDetails")
    public java.util.List<AllocatedHyperNodeDetail> allocatedHyperNodeDetails;

    /**
     * <p>The number of hyper nodes currently allocated from the quota.</p>
     */
    @NameInMap("AllocatedHyperNodeNum")
    public Long allocatedHyperNodeNum;

    /**
     * <p>The number of nodes currently allocated from the quota.</p>
     */
    @NameInMap("AllocatedNodeNum")
    public Long allocatedNodeNum;

    /**
     * <p>The number of allocated nodes currently idle.</p>
     */
    @NameInMap("EmptyNodeNum")
    public Long emptyNodeNum;

    public static QuotaNodeStatistics build(java.util.Map<String, ?> map) throws Exception {
        QuotaNodeStatistics self = new QuotaNodeStatistics();
        return TeaModel.build(map, self);
    }

    public QuotaNodeStatistics setActualMinHyperNodeNum(Long actualMinHyperNodeNum) {
        this.actualMinHyperNodeNum = actualMinHyperNodeNum;
        return this;
    }
    public Long getActualMinHyperNodeNum() {
        return this.actualMinHyperNodeNum;
    }

    public QuotaNodeStatistics setActualMinNodeNum(Long actualMinNodeNum) {
        this.actualMinNodeNum = actualMinNodeNum;
        return this;
    }
    public Long getActualMinNodeNum() {
        return this.actualMinNodeNum;
    }

    public QuotaNodeStatistics setAllocatedHyperNodeDetails(java.util.List<AllocatedHyperNodeDetail> allocatedHyperNodeDetails) {
        this.allocatedHyperNodeDetails = allocatedHyperNodeDetails;
        return this;
    }
    public java.util.List<AllocatedHyperNodeDetail> getAllocatedHyperNodeDetails() {
        return this.allocatedHyperNodeDetails;
    }

    public QuotaNodeStatistics setAllocatedHyperNodeNum(Long allocatedHyperNodeNum) {
        this.allocatedHyperNodeNum = allocatedHyperNodeNum;
        return this;
    }
    public Long getAllocatedHyperNodeNum() {
        return this.allocatedHyperNodeNum;
    }

    public QuotaNodeStatistics setAllocatedNodeNum(Long allocatedNodeNum) {
        this.allocatedNodeNum = allocatedNodeNum;
        return this;
    }
    public Long getAllocatedNodeNum() {
        return this.allocatedNodeNum;
    }

    public QuotaNodeStatistics setEmptyNodeNum(Long emptyNodeNum) {
        this.emptyNodeNum = emptyNodeNum;
        return this;
    }
    public Long getEmptyNodeNum() {
        return this.emptyNodeNum;
    }

}
