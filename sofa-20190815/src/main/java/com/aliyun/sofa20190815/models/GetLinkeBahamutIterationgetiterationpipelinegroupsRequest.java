// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationpipelinegroupsRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutIterationgetiterationpipelinegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationpipelinegroupsRequest self = new GetLinkeBahamutIterationgetiterationpipelinegroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public GetLinkeBahamutIterationgetiterationpipelinegroupsRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
