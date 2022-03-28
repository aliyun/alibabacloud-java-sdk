// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemosRequest extends TeaModel {
    // 目录
    @NameInMap("Category")
    public String category;

    @NameInMap("DemoName")
    public String demoName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListDemosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDemosRequest self = new ListDemosRequest();
        return TeaModel.build(map, self);
    }

    public ListDemosRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListDemosRequest setDemoName(String demoName) {
        this.demoName = demoName;
        return this;
    }
    public String getDemoName() {
        return this.demoName;
    }

    public ListDemosRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDemosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
