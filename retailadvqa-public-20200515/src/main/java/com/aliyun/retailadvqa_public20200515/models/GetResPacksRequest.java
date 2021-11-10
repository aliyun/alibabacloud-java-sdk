// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetResPacksRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Template")
    public String template;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetResPacksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResPacksRequest self = new GetResPacksRequest();
        return TeaModel.build(map, self);
    }

    public GetResPacksRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetResPacksRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetResPacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetResPacksRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetResPacksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetResPacksRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public GetResPacksRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
