// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDomainsRequest extends TeaModel {
    @NameInMap("limit")
    public Long limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("parent_domain_id")
    public String parentDomainId;

    public static ListDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsRequest self = new ListDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListDomainsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListDomainsRequest setParentDomainId(String parentDomainId) {
        this.parentDomainId = parentDomainId;
        return this;
    }
    public String getParentDomainId() {
        return this.parentDomainId;
    }

}
