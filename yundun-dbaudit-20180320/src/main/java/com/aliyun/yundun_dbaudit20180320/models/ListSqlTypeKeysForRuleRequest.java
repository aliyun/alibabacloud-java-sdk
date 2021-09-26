// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSqlTypeKeysForRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListSqlTypeKeysForRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSqlTypeKeysForRuleRequest self = new ListSqlTypeKeysForRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListSqlTypeKeysForRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSqlTypeKeysForRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
