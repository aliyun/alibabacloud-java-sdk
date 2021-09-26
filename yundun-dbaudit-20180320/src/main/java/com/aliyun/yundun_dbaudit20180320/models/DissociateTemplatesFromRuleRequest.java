// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DissociateTemplatesFromRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JsonParam")
    public String jsonParam;

    public static DissociateTemplatesFromRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateTemplatesFromRuleRequest self = new DissociateTemplatesFromRuleRequest();
        return TeaModel.build(map, self);
    }

    public DissociateTemplatesFromRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DissociateTemplatesFromRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DissociateTemplatesFromRuleRequest setJsonParam(String jsonParam) {
        this.jsonParam = jsonParam;
        return this;
    }
    public String getJsonParam() {
        return this.jsonParam;
    }

}
