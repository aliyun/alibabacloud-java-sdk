// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The handling method. Valid values:
    // 
    // *   **1**: Automatically Added to Whitelist
    // *   **2**: Defense Without Notification
    @NameInMap("DisposalWay")
    public String disposalWay;

    // The name of the alert event. The value indicates a subtype.
    @NameInMap("EventName")
    public String eventName;

    // The ID of the request source. Set the value to sas.
    @NameInMap("From")
    public String from;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The condition that is used to query alert events by asset. You can specify a value of the following types:
    // 
    // *   The IP address of the asset.
    // *   The public IP address of the asset.
    // *   The private IP address of the asset.
    // *   The name of the asset.
    @NameInMap("Remark")
    public String remark;

    // The source IP address of the request.
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
