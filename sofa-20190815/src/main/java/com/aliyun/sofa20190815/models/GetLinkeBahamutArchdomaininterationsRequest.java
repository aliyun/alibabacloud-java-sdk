// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomaininterationsRequest extends TeaModel {
    @NameInMap("ArchDomainExternalId")
    public String archDomainExternalId;

    @NameInMap("Field")
    public String field;

    @NameInMap("Finished")
    public String finished;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutArchdomaininterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomaininterationsRequest self = new GetLinkeBahamutArchdomaininterationsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomaininterationsRequest setArchDomainExternalId(String archDomainExternalId) {
        this.archDomainExternalId = archDomainExternalId;
        return this;
    }
    public String getArchDomainExternalId() {
        return this.archDomainExternalId;
    }

    public GetLinkeBahamutArchdomaininterationsRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public GetLinkeBahamutArchdomaininterationsRequest setFinished(String finished) {
        this.finished = finished;
        return this;
    }
    public String getFinished() {
        return this.finished;
    }

    public GetLinkeBahamutArchdomaininterationsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLinkeBahamutArchdomaininterationsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutArchdomaininterationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutArchdomaininterationsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
