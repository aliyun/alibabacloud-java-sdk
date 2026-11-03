// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationRevisionsOutput extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>A2RN</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The versions.</p>
     */
    @NameInMap("Revisions")
    public java.util.List<Revision> revisions;

    public static ListWebApplicationRevisionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationRevisionsOutput self = new ListWebApplicationRevisionsOutput();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationRevisionsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWebApplicationRevisionsOutput setRevisions(java.util.List<Revision> revisions) {
        this.revisions = revisions;
        return this;
    }
    public java.util.List<Revision> getRevisions() {
        return this.revisions;
    }

}
