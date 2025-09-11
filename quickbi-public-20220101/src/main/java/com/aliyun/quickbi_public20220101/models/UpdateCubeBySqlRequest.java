// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateCubeBySqlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from sdsd</p>
     */
    @NameInMap("CustomSql")
    public String customSql;

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
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateCubeBySqlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCubeBySqlRequest self = new UpdateCubeBySqlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCubeBySqlRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public UpdateCubeBySqlRequest setCustomSql(String customSql) {
        this.customSql = customSql;
        return this;
    }
    public String getCustomSql() {
        return this.customSql;
    }

    public UpdateCubeBySqlRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public UpdateCubeBySqlRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateCubeBySqlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
