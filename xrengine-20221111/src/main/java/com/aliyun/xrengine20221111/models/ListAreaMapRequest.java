// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListAreaMapRequest extends TeaModel {
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

    public static ListAreaMapRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAreaMapRequest self = new ListAreaMapRequest();
        return TeaModel.build(map, self);
    }

    public ListAreaMapRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAreaMapRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListAreaMapRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAreaMapRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListAreaMapRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

}
