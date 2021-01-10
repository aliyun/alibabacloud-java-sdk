// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGlobalreleaseRequest extends TeaModel {
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
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

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

    public static QueryLinkeBahamutGlobalreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGlobalreleaseRequest self = new QueryLinkeBahamutGlobalreleaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGlobalreleaseRequest setAoneReleaseId(String aoneReleaseId) {
        this.aoneReleaseId = aoneReleaseId;
        return this;
    }
    public String getAoneReleaseId() {
        return this.aoneReleaseId;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setParticipationType(String participationType) {
        this.participationType = participationType;
        return this;
    }
    public String getParticipationType() {
        return this.participationType;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public QueryLinkeBahamutGlobalreleaseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
