// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebCustomDomainOutput extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>A2RN</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The custom domain names.</p>
     */
    @NameInMap("WebCustomDomains")
    public java.util.List<WebCustomDomain> webCustomDomains;

    public static ListWebCustomDomainOutput build(java.util.Map<String, ?> map) throws Exception {
        ListWebCustomDomainOutput self = new ListWebCustomDomainOutput();
        return TeaModel.build(map, self);
    }

    public ListWebCustomDomainOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWebCustomDomainOutput setWebCustomDomains(java.util.List<WebCustomDomain> webCustomDomains) {
        this.webCustomDomains = webCustomDomains;
        return this;
    }
    public java.util.List<WebCustomDomain> getWebCustomDomains() {
        return this.webCustomDomains;
    }

}
