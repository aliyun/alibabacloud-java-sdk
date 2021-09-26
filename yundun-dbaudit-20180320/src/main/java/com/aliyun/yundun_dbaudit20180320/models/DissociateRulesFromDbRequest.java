// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DissociateRulesFromDbRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JsonParam")
    public String jsonParam;

    public static DissociateRulesFromDbRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateRulesFromDbRequest self = new DissociateRulesFromDbRequest();
        return TeaModel.build(map, self);
    }

    public DissociateRulesFromDbRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateRulesFromDbRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DissociateRulesFromDbRequest setJsonParam(String jsonParam) {
        this.jsonParam = jsonParam;
        return this;
    }
    public String getJsonParam() {
        return this.jsonParam;
    }

}
