// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleConfigRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("PageSize")
    public String pageSize;

    public static GetModuleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModuleConfigRequest self = new GetModuleConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetModuleConfigRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public GetModuleConfigRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
