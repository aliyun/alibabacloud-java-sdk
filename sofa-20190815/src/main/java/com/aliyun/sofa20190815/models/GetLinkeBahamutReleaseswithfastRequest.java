// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaseswithfastRequest extends TeaModel {
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

    public static GetLinkeBahamutReleaseswithfastRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaseswithfastRequest self = new GetLinkeBahamutReleaseswithfastRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaseswithfastRequest setAoneReleaseId(String aoneReleaseId) {
        this.aoneReleaseId = aoneReleaseId;
        return this;
    }
    public String getAoneReleaseId() {
        return this.aoneReleaseId;
    }

    public GetLinkeBahamutReleaseswithfastRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public GetLinkeBahamutReleaseswithfastRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetLinkeBahamutReleaseswithfastRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutReleaseswithfastRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLinkeBahamutReleaseswithfastRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutReleaseswithfastRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutReleaseswithfastRequest setParticipationType(String participationType) {
        this.participationType = participationType;
        return this;
    }
    public String getParticipationType() {
        return this.participationType;
    }

    public GetLinkeBahamutReleaseswithfastRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLinkeBahamutReleaseswithfastRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutReleaseswithfastRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public GetLinkeBahamutReleaseswithfastRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
