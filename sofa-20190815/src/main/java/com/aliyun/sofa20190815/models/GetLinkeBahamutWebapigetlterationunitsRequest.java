// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlterationunitsRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IsFinished")
    public String isFinished;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ShowAll")
    public String showAll;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutWebapigetlterationunitsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlterationunitsRequest self = new GetLinkeBahamutWebapigetlterationunitsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setIsFinished(String isFinished) {
        this.isFinished = isFinished;
        return this;
    }
    public String getIsFinished() {
        return this.isFinished;
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setShowAll(String showAll) {
        this.showAll = showAll;
        return this;
    }
    public String getShowAll() {
        return this.showAll;
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public GetLinkeBahamutWebapigetlterationunitsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
