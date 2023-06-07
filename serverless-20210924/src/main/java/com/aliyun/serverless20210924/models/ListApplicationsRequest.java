// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListApplicationsRequest extends TeaModel {
    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("filterName")
    public String filterName;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("template")
    public String template;

    public static ListApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsRequest self = new ListApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListApplicationsRequest setFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }
    public String getFilterName() {
        return this.filterName;
    }

    public ListApplicationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
