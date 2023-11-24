// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationPageRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword of the alert item.</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the alert item.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The alert type.</p>
     * <br>
     * <p>*   Set the value to **sensitiveFile**.</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the alert handling rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeImageEventOperationPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageEventOperationPageRequest self = new DescribeImageEventOperationPageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageEventOperationPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageEventOperationPageRequest setEventKey(String eventKey) {
        this.eventKey = eventKey;
        return this;
    }
    public String getEventKey() {
        return this.eventKey;
    }

    public DescribeImageEventOperationPageRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeImageEventOperationPageRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeImageEventOperationPageRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeImageEventOperationPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageEventOperationPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
