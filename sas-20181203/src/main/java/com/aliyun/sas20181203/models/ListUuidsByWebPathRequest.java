// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByWebPathRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public String type;

    @NameInMap("WebPath")
    public String webPath;

    public static ListUuidsByWebPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByWebPathRequest self = new ListUuidsByWebPathRequest();
        return TeaModel.build(map, self);
    }

    public ListUuidsByWebPathRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUuidsByWebPathRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUuidsByWebPathRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListUuidsByWebPathRequest setWebPath(String webPath) {
        this.webPath = webPath;
        return this;
    }
    public String getWebPath() {
        return this.webPath;
    }

}
