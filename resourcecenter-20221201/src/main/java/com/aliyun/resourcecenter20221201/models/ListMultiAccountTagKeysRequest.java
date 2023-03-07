// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagKeysRequest extends TeaModel {
    @NameInMap("MatchType")
    public String matchType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("TagKey")
    public String tagKey;

    public static ListMultiAccountTagKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountTagKeysRequest self = new ListMultiAccountTagKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountTagKeysRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public ListMultiAccountTagKeysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountTagKeysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountTagKeysRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListMultiAccountTagKeysRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

}
