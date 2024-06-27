// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTemplatePageListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("templateSearchItem")
    public String templateSearchItem;

    @NameInMap("templateStatus")
    public String templateStatus;

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
