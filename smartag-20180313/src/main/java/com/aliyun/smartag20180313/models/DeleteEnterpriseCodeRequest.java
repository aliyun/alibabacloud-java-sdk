// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseCodeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseCodeRequest self = new DeleteEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public DeleteEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
