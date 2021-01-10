// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllattachablereleaseRequest extends TeaModel {
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

    public static GetLinkeBahamutAllattachablereleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllattachablereleaseRequest self = new GetLinkeBahamutAllattachablereleaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllattachablereleaseRequest setAoneReleaseId(String aoneReleaseId) {
        this.aoneReleaseId = aoneReleaseId;
        return this;
    }
    public String getAoneReleaseId() {
        return this.aoneReleaseId;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setParticipationType(String participationType) {
        this.participationType = participationType;
        return this;
    }
    public String getParticipationType() {
        return this.participationType;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public GetLinkeBahamutAllattachablereleaseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
