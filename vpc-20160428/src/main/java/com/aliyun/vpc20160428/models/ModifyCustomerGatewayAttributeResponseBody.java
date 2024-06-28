// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCustomerGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>The timestamp generated when the customer gateway was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1492747187000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The ID of the customer gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>cgw-bp1pvpl9r9adju6l5****</p>
     */
    @NameInMap("CustomerGatewayId")
    public String customerGatewayId;

    /**
     * <p>The description of the customer gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The public IP address of the gateway device in the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>139.32.XX.XX</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The name of the customer gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8AA5CE21-2E6A-4530-BDF5-F055849476E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the customer gateway belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyCustomerGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerGatewayAttributeResponseBody self = new ModifyCustomerGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomerGatewayAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyCustomerGatewayAttributeResponseBody setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyCustomerGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCustomerGatewayAttributeResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public ModifyCustomerGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCustomerGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCustomerGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
