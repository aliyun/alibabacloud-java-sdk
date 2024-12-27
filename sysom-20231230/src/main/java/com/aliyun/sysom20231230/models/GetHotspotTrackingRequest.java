// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotTrackingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725413948000</p>
     */
    @NameInMap("beg_end")
    public Long begEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725410348000</p>
     */
    @NameInMap("beg_start")
    public Long begStart;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("hot_type")
    public String hotType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2ze5ru5rjurix7f71sxv</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <strong>example:</strong>
     * <p>1657494</p>
     */
    @NameInMap("pid")
    public Long pid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prof_on</p>
     */
    @NameInMap("table")
    public String table;

    public static GetHotspotTrackingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTrackingRequest self = new GetHotspotTrackingRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotTrackingRequest setBegEnd(Long begEnd) {
        this.begEnd = begEnd;
        return this;
    }
    public Long getBegEnd() {
        return this.begEnd;
    }

    public GetHotspotTrackingRequest setBegStart(Long begStart) {
        this.begStart = begStart;
        return this;
    }
    public Long getBegStart() {
        return this.begStart;
    }

    public GetHotspotTrackingRequest setHotType(String hotType) {
        this.hotType = hotType;
        return this;
    }
    public String getHotType() {
        return this.hotType;
    }

    public GetHotspotTrackingRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetHotspotTrackingRequest setPid(Long pid) {
        this.pid = pid;
        return this;
    }
    public Long getPid() {
        return this.pid;
    }

    public GetHotspotTrackingRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
