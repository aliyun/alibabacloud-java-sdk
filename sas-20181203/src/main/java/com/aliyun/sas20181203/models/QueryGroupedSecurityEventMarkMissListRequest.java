// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryGroupedSecurityEventMarkMissListRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The handling method. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Automatically Added to Whitelist</li>
     * <li><strong>2</strong>: Defense Without Notification</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DisposalWay")
    public String disposalWay;

    /**
     * <p>The name of the alert event. The value indicates a subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>Login with unusual location</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the request source. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The condition that is used to query alert events by asset. You can specify a value of the following types:</p>
     * <ul>
     * <li>The IP address of the asset.</li>
     * <li>The public IP address of the asset.</li>
     * <li>The private IP address of the asset.</li>
     * <li>The name of the asset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>222.185.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>113.66.XX.XX</p>
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
