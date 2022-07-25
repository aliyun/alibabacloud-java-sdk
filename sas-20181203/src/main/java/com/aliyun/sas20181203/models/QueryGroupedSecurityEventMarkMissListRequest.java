// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DisposalWay")
    public String disposalWay;

    @NameInMap("EventName")
    public String eventName;

    @NameInMap("From")
    public String from;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static QueryGroupedSecurityEventMarkMissListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupedSecurityEventMarkMissListRequest self = new QueryGroupedSecurityEventMarkMissListRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupedSecurityEventMarkMissListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setDisposalWay(String disposalWay) {
        this.disposalWay = disposalWay;
        return this;
    }
    public String getDisposalWay() {
        return this.disposalWay;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryGroupedSecurityEventMarkMissListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
