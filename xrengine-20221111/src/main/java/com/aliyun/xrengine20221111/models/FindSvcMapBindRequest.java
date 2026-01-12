// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class FindSvcMapBindRequest extends TeaModel {
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

    @NameInMap("SvcId")
    public Long svcId;

    public static FindSvcMapBindRequest build(java.util.Map<String, ?> map) throws Exception {
        FindSvcMapBindRequest self = new FindSvcMapBindRequest();
        return TeaModel.build(map, self);
    }

    public FindSvcMapBindRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public FindSvcMapBindRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public FindSvcMapBindRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public FindSvcMapBindRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public FindSvcMapBindRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public FindSvcMapBindRequest setSvcId(Long svcId) {
        this.svcId = svcId;
        return this;
    }
    public Long getSvcId() {
        return this.svcId;
    }

}
