// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeResourceView extends TeaModel {
    /**
     * <p>资源池行 ID</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("ResourceId")
    public Long resourceId;

    /**
     * <p>资源池类型，取值：train / eval</p>
     * 
     * <strong>example:</strong>
     * <p>train</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>资源规格列表，采用 CustomJob 资源形状（与入参 open_struct_RecipeSpec 同构），回显存储值</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;PodCount&quot;:1,&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;A100&quot;,&quot;QuotaId&quot;:&quot;quotag2uo09dyp40&quot;}]</p>
     */
    @NameInMap("Specs")
    public java.util.List<RecipeSpec> specs;

    public static RecipeResourceView build(java.util.Map<String, ?> map) throws Exception {
        RecipeResourceView self = new RecipeResourceView();
        return TeaModel.build(map, self);
    }

    public RecipeResourceView setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public RecipeResourceView setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public RecipeResourceView setSpecs(java.util.List<RecipeSpec> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<RecipeSpec> getSpecs() {
        return this.specs;
    }

}
