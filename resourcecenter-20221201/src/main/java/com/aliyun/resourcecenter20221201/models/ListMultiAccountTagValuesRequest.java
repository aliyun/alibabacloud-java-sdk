// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagValuesRequest extends TeaModel {
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

    @NameInMap("TagValue")
    public String tagValue;

    public static ListMultiAccountTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiAccountTagValuesRequest self = new ListMultiAccountTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiAccountTagValuesRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public ListMultiAccountTagValuesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMultiAccountTagValuesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMultiAccountTagValuesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListMultiAccountTagValuesRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public ListMultiAccountTagValuesRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
