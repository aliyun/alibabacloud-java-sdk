// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplatePageListRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Event code.</p>
     * 
     * <strong>example:</strong>
     * <p>d6_h1fe4cfa1g</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Event name</p>
     * 
     * <strong>example:</strong>
     * <p>注册事件</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>Event template search field</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("templateSearchItem")
    public String templateSearchItem;

    /**
     * <p>Event status</p>
     * 
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("templateStatus")
    public String templateStatus;

    /**
     * <p>Template type</p>
     * 
     * <strong>example:</strong>
     * <p>PUB_SERVICE</p>
     */
    @NameInMap("templateType")
    public String templateType;

    public static DescribeTemplatePageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatePageListRequest self = new DescribeTemplatePageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatePageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTemplatePageListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTemplatePageListRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeTemplatePageListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatePageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeTemplatePageListRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DescribeTemplatePageListRequest setTemplateSearchItem(String templateSearchItem) {
        this.templateSearchItem = templateSearchItem;
        return this;
    }
    public String getTemplateSearchItem() {
        return this.templateSearchItem;
    }

    public DescribeTemplatePageListRequest setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public DescribeTemplatePageListRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
