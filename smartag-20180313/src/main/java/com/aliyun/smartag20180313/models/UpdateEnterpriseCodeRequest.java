// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseCodeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseCodeRequest self = new UpdateEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public UpdateEnterpriseCodeRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdateEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
