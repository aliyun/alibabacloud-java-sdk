// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchProjectsByRegionRequest extends TeaModel {
    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("Region")
    public String region;

    @NameInMap("Status")
    public String status;

    @NameInMap("ToPage")
    public Integer toPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static SearchProjectsByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchProjectsByRegionRequest self = new SearchProjectsByRegionRequest();
        return TeaModel.build(map, self);
    }

    public SearchProjectsByRegionRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public SearchProjectsByRegionRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SearchProjectsByRegionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SearchProjectsByRegionRequest setToPage(Integer toPage) {
        this.toPage = toPage;
        return this;
    }
    public Integer getToPage() {
        return this.toPage;
    }

    public SearchProjectsByRegionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
