// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGEnterpriseCodeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    public static UpdateSmartAGEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGEnterpriseCodeRequest self = new UpdateSmartAGEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSmartAGEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public UpdateSmartAGEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAGEnterpriseCodeRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
