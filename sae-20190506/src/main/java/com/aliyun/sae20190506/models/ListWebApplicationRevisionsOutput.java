// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationRevisionsOutput extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

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
