// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SubmitSqlPreviewRequest extends TeaModel {
    @NameInMap("body")
    public SqlStatementWithContext body;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-session</p>
     */
    @NameInMap("sessionClusterName")
    public String sessionClusterName;

    public static SubmitSqlPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlPreviewRequest self = new SubmitSqlPreviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSqlPreviewRequest setBody(SqlStatementWithContext body) {
        this.body = body;
        return this;
    }
    public SqlStatementWithContext getBody() {
        return this.body;
    }

    public SubmitSqlPreviewRequest setSessionClusterName(String sessionClusterName) {
        this.sessionClusterName = sessionClusterName;
        return this;
    }
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

}
