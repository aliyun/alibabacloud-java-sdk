// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListMultiAccountTagKeysRequest extends TeaModel {
    /**
     * <p>The matching mode. Valid values:</p>
     * <ul>
     * <li>Equals: equal match</li>
     * <li>Prefix: match by prefix</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Equals</p>
     */
    @NameInMap("MatchType")
    public String matchType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <p>If the total number of entries returned for the current request exceeds the value of the <code>MaxResults</code> parameter, the entries are truncated. In this case, you can use the <code>token</code> to initiate another request and obtain the remaining entries.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search scope. The value of this parameter can be one of the following items:</p>
     * <ul>
     * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched. You can call the <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a> operation to obtain the ID of the resource directory. The ID is indicated by the <code>ResourceDirectoryId</code> parameter in the response of the operation.</li>
     * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched. You can call the <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a> operation to obtain the ID of the Root folder. The ID is indicated by the <code>RootFolderId</code> parameter in the response of the operation.</li>
     * <li>ID of a folder: Resources within all members in the folder are searched. You can call the <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a> operation to obtain the ID of the folder. The ID is indicated by the <code>FolderId</code> parameter in the response of the operation.</li>
     * <li>ID of a member: Resources within the member are searched. You can call the <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a> operation to obtain the ID of the member. The ID is indicated by the <code>AccountId</code> parameter in the response of the operation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rd-r4****</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
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
