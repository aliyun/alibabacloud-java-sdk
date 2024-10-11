// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ExecuteSparkStatementRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>print(2+2)\n</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202106071620hangzhou****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>sql</p>
     */
    @NameInMap("Kind")
    public String kind;

    public static ExecuteSparkStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSparkStatementRequest self = new ExecuteSparkStatementRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteSparkStatementRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteSparkStatementRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ExecuteSparkStatementRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

}
