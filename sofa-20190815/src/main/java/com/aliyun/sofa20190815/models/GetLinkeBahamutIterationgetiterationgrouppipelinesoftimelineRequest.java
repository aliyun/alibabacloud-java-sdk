// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest extends TeaModel {
    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PipelineInstanceId")
    public String pipelineInstanceId;

    @NameInMap("SearchUserAccount")
    public String searchUserAccount;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("UnitId")
    public String unitId;

    public static GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest self = new GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest setSearchUserAccount(String searchUserAccount) {
        this.searchUserAccount = searchUserAccount;
        return this;
    }
    public String getSearchUserAccount() {
        return this.searchUserAccount;
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public GetLinkeBahamutIterationgetiterationgrouppipelinesoftimelineRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
