// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupRequest extends TeaModel {
    /**
     * <p>The modification mode of the parameter template. Valid values:</p>
     * <ul>
     * <li><p><strong>Collectivity</strong>: adds or modifies parameters. This is the default value.</p>
     * <blockquote>
     * <p>The parameters specified in the <strong>Parameters</strong> parameter are added to the current parameter template, or the existing parameters in the current parameter template are modified. Other parameters in the current parameter template remain unaffected.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>Individual</strong>: overwrites parameters.</p>
     * <blockquote>
     * <p>The content in the current parameter template is replaced with the content specified in the <strong>Parameters</strong> parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Collectivity</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the parameter template. The description must be 0 to 200 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the original description of the parameter template is retained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    /**
     * <p>The ID of the parameter template. You can call the DescribeParameterGroups operation to query the ID of the parameter template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-13ppdh****</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The name of the parameter template.</p>
     * <ul>
     * <li>The name must start with a letter and can contain letters, digits, periods (.), and underscores (_).</li>
     * <li>The name must be 8 to 64 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the original name of the parameter template is retained.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testgroup1</p>
     */
    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    /**
     * <p>The JSON string of parameters and values. Format: {&quot;Parameter 1&quot;:&quot;Value 1&quot;,&quot;Parameter 2&quot;:&quot;Value 2&quot;...}. For more information about the parameters that can be modified, see <a href="https://help.aliyun.com/document_detail/96063.html">Set the parameters of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/96751.html">Set the parameters of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If the <strong>ModifyMode</strong> parameter is set to <strong>Individual</strong>, the specified parameters overwrite the original parameters in the parameter template.</li>
     * <li>If the <strong>ModifyMode</strong> parameter is set to <strong>Collectivity</strong>, the specified parameters are added to or modified in the original parameter template.</li>
     * <li>If you do not specify this parameter, the original parameters are retained.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;back_log&quot;:&quot;3000&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * <blockquote>
     * <p>The region of a parameter template cannot be modified. You can call the CloneParameterGroup operation to copy the parameter template to another region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can call the DescribeDBInstanceAttribute operation to query the ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterGroupRequest self = new ModifyParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParameterGroupRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyParameterGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyParameterGroupRequest setParameterGroupDesc(String parameterGroupDesc) {
        this.parameterGroupDesc = parameterGroupDesc;
        return this;
    }
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    public ModifyParameterGroupRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyParameterGroupRequest setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public ModifyParameterGroupRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyParameterGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyParameterGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyParameterGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
