// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSandboxTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The number of CPUs for sandboxes created by using this template. Valid values: 1 to 4.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultCpu")
    public String defaultCpu;

    /**
     * <p>The memory size for sandboxes created by using this template. Unit: Gi. Valid values: 1Gi to 8Gi.</p>
     * 
     * <strong>example:</strong>
     * <p>1Gi</p>
     */
    @NameInMap("DefaultMemory")
    public String defaultMemory;

    /**
     * <p>The description of the sandbox template. The description must be unique within the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>code-interpreter</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Image")
    public String image;

    /**
     * <p>The instance ID of the AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of prewarmed sandboxes. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Long replicas;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The name of the sandbox template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-interpreter</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateSandboxTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxTemplateShrinkRequest self = new CreateSandboxTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSandboxTemplateShrinkRequest setDefaultCpu(String defaultCpu) {
        this.defaultCpu = defaultCpu;
        return this;
    }
    public String getDefaultCpu() {
        return this.defaultCpu;
    }

    public CreateSandboxTemplateShrinkRequest setDefaultMemory(String defaultMemory) {
        this.defaultMemory = defaultMemory;
        return this;
    }
    public String getDefaultMemory() {
        return this.defaultMemory;
    }

    public CreateSandboxTemplateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSandboxTemplateShrinkRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateSandboxTemplateShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateSandboxTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSandboxTemplateShrinkRequest setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public CreateSandboxTemplateShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateSandboxTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
