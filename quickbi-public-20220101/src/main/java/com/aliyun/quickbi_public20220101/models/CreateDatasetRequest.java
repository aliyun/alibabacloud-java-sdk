// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D-*****-****-*4FC0C976</p>
     */
    @NameInMap("DsId")
    public String dsId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>st_trd_user_purchase_day_inc</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>asah-fsdfsf*****92342</p>
     */
    @NameInMap("TargetDirectoryId")
    public String targetDirectoryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserDefineCubeName")
    public String userDefineCubeName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>726bee5a-****-43e1-9a8e-b550f0120f35</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public CreateDatasetRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateDatasetRequest setTargetDirectoryId(String targetDirectoryId) {
        this.targetDirectoryId = targetDirectoryId;
        return this;
    }
    public String getTargetDirectoryId() {
        return this.targetDirectoryId;
    }

    public CreateDatasetRequest setUserDefineCubeName(String userDefineCubeName) {
        this.userDefineCubeName = userDefineCubeName;
        return this;
    }
    public String getUserDefineCubeName() {
        return this.userDefineCubeName;
    }

    public CreateDatasetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateDatasetRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
