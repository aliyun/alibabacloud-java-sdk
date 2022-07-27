// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("TemplateName")
    public String templateName;

    public static ListTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsRequest self = new ListTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplateVersionsRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListTemplateVersionsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
