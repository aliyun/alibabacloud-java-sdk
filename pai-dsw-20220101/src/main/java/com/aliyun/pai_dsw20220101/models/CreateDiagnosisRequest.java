// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateDiagnosisRequest extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtFailureTime")
    public String gmtFailureTime;

    /**
     * <strong>example:</strong>
     * <p>dsw-5bk19******n97w</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceStartFailed</p>
     */
    @NameInMap("ProblemCategory")
    public String problemCategory;

    public static CreateDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosisRequest self = new CreateDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosisRequest setGmtFailureTime(String gmtFailureTime) {
        this.gmtFailureTime = gmtFailureTime;
        return this;
    }
    public String getGmtFailureTime() {
        return this.gmtFailureTime;
    }

    public CreateDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDiagnosisRequest setProblemCategory(String problemCategory) {
        this.problemCategory = problemCategory;
        return this;
    }
    public String getProblemCategory() {
        return this.problemCategory;
    }

}
