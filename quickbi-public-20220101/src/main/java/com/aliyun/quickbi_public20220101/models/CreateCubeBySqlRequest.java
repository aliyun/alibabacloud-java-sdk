// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateCubeBySqlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from qqq</p>
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
     * <p>asdaf-asda*****asd</p>
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

    public static CreateCubeBySqlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCubeBySqlRequest self = new CreateCubeBySqlRequest();
        return TeaModel.build(map, self);
    }

    public CreateCubeBySqlRequest setCaption(String caption) {
        this.caption = caption;
        return this;
    }
    public String getCaption() {
        return this.caption;
    }

    public CreateCubeBySqlRequest setCustomSql(String customSql) {
        this.customSql = customSql;
        return this;
    }
    public String getCustomSql() {
        return this.customSql;
    }

    public CreateCubeBySqlRequest setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public CreateCubeBySqlRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateCubeBySqlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
