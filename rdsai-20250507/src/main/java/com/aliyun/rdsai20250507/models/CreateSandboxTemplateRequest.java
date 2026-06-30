// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSandboxTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultCpu")
    public String defaultCpu;

    /**
     * <strong>example:</strong>
     * <p>1Gi</p>
     */
    @NameInMap("DefaultMemory")
    public String defaultMemory;

    /**
     * <strong>example:</strong>
     * <p>code-interpreter</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Long replicas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-interpreter</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateSandboxTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxTemplateRequest self = new CreateSandboxTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSandboxTemplateRequest setDefaultCpu(String defaultCpu) {
        this.defaultCpu = defaultCpu;
        return this;
    }
    public String getDefaultCpu() {
        return this.defaultCpu;
    }

    public CreateSandboxTemplateRequest setDefaultMemory(String defaultMemory) {
        this.defaultMemory = defaultMemory;
        return this;
    }
    public String getDefaultMemory() {
        return this.defaultMemory;
    }

    public CreateSandboxTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSandboxTemplateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateSandboxTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSandboxTemplateRequest setReplicas(Long replicas) {
        this.replicas = replicas;
        return this;
    }
    public Long getReplicas() {
        return this.replicas;
    }

    public CreateSandboxTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
