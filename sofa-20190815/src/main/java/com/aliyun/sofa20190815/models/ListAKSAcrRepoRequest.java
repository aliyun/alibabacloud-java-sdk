// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrRepoRequest extends TeaModel {
    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("Status")
    public String status;

    public static ListAKSAcrRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrRepoRequest self = new ListAKSAcrRepoRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrRepoRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAKSAcrRepoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAKSAcrRepoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAKSAcrRepoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
