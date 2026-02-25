// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationsOutput extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>A2RN</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The applications.</p>
     */
    @NameInMap("WebApplicationWithInstanceCount")
    public java.util.List<WebApplicationWithInstanceCount> webApplicationWithInstanceCount;

    public static ListWebApplicationsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationsOutput self = new ListWebApplicationsOutput();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWebApplicationsOutput setWebApplicationWithInstanceCount(java.util.List<WebApplicationWithInstanceCount> webApplicationWithInstanceCount) {
        this.webApplicationWithInstanceCount = webApplicationWithInstanceCount;
        return this;
    }
    public java.util.List<WebApplicationWithInstanceCount> getWebApplicationWithInstanceCount() {
        return this.webApplicationWithInstanceCount;
    }

}
