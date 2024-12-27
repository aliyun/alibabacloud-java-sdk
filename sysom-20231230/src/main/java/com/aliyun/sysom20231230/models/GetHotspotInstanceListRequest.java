// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotInstanceListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725413947000</p>
     */
    @NameInMap("beg_end")
    public Long begEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1725413647000</p>
     */
    @NameInMap("beg_start")
    public Long begStart;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prof_on</p>
     */
    @NameInMap("table")
    public String table;

    public static GetHotspotInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotInstanceListRequest self = new GetHotspotInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotInstanceListRequest setBegEnd(Long begEnd) {
        this.begEnd = begEnd;
        return this;
    }
    public Long getBegEnd() {
        return this.begEnd;
    }

    public GetHotspotInstanceListRequest setBegStart(Long begStart) {
        this.begStart = begStart;
        return this;
    }
    public Long getBegStart() {
        return this.begStart;
    }

    public GetHotspotInstanceListRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
