// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListDelegatedServicesForAccountRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138660628348****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListDelegatedServicesForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedServicesForAccountRequest self = new ListDelegatedServicesForAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListDelegatedServicesForAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListDelegatedServicesForAccountRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDelegatedServicesForAccountRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
