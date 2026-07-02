// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateCubeBySqlRequest extends TeaModel {
    /**
     * <p>The name of the custom dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Caption")
    public String caption;

    /**
     * <p>The custom SQL statement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from qqq</p>
     */
    @NameInMap("CustomSql")
    public String customSql;

    /**
     * <p>The data source ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7AAB95D-*****-****-*4FC0C976</p>
     */
    @NameInMap("DsId")
    public String dsId;

    /**
     * <p>The placeholder parameters. For more information, see the supplementary description below.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;name&quot;: &quot;test&quot;,
     *         &quot;style&quot;: &quot;placeholder&quot;,
     *         &quot;type&quot;: &quot;string&quot;
     *     }
     * ]</p>
     */
    @NameInMap("Placeholders")
    public String placeholders;

    /**
     * <p>The Quick BI UserId of a user who has permissions to create datasets. This is not your Alibaba Cloud account ID. You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=api-workbench.api_explorer.0.0.672f50daGq9ooV&params=%7B%7D&tab=DOC&sdkStyle=old&RegionId=cn-hangzhou">QueryUserInfoByAccount</a> operation to obtain the UserId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdaf-asda*****asd</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The workspace ID.</p>
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

    public CreateCubeBySqlRequest setPlaceholders(String placeholders) {
        this.placeholders = placeholders;
        return this;
    }
    public String getPlaceholders() {
        return this.placeholders;
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
