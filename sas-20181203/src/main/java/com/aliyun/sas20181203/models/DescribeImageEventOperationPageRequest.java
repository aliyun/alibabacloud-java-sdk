// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationPageRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword of the alert item.</p>
     * 
     * <strong>example:</strong>
     * <p>PEM</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the alert item.</p>
     * 
     * <strong>example:</strong>
     * <p>PEM</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The alert type.</p>
     * <ul>
     * <li>Set the value to <strong>sensitiveFile</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sensitiveFile</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The ID of the alert handling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>49616</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source of the alert handling rule. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: image.</li>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

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

    public DescribeImageEventOperationPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
