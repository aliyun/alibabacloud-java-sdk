// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowSankeyExit extends TeaModel {
    /**
     * <p>The number of trajectories on the outflow edge.</p>
     * 
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The key of the outflow source column.</p>
     * 
     * <strong>example:</strong>
     * <p>DataLoader</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The index of the outflow source column (0-based).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FromIdx")
    public Integer fromIdx;

    /**
     * <p>The Chinese name of the outflow destination. Valid values vary by the column where the outflow is located: 在途·未下发 / 在途·生成中 / 在途·待采样 / 在途·待训练.</p>
     * 
     * <strong>example:</strong>
     * <p>生成轨迹</p>
     */
    @NameInMap("Label")
    public String label;

    public static RLFlowSankeyExit build(java.util.Map<String, ?> map) throws Exception {
        RLFlowSankeyExit self = new RLFlowSankeyExit();
        return TeaModel.build(map, self);
    }

    public RLFlowSankeyExit setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public RLFlowSankeyExit setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public RLFlowSankeyExit setFromIdx(Integer fromIdx) {
        this.fromIdx = fromIdx;
        return this;
    }
    public Integer getFromIdx() {
        return this.fromIdx;
    }

    public RLFlowSankeyExit setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

}
