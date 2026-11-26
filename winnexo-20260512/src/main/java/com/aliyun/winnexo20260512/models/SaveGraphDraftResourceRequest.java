// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftResourceRequest extends TeaModel {
    /**
     * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The element type. Currently, only text is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>object_type</p>
     */
    @NameInMap("elementType")
    public String elementType;

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
     * <p>The resource name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The resource type.</p>
     * <p>This parameter is set to <strong>instance</strong>, which indicates that the resource type is instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>object</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The original YAML text of the graph schema trimmed by READ permissions, with $ref references within the authorized subgraph retained.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name: customer\ndisplay_name: Customer</p>
     */
    @NameInMap("yamlEdit")
    public String yamlEdit;

    public static SaveGraphDraftResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGraphDraftResourceRequest self = new SaveGraphDraftResourceRequest();
        return TeaModel.build(map, self);
    }

    public SaveGraphDraftResourceRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public SaveGraphDraftResourceRequest setElementType(String elementType) {
        this.elementType = elementType;
        return this;
    }
    public String getElementType() {
        return this.elementType;
    }

    public SaveGraphDraftResourceRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public SaveGraphDraftResourceRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public SaveGraphDraftResourceRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public SaveGraphDraftResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public SaveGraphDraftResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public SaveGraphDraftResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGraphDraftResourceRequest setYamlEdit(String yamlEdit) {
        this.yamlEdit = yamlEdit;
        return this;
    }
    public String getYamlEdit() {
        return this.yamlEdit;
    }

}
