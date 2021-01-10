// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SearchType")
    public String searchType;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest self = new GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsoftimelineRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
