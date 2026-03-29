// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateDataDiagnosisJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DataDiagnosisId")
    public String dataDiagnosisId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-01</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static CreateDataDiagnosisJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataDiagnosisJobsRequest self = new CreateDataDiagnosisJobsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataDiagnosisJobsRequest setDataDiagnosisId(String dataDiagnosisId) {
        this.dataDiagnosisId = dataDiagnosisId;
        return this;
    }
    public String getDataDiagnosisId() {
        return this.dataDiagnosisId;
    }

    public CreateDataDiagnosisJobsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateDataDiagnosisJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDataDiagnosisJobsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
