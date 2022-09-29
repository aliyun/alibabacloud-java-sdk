// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMetadataInfosRequest extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("namespace_id")
    public Long namespaceId;

    @NameInMap("namespace_name")
    public String namespaceName;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("org_id")
    public Integer orgId;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("pbc_id")
    public Long pbcId;

    public static ListMetadataInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetadataInfosRequest self = new ListMetadataInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListMetadataInfosRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListMetadataInfosRequest setNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public Long getNamespaceId() {
        return this.namespaceId;
    }

    public ListMetadataInfosRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public ListMetadataInfosRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMetadataInfosRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMetadataInfosRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public ListMetadataInfosRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetadataInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetadataInfosRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

}
