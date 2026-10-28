// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateAlgorithmCustomizationScriptRequest extends TeaModel {
    /**
     * <p>Specifies whether to generate a deployment script or perform one-click deployment. Valid values:</p>
     * <ul>
     * <li>EasyDeploy: one-click deployment</li>
     * <li>GenerateScript: script generation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EasyDeploy</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The types of fields in the JSON configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;item_table&quot;:&quot;array&quot;}</p>
     */
    @NameInMap("ModuleFieldTypes")
    public java.util.Map<String, ?> moduleFieldTypes;

    public static GenerateAlgorithmCustomizationScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAlgorithmCustomizationScriptRequest self = new GenerateAlgorithmCustomizationScriptRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAlgorithmCustomizationScriptRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public GenerateAlgorithmCustomizationScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateAlgorithmCustomizationScriptRequest setModuleFieldTypes(java.util.Map<String, ?> moduleFieldTypes) {
        this.moduleFieldTypes = moduleFieldTypes;
        return this;
    }
    public java.util.Map<String, ?> getModuleFieldTypes() {
        return this.moduleFieldTypes;
    }

}
