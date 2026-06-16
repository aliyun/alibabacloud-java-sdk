// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplatePageListRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>The event code.</p>
     * 
     * <strong>example:</strong>
     * <p>d6_h1fe4cfa1g</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The event name.</p>
     * 
     * <strong>example:</strong>
     * <p>注册事件</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The search field for event templates.</p>
     * 
     * <strong>example:</strong>
     * <p>age</p>
     */
    @NameInMap("templateSearchItem")
    public String templateSearchItem;

    /**
     * <p>The event status.</p>
     * 
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("templateStatus")
    public String templateStatus;

    /**
     * <p>The templatetype.</p>
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
