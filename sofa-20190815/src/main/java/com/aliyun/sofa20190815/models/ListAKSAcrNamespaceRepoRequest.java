// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrNamespaceRepoRequest extends TeaModel {
    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("Status")
    public String status;

    public static ListAKSAcrNamespaceRepoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrNamespaceRepoRequest self = new ListAKSAcrNamespaceRepoRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrNamespaceRepoRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAKSAcrNamespaceRepoRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAKSAcrNamespaceRepoRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAKSAcrNamespaceRepoRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public ListAKSAcrNamespaceRepoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
