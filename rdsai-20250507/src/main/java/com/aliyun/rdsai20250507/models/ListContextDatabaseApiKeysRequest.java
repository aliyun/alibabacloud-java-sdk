// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseApiKeysRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The member ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mb-cz51tnnp8****</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>(null)</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-as1llqmkol****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListContextDatabaseApiKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseApiKeysRequest self = new ListContextDatabaseApiKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseApiKeysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextDatabaseApiKeysRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ListContextDatabaseApiKeysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextDatabaseApiKeysRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
