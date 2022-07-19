// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeCasComputersRequest extends TeaModel {
    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<String> appServiceIdsRepeatList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Workspace")
    public String workspace;

    public static DescribeCasComputersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasComputersRequest self = new DescribeCasComputersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasComputersRequest setAppServiceIdsRepeatList(java.util.List<String> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public DescribeCasComputersRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCasComputersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCasComputersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCasComputersRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
