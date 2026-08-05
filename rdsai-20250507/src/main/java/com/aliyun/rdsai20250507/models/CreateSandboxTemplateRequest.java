// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateSandboxTemplateRequest extends TeaModel {
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

    /**
     * <p>The name of the sandbox template.</p>
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
