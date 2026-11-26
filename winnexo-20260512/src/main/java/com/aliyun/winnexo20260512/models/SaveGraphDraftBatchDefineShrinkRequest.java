// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftBatchDefineShrinkRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The list of draft change IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[401001, 401002]</p>
     */
    @NameInMap("draftChangeIds")
    public String draftChangeIdsShrink;

    /**
     * <p>The graph name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The save mode.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL_YAML</p>
     */
    @NameInMap("saveMode")
    public String saveMode;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The raw YAML text of the graph schema trimmed by READ permissions, with $ref references retained within the authorized subgraph.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name: crm_graph</p>
     */
    @NameInMap("yamlEdit")
    public String yamlEdit;

    public static SaveGraphDraftBatchDefineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGraphDraftBatchDefineShrinkRequest self = new SaveGraphDraftBatchDefineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveGraphDraftBatchDefineShrinkRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setDraftChangeIdsShrink(String draftChangeIdsShrink) {
        this.draftChangeIdsShrink = draftChangeIdsShrink;
        return this;
    }
    public String getDraftChangeIdsShrink() {
        return this.draftChangeIdsShrink;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setSaveMode(String saveMode) {
        this.saveMode = saveMode;
        return this;
    }
    public String getSaveMode() {
        return this.saveMode;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGraphDraftBatchDefineShrinkRequest setYamlEdit(String yamlEdit) {
        this.yamlEdit = yamlEdit;
        return this;
    }
    public String getYamlEdit() {
        return this.yamlEdit;
    }

}
