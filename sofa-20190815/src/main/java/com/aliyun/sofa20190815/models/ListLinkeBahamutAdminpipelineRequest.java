// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAdminpipelineRequest extends TeaModel {
    @NameInMap("IsReleased")
    public String isReleased;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StageType")
    public String stageType;

    @NameInMap("TagsRepeatList")
    public java.util.List<String> tagsRepeatList;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutAdminpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAdminpipelineRequest self = new ListLinkeBahamutAdminpipelineRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAdminpipelineRequest setIsReleased(String isReleased) {
        this.isReleased = isReleased;
        return this;
    }
    public String getIsReleased() {
        return this.isReleased;
    }

    public ListLinkeBahamutAdminpipelineRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListLinkeBahamutAdminpipelineRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListLinkeBahamutAdminpipelineRequest setStageType(String stageType) {
        this.stageType = stageType;
        return this;
    }
    public String getStageType() {
        return this.stageType;
    }

    public ListLinkeBahamutAdminpipelineRequest setTagsRepeatList(java.util.List<String> tagsRepeatList) {
        this.tagsRepeatList = tagsRepeatList;
        return this;
    }
    public java.util.List<String> getTagsRepeatList() {
        return this.tagsRepeatList;
    }

    public ListLinkeBahamutAdminpipelineRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
