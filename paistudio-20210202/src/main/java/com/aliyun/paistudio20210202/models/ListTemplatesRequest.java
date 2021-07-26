// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Source")
    public String source;

    @NameInMap("List")
    public String list;

    @NameInMap("TagId")
    public String tagId;

    @NameInMap("Order")
    public String order;

    @NameInMap("TypeId")
    public String typeId;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListTemplatesRequest setList(String list) {
        this.list = list;
        return this;
    }
    public String getList() {
        return this.list;
    }

    public ListTemplatesRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ListTemplatesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTemplatesRequest setTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }
    public String getTypeId() {
        return this.typeId;
    }

}
