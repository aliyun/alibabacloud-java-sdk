// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotSpotUniqListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735010351000</p>
     */
    @NameInMap("beg_end")
    public Long begEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735008551000</p>
     */
    @NameInMap("beg_start")
    public Long begStart;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g2i0siirefgwnnnvy</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("pid")
    public Long pid;

    /**
     * <strong>example:</strong>
     * <p>prof_on</p>
     */
    @NameInMap("table")
    public String table;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("uniq")
    public String uniq;

    public static GetHotSpotUniqListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotSpotUniqListRequest self = new GetHotSpotUniqListRequest();
        return TeaModel.build(map, self);
    }

    public GetHotSpotUniqListRequest setBegEnd(Long begEnd) {
        this.begEnd = begEnd;
        return this;
    }
    public Long getBegEnd() {
        return this.begEnd;
    }

    public GetHotSpotUniqListRequest setBegStart(Long begStart) {
        this.begStart = begStart;
        return this;
    }
    public Long getBegStart() {
        return this.begStart;
    }

    public GetHotSpotUniqListRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetHotSpotUniqListRequest setPid(Long pid) {
        this.pid = pid;
        return this;
    }
    public Long getPid() {
        return this.pid;
    }

    public GetHotSpotUniqListRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public GetHotSpotUniqListRequest setUniq(String uniq) {
        this.uniq = uniq;
        return this;
    }
    public String getUniq() {
        return this.uniq;
    }

}
