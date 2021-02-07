// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeConfigTemplatesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateSearch")
    public String templateSearch;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeConfigTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigTemplatesRequest self = new DescribeConfigTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigTemplatesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeConfigTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DescribeConfigTemplatesRequest setTemplateSearch(String templateSearch) {
        this.templateSearch = templateSearch;
        return this;
    }
    public String getTemplateSearch() {
        return this.templateSearch;
    }

    public DescribeConfigTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConfigTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConfigTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
