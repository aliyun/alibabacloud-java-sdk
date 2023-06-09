// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagValuesRequest extends TeaModel {
    /**
     * <p>The matching mode. Valid values:</p>
     * <br>
     * <p>*   Equals: equal match</p>
     * <p>*   Prefix: match by prefix</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <br>
     * <p>If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the `token` to initiate another request and obtain the remaining entries.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search scope. You can set the value to one of the following items:</p>
     * <br>
     * <p>*   ID of a resource directory: Resources within the management account and all members of the resource directory are searched. You can call the [GetResourceDirectory](~~159995~~) operation to obtain the ID.</p>
     * <p>*   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched. You can call the [ListFoldersForParent](~~159997~~) operation to obtain the ID.</p>
     * <p>*   ID of a folder: Resources within all members in the folder are searched. You can call the [ListFoldersForParent](~~159997~~) operation to obtain the ID.</p>
     * <p>*   ID of a member: Resources within the member are searched. You can call the [ListAccounts](~~160016~~) operation to obtain the ID.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The tag key.</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    /**
     * <p>The tag value.</p>
     */
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
