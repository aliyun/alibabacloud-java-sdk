// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyWhitelistTemplateRequest extends TeaModel {
    /**
     * <p>The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The entries in the IP address whitelist must be in one of the following formats:</p>
     * <ul>
     * <li>IP addresses, such as 10.23.XX.XX.</li>
     * <li>CIDR blocks, such as 10.23.XX.XX/24. In this example, 24 indicates that the prefix of the CIDR block is 24-bit in length. You can replace 24 with a value that ranges from 1 to 32.</li>
     * </ul>
     * <blockquote>
     * <p>: A maximum of 1,000 IP addresses or CIDR blocks can be added for each instance. If you want to add a large number of IP addresses, we recommend that you merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139.196.X.X,101.132.X.X</p>
     */
    @NameInMap("IpWhitelist")
    public String ipWhitelist;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see related documentation.</p>
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

    /**
     * <p>The ID of the whitelist template. This parameter is required when you modify or delete a whitelist. You can call the DescribeAllWhitelistTemplate operation to obtain the ID of the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>539</p>
     */
    @NameInMap("TemplateId")
    public Integer templateId;

    /**
     * <p>The name of the IP whitelist. This parameter is required when you create a whitelist. The value of this parameter cannot be modified after the whitelist is created. The value must be unique to an Alibaba Cloud account and start with a letter. You can call the DescribeWhitelistTemplate operation to obtain the name of the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>template_123</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ModifyWhitelistTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhitelistTemplateRequest self = new ModifyWhitelistTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWhitelistTemplateRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public ModifyWhitelistTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyWhitelistTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWhitelistTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyWhitelistTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyWhitelistTemplateRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public ModifyWhitelistTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
