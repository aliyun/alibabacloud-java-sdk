// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetlterationsbyappgroupRequest extends TeaModel {
    @NameInMap("AppGroupId")
    public String appGroupId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("IsFinished")
    public String isFinished;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ShowAll")
    public String showAll;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutIterationsgetlterationsbyappgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetlterationsbyappgroupRequest self = new GetLinkeBahamutIterationsgetlterationsbyappgroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }
    public String getAppGroupId() {
        return this.appGroupId;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setIsFinished(String isFinished) {
        this.isFinished = isFinished;
        return this;
    }
    public String getIsFinished() {
        return this.isFinished;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setShowAll(String showAll) {
        this.showAll = showAll;
        return this;
    }
    public String getShowAll() {
        return this.showAll;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
