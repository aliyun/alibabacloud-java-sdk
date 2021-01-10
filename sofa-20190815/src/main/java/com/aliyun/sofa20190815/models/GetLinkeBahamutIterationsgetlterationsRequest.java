// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetlterationsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IsDeleted")
    public String isDeleted;

    @NameInMap("IsFinished")
    public String isFinished;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ShowAll")
    public String showAll;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutIterationsgetlterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetlterationsRequest self = new GetLinkeBahamutIterationsgetlterationsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public String getIsDeleted() {
        return this.isDeleted;
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setIsFinished(String isFinished) {
        this.isFinished = isFinished;
        return this;
    }
    public String getIsFinished() {
        return this.isFinished;
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setShowAll(String showAll) {
        this.showAll = showAll;
        return this;
    }
    public String getShowAll() {
        return this.showAll;
    }

    public GetLinkeBahamutIterationsgetlterationsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
