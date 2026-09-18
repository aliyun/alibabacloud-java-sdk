// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftBatchDefineRequest extends TeaModel {
    /**
     * <p>The list of draft change IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[401001, 401002]</p>
     */
    @NameInMap("draftChangeIds")
    public java.util.List<Long> draftChangeIds;

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

    public static SaveGraphDraftBatchDefineRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGraphDraftBatchDefineRequest self = new SaveGraphDraftBatchDefineRequest();
        return TeaModel.build(map, self);
    }

    public SaveGraphDraftBatchDefineRequest setDraftChangeIds(java.util.List<Long> draftChangeIds) {
        this.draftChangeIds = draftChangeIds;
        return this;
    }
    public java.util.List<Long> getDraftChangeIds() {
        return this.draftChangeIds;
    }

    public SaveGraphDraftBatchDefineRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public SaveGraphDraftBatchDefineRequest setSaveMode(String saveMode) {
        this.saveMode = saveMode;
        return this;
    }
    public String getSaveMode() {
        return this.saveMode;
    }

    public SaveGraphDraftBatchDefineRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveGraphDraftBatchDefineRequest setYamlEdit(String yamlEdit) {
        this.yamlEdit = yamlEdit;
        return this;
    }
    public String getYamlEdit() {
        return this.yamlEdit;
    }

}
