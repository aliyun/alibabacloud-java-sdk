// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CancelSqlPreviewRequest extends TeaModel {
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
     * <p>a737f33bbdb7419db9ee8037bb51e73a</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static CancelSqlPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSqlPreviewRequest self = new CancelSqlPreviewRequest();
        return TeaModel.build(map, self);
    }

    public CancelSqlPreviewRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public CancelSqlPreviewRequest setSessionClusterName(String sessionClusterName) {
        this.sessionClusterName = sessionClusterName;
        return this;
    }
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    public CancelSqlPreviewRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
