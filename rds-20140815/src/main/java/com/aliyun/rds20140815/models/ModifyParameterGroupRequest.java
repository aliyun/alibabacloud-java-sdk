// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupRequest extends TeaModel {
    /**
     * <p>The modification mode of the parameter template. Valid values:</p>
     * <ul>
     * <li><strong>Collectivity</strong> (default): adds new parameters or modifies parameters in the original parameter template.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the ModifyMode parameter to Collectivity, the system adds the value of the <strong>Parameters</strong> parameter to the original parameter template or modifies the corresponding parameters in the original parameter template. Other parameters in the original parameter template are not affected.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Individual</strong>: overwrites original parameters.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the ModifyMode parameter to Individual, the system uses the value of the <strong>Parameters</strong> parameter to overwrite the parameter settings in the original parameter template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Collectivity</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new description of the parameter template. The description can be up to 200 characters in length.</p>
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
     * <p>The parameter template ID. You can call the DescribeParameterGroups operation to query the parameter template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rpg-13ppdh****</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The parameter template name.</p>
     * <ul>
     * <li>The name can contain letters, digits, periods (.), and underscores (_). It must start with a letter.</li>
     * <li>It can be 8 to 64 characters in length.</li>
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
     * <p>A JSON string that consists of parameters and their values in the parameter template. Format: {&quot;Parameter 1&quot;:&quot;Value of Parameter 1&quot;,&quot;Parameter 2&quot;:&quot;Value of Parameter 2&quot;...}. For more information about the parameters that can be modified, see <a href="https://help.aliyun.com/document_detail/96063.html">Modify the parameters of an ApsaraDB RDS for MySQL instance</a> or <a href="https://help.aliyun.com/document_detail/96751.html">Modify the parameters of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If <strong>ModifyMode</strong> is set to <strong>Individual</strong> and this parameter is specified, the new parameters overwrite the parameters in the original parameter template.</p>
     * </li>
     * <li><p>If you set <strong>ModifyMode</strong> to <strong>Collectivity</strong> and specify this parameter, the new parameters are added to the original parameter template, or the parameters in the original parameter template are modified.</p>
     * </li>
     * <li><p>If you do not specify this parameter, the parameters in the original parameter template remain unchanged.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;back_log&quot;:&quot;3000&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <blockquote>
     * <p> The region of a parameter template cannot be changed. You can call the CloneParameterGroup operation to replicate a parameter template to a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.</p>
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
