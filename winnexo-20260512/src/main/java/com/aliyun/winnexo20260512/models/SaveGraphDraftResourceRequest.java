// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftResourceRequest extends TeaModel {
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
