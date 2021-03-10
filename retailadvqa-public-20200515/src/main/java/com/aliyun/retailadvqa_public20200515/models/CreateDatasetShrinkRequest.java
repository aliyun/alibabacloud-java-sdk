// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CreateDatasetShrinkRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("DataSet")
    public String dataSetShrink;

    @NameInMap("Type")
    public String type;

    @NameInMap("DataSetName")
    public String dataSetName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetShrinkRequest self = new CreateDatasetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateDatasetShrinkRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public CreateDatasetShrinkRequest setDataSetShrink(String dataSetShrink) {
        this.dataSetShrink = dataSetShrink;
        return this;
    }
    public String getDataSetShrink() {
        return this.dataSetShrink;
    }

    public CreateDatasetShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDatasetShrinkRequest setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public CreateDatasetShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
