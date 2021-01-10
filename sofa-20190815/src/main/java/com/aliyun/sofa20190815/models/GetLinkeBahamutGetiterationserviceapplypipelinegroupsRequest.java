// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest self = new GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public GetLinkeBahamutGetiterationserviceapplypipelinegroupsRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
