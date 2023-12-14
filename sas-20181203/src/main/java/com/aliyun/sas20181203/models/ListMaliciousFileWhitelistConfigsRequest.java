// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMaliciousFileWhitelistConfigsRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the alert.</p>
     * <br>
     * <p>*   Set the value to ALL, which indicates all alert types.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The feature to which this operation belongs. If you leave this parameter empty, the default value agentless is used.</p>
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
