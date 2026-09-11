// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGraphDraftResourceRequest extends TeaModel {
    /**
     * <p>资源小类：resourceType=object 时固定 object_type；resourceType=element 时为 indicator / logic / process / rule / analysis 之一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>object_type</p>
     */
    @NameInMap("elementType")
    public String elementType;

    /**
     * <p>图谱名称，须已存在（active 记录）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm_graph</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>资源名（创建后不可改名，底层校验）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>资源大类：object（对象）/ element（业务元素）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>object</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>单资源 YAML 文本</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name: customer\ndisplay_name: 客户</p>
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
