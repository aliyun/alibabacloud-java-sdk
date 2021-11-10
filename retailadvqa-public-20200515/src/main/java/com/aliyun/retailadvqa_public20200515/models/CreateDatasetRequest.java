// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("DataSet")
    public java.util.Map<String, ?> dataSet;

    @NameInMap("DataSetName")
    public String dataSetName;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateDatasetRequest setDataSet(java.util.Map<String, ?> dataSet) {
        this.dataSet = dataSet;
        return this;
    }
    public java.util.Map<String, ?> getDataSet() {
        return this.dataSet;
    }

    public CreateDatasetRequest setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public CreateDatasetRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateDatasetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDatasetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
