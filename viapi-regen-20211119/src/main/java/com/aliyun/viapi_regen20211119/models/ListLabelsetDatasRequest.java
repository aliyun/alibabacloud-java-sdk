// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ListLabelsetDatasRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("LabelId")
    public Long labelId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Value")
    public String value;

    public static ListLabelsetDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabelsetDatasRequest self = new ListLabelsetDatasRequest();
        return TeaModel.build(map, self);
    }

    public ListLabelsetDatasRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListLabelsetDatasRequest setLabelId(Long labelId) {
        this.labelId = labelId;
        return this;
    }
    public Long getLabelId() {
        return this.labelId;
    }

    public ListLabelsetDatasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLabelsetDatasRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ListLabelsetDatasRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLabelsetDatasRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
