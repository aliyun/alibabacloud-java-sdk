// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasesRequest extends TeaModel {
    @NameInMap("AoneReleaseId")
    public String aoneReleaseId;

    @NameInMap("Field")
    public String field;

    @NameInMap("From")
    public String from;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParticipationType")
    public String participationType;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("To")
    public String to;

    @NameInMap("Type")
    public String type;

    public static QueryLinkeBahamutReleasesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasesRequest self = new QueryLinkeBahamutReleasesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasesRequest setAoneReleaseId(String aoneReleaseId) {
        this.aoneReleaseId = aoneReleaseId;
        return this;
    }
    public String getAoneReleaseId() {
        return this.aoneReleaseId;
    }

    public QueryLinkeBahamutReleasesRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public QueryLinkeBahamutReleasesRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryLinkeBahamutReleasesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutReleasesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutReleasesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryLinkeBahamutReleasesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutReleasesRequest setParticipationType(String participationType) {
        this.participationType = participationType;
        return this;
    }
    public String getParticipationType() {
        return this.participationType;
    }

    public QueryLinkeBahamutReleasesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryLinkeBahamutReleasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkeBahamutReleasesRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryLinkeBahamutReleasesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
