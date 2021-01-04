// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGEnterpriseCodeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EnterpriseCode")
    public String enterpriseCode;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static UpdateSmartAGEnterpriseCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGEnterpriseCodeRequest self = new UpdateSmartAGEnterpriseCodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGEnterpriseCodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAGEnterpriseCodeRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public UpdateSmartAGEnterpriseCodeRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UpdateSmartAGEnterpriseCodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSmartAGEnterpriseCodeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
