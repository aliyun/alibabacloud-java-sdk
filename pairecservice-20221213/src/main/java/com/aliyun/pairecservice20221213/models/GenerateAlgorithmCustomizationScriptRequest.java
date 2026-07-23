// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GenerateAlgorithmCustomizationScriptRequest extends TeaModel {
    /**
     * <p>The deployment mode. Valid values:</p>
     * <ul>
     * <li><p><strong>EasyDeploy</strong>: Performs a one-click deployment.</p>
     * </li>
     * <li><p><strong>GenerateScript</strong>: Generates a deployment script.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EasyDeploy</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The ID of the instance. To obtain this ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-test-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The data types of fields in the JSON configuration.</p>
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
