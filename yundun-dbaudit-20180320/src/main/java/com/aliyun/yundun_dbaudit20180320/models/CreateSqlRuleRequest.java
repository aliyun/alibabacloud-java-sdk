// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSqlRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JsonParam")
    public String jsonParam;

    public static CreateSqlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlRuleRequest self = new CreateSqlRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSqlRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSqlRuleRequest setJsonParam(String jsonParam) {
        this.jsonParam = jsonParam;
        return this;
    }
    public String getJsonParam() {
        return this.jsonParam;
    }

}
