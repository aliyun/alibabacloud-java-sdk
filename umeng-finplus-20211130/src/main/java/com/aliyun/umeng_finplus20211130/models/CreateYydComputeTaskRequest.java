// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateYydComputeTaskRequest extends TeaModel {
    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remarks")
    public String remarks;

    @NameInMap("appId")
    public Long appId;

    public static CreateYydComputeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateYydComputeTaskRequest self = new CreateYydComputeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateYydComputeTaskRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public CreateYydComputeTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateYydComputeTaskRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateYydComputeTaskRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

}
