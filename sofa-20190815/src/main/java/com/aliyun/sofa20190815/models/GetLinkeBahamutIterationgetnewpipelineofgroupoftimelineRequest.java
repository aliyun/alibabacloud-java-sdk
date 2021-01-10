// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest extends TeaModel {
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

    public static GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest self = new GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest setSearchUserAccount(String searchUserAccount) {
        this.searchUserAccount = searchUserAccount;
        return this;
    }
    public String getSearchUserAccount() {
        return this.searchUserAccount;
    }

    public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
