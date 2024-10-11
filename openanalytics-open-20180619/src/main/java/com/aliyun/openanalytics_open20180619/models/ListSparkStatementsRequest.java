// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkStatementsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202106071620hangzhou00000000001</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static ListSparkStatementsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkStatementsRequest self = new ListSparkStatementsRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkStatementsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
