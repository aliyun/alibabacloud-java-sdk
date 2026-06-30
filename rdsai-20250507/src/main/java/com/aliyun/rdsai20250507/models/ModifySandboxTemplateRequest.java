// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifySandboxTemplateRequest extends TeaModel {
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
     * <p>2</p>
     */
    @NameInMap("Replicas")
    public Long replicas;

    /**
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

    public ModifySandboxTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
