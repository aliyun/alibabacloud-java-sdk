// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the alert event. The value indicates a subtype.</p>
     */
    @NameInMap("DisposalWay")
    public String disposalWay;

    /**
     * <p>The operator. Valid values:</p>
     * <br>
     * <p>*   **contains**: contains</p>
     * <p>*   **notContains**: does not contain</p>
     * <p>*   **strEqual**: equals</p>
     * <p>*   **strNotEqual**: does not equal</p>
     * <p>*   **regex**: regular expression</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the request source. Set the value to sas.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The status code returned. The status code **200** indicates that the request is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the user.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The field that is used in the whitelist rule.</p>
     */
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
