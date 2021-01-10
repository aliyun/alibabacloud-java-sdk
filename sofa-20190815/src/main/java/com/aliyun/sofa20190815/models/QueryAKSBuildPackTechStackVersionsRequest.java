// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryAKSBuildPackTechStackVersionsRequest extends TeaModel {
    @NameInMap("CafeRegionId")
    public String cafeRegionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TechStack")
    public String techStack;

    public static QueryAKSBuildPackTechStackVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAKSBuildPackTechStackVersionsRequest self = new QueryAKSBuildPackTechStackVersionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAKSBuildPackTechStackVersionsRequest setCafeRegionId(String cafeRegionId) {
        this.cafeRegionId = cafeRegionId;
        return this;
    }
    public String getCafeRegionId() {
        return this.cafeRegionId;
    }

    public QueryAKSBuildPackTechStackVersionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAKSBuildPackTechStackVersionsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryAKSBuildPackTechStackVersionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAKSBuildPackTechStackVersionsRequest setTechStack(String techStack) {
        this.techStack = techStack;
        return this;
    }
    public String getTechStack() {
        return this.techStack;
    }

}
