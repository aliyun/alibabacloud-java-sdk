// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to be returned in a single call when the NextToken parameter is used for the query.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static ListTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsRequest self = new ListTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateVersionsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
