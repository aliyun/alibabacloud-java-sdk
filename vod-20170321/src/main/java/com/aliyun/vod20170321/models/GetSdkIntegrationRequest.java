// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetSdkIntegrationRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("IntegrationType")
    public String integrationType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Product")
    public String product;

    @NameInMap("SdkCodeId")
    public Integer sdkCodeId;

    public static GetSdkIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSdkIntegrationRequest self = new GetSdkIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public GetSdkIntegrationRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetSdkIntegrationRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public GetSdkIntegrationRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetSdkIntegrationRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetSdkIntegrationRequest setSdkCodeId(Integer sdkCodeId) {
        this.sdkCodeId = sdkCodeId;
        return this;
    }
    public Integer getSdkCodeId() {
        return this.sdkCodeId;
    }

}
