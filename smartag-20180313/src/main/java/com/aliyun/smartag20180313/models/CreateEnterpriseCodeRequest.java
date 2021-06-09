// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateEnterpriseCodeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseCodeRequest self = new CreateEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public CreateEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
