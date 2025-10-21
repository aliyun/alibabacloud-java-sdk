// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class FetchSqlPreviewResultsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19426537348647121698828223472</p>
     */
    @NameInMap("queryId")
    public String queryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session</p>
     */
    @NameInMap("sessionClusterName")
    public String sessionClusterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5f581795-4c5b-43f1-bdae-d7b0871080a1</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static FetchSqlPreviewResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchSqlPreviewResultsRequest self = new FetchSqlPreviewResultsRequest();
        return TeaModel.build(map, self);
    }

    public FetchSqlPreviewResultsRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public FetchSqlPreviewResultsRequest setSessionClusterName(String sessionClusterName) {
        this.sessionClusterName = sessionClusterName;
        return this;
    }
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    public FetchSqlPreviewResultsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
