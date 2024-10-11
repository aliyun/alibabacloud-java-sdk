// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetSparkStatementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202106071620hangzhou00000000001</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatementId")
    public Integer statementId;

    public static GetSparkStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkStatementRequest self = new GetSparkStatementRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkStatementRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetSparkStatementRequest setStatementId(Integer statementId) {
        this.statementId = statementId;
        return this;
    }
    public Integer getStatementId() {
        return this.statementId;
    }

}
