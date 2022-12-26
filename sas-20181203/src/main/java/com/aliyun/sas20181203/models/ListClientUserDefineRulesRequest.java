// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientUserDefineRulesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public java.util.List<Integer> type;

    public static ListClientUserDefineRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClientUserDefineRulesRequest self = new ListClientUserDefineRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListClientUserDefineRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClientUserDefineRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClientUserDefineRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClientUserDefineRulesRequest setType(java.util.List<Integer> type) {
        this.type = type;
        return this;
    }
    public java.util.List<Integer> getType() {
        return this.type;
    }

}
