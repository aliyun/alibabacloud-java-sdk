// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCustomerGatewayAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CustomerGatewayId")
    @Validation(required = true)
    public String customerGatewayId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyCustomerGatewayAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerGatewayAttributeRequest self = new ModifyCustomerGatewayAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomerGatewayAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCustomerGatewayAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyCustomerGatewayAttributeRequest setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    public ModifyCustomerGatewayAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCustomerGatewayAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
