// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class CancelSparkStatementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202106071620hangzhou****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026****</p>
     */
    @NameInMap("StatementId")
    public String statementId;

    public static CancelSparkStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSparkStatementRequest self = new CancelSparkStatementRequest();
        return TeaModel.build(map, self);
    }

    public CancelSparkStatementRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelSparkStatementRequest setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    public String getStatementId() {
        return this.statementId;
    }

}
