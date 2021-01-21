// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsRequest extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("TemplateId")
    public String templateId;

    public static ListTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsRequest self = new ListTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateVersionsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateVersionsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
