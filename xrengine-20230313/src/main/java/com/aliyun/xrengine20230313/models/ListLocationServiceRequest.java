// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListLocationServiceRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("SortField")
    public String sortField;

    public static ListLocationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLocationServiceRequest self = new ListLocationServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListLocationServiceRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListLocationServiceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListLocationServiceRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListLocationServiceRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListLocationServiceRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

}
