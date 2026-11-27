// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RecipeResource extends TeaModel {
    /**
     * <p>The resource pool type. Valid values: train, eval, and inference. If left empty, the storage layer uses the default value based on the associated slot. For training child tables, TrainResource must be set to train and InferenceResource must be set to inference. For evaluation child tables, the resource must be set to eval. Cross-type sharing is not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>train</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The JSON array of resource specifications. It uses the CustomJob resource shape (flat pod_count, ecs_spec, cpu, memory, gpu, gpu_type, shared_memory, and quota_id). It is required and passed through as-is. Currently, the path that starts an RLJob from a Recipe only consumes a single train specification and a single quota, and does not support ecs_spec. Support for multiple specifications, multiple quotas, and ecs_spec will be available when the RLJob side enables these features.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;PodCount&quot;:1,&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;A100&quot;,&quot;QuotaId&quot;:&quot;quotag2uo09dyp40&quot;}]</p>
     */
    @NameInMap("Specs")
    public java.util.List<RecipeSpec> specs;

    public static RecipeResource build(java.util.Map<String, ?> map) throws Exception {
        RecipeResource self = new RecipeResource();
        return TeaModel.build(map, self);
    }

    public RecipeResource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public RecipeResource setSpecs(java.util.List<RecipeSpec> specs) {
        this.specs = specs;
        return this;
    }
    public java.util.List<RecipeSpec> getSpecs() {
        return this.specs;
    }

}
