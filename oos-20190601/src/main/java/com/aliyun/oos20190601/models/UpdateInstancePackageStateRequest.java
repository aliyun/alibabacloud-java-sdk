// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateInstancePackageStateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>install</p>
     */
    @NameInMap("ConfigureAction")
    public String configureAction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1jaxa2bs4bps7*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;username&quot;: &quot;xx&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-ECS-InventoryDataCollection</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateInstancePackageStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePackageStateRequest self = new UpdateInstancePackageStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePackageStateRequest setConfigureAction(String configureAction) {
        this.configureAction = configureAction;
        return this;
    }
    public String getConfigureAction() {
        return this.configureAction;
    }

    public UpdateInstancePackageStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstancePackageStateRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public UpdateInstancePackageStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstancePackageStateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateInstancePackageStateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
