// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotSpotUniqListRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735010351000</p>
     */
    @NameInMap("beg_end")
    public Long begEnd;

    /**
     * <p>The start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735008551000</p>
     */
    @NameInMap("beg_start")
    public Long begStart;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1g2i0siirefgwnnnvy</p>
     */
    @NameInMap("instance")
    public String instance;

    /**
     * <p>The process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("pid")
    public Long pid;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>prof_on</p>
     */
    @NameInMap("table")
    public String table;

    /**
     * <p>The identifier flag.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The default value must be &quot;flag&quot;, which specifies the field to query</p>
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
