// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateDatasetRecordRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("DatasetRecord")
    public String datasetRecord;

    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateDatasetRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRecordRequest self = new CreateDatasetRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRecordRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public CreateDatasetRecordRequest setDatasetRecord(String datasetRecord) {
        this.datasetRecord = datasetRecord;
        return this;
    }
    public String getDatasetRecord() {
        return this.datasetRecord;
    }

    public CreateDatasetRecordRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
