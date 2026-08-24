// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifySandboxTemplateRequest extends TeaModel {
    /**
     * <p>The number of CPUs for sandboxes created from this template. Valid values: 1 to 4.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultCpu")
    public String defaultCpu;

    /**
     * <p>The memory size for sandboxes created from this template. Unit: Gi. Valid values: 1Gi to 8Gi.</p>
     * 
     * <strong>example:</strong>
     * <p>1Gi</p>
     */
    @NameInMap("DefaultMemory")
    public String defaultMemory;

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
     * <p>The initial number of instances. Valid values: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Replicas")
    public Long replicas;

    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The sandbox template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>desktop-xxx</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static ModifySandboxTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySandboxTemplateRequest self = new ModifySandboxTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifySandboxTemplateRequest setDefaultCpu(String defaultCpu) {
        this.defaultCpu = defaultCpu;
        return this;
    }
    public String getDefaultCpu() {
        return this.defaultCpu;
    }

    public ModifySandboxTemplateRequest setDefaultMemory(String defaultMemory) {
        this.defaultMemory = defaultMemory;
        return this;
    }
    public String getDefaultMemory() {
        return this.defaultMemory;
    }

    public ModifySandboxTemplateRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ModifySandboxTemplateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifySandboxTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySandboxTemplateRequest setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public ModifySandboxTemplateRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public ModifySandboxTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
