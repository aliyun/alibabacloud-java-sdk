// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMaliciousFileWhitelistConfigsRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the alert.</p>
     * <ul>
     * <li>Set the value to ALL, which indicates all alert types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("EventName")
    public String eventName;

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
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The feature to which this operation belongs. If you leave this parameter empty, the default value agentless is used.</p>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListMaliciousFileWhitelistConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMaliciousFileWhitelistConfigsRequest self = new ListMaliciousFileWhitelistConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListMaliciousFileWhitelistConfigsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListMaliciousFileWhitelistConfigsRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public ListMaliciousFileWhitelistConfigsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListMaliciousFileWhitelistConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMaliciousFileWhitelistConfigsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
