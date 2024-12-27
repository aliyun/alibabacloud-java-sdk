// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotAnalysisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GR</p>
     */
    @NameInMap("appType")
    public String appType;

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
     * <strong>example:</strong>
     * <p>prof_on</p>
     */
    @NameInMap("table")
    public String table;

    public static GetHotspotAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotAnalysisRequest self = new GetHotspotAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetHotspotAnalysisRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetHotspotAnalysisRequest setBegEnd(Long begEnd) {
        this.begEnd = begEnd;
        return this;
    }
    public Long getBegEnd() {
        return this.begEnd;
    }

    public GetHotspotAnalysisRequest setBegStart(Long begStart) {
        this.begStart = begStart;
        return this;
    }
    public Long getBegStart() {
        return this.begStart;
    }

    public GetHotspotAnalysisRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetHotspotAnalysisRequest setPid(Long pid) {
        this.pid = pid;
        return this;
    }
    public Long getPid() {
        return this.pid;
    }

    public GetHotspotAnalysisRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

}
