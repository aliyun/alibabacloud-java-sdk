// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckTypesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskId")
    public Long riskId;

    @NameInMap("ShowChecks")
    public Boolean showChecks;

    @NameInMap("Source")
    public String source;

    @NameInMap("Uuid")
    public String uuid;

    public static ListCheckTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckTypesRequest self = new ListCheckTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckTypesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckTypesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckTypesRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public ListCheckTypesRequest setShowChecks(Boolean showChecks) {
        this.showChecks = showChecks;
        return this;
    }
    public Boolean getShowChecks() {
        return this.showChecks;
    }

    public ListCheckTypesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListCheckTypesRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
