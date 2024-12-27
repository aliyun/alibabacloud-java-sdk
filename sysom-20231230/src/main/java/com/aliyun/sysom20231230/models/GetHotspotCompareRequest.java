// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotCompareRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725415774000</p>
     */
    @NameInMap("beg1_end")
    public Long beg1End;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725415474000</p>
     */
    @NameInMap("beg1_start")
    public Long beg1Start;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725415774000</p>
     */
    @NameInMap("beg2_end")
    public Long beg2End;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725415474000</p>
     */
    @NameInMap("beg2_start")
    public Long beg2Start;

    @NameInMap("hot_type")
    public String hotType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zei55fwj8nnu31h3z46&quot;</p>
     */
    @NameInMap("instance1")
    public String instance1;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("instance2")
    public String instance2;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pid1")
    public Long pid1;

    /**
     * <strong>example:</strong>
     * <p>i-2zei55fwj8nnu31h3z46</p>
     */
    @NameInMap("pid2")
    public Long pid2;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prof_on</p>
     */
    @NameInMap("table")
    public String table;

    public static GetHotspotCompareRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotCompareRequest self = new GetHotspotCompareRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotCompareRequest setBeg1End(Long beg1End) {
        this.beg1End = beg1End;
        return this;
    }
    public Long getBeg1End() {
        return this.beg1End;
    }

    public GetHotspotCompareRequest setBeg1Start(Long beg1Start) {
        this.beg1Start = beg1Start;
        return this;
    }
    public Long getBeg1Start() {
        return this.beg1Start;
    }

    public GetHotspotCompareRequest setBeg2End(Long beg2End) {
        this.beg2End = beg2End;
        return this;
    }
    public Long getBeg2End() {
        return this.beg2End;
    }

    public GetHotspotCompareRequest setBeg2Start(Long beg2Start) {
        this.beg2Start = beg2Start;
        return this;
    }
    public Long getBeg2Start() {
        return this.beg2Start;
    }

    public GetHotspotCompareRequest setHotType(String hotType) {
        this.hotType = hotType;
        return this;
    }
    public String getHotType() {
        return this.hotType;
    }

    public GetHotspotCompareRequest setInstance1(String instance1) {
        this.instance1 = instance1;
        return this;
    }
    public String getInstance1() {
        return this.instance1;
    }

    public GetHotspotCompareRequest setInstance2(String instance2) {
        this.instance2 = instance2;
        return this;
    }
    public String getInstance2() {
        return this.instance2;
    }

    public GetHotspotCompareRequest setPid1(Long pid1) {
        this.pid1 = pid1;
        return this;
    }
    public Long getPid1() {
        return this.pid1;
    }

    public GetHotspotCompareRequest setPid2(Long pid2) {
        this.pid2 = pid2;
        return this;
    }
    public Long getPid2() {
        return this.pid2;
    }

    public GetHotspotCompareRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
