// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class ListThreadsShrinkRequest extends TeaModel {
    @NameInMap("filter")
    public String filterShrink;

    @NameInMap("includeMission")
    public Boolean includeMission;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>thread-123123</p>
     */
    @NameInMap("threadId")
    public String threadId;

    public static ListThreadsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListThreadsShrinkRequest self = new ListThreadsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListThreadsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListThreadsShrinkRequest setIncludeMission(Boolean includeMission) {
        this.includeMission = includeMission;
        return this;
    }
    public Boolean getIncludeMission() {
        return this.includeMission;
    }

    public ListThreadsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListThreadsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListThreadsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListThreadsShrinkRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

}
