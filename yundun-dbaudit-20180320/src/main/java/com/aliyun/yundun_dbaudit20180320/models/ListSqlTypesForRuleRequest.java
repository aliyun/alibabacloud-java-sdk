// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSqlTypesForRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TypeId")
    public String typeId;

    @NameInMap("Sqltype1")
    public String sqltype1;

    @NameInMap("KeyWorld")
    public String keyWorld;

    public static ListSqlTypesForRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSqlTypesForRuleRequest self = new ListSqlTypesForRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListSqlTypesForRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSqlTypesForRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSqlTypesForRuleRequest setTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }
    public String getTypeId() {
        return this.typeId;
    }

    public ListSqlTypesForRuleRequest setSqltype1(String sqltype1) {
        this.sqltype1 = sqltype1;
        return this;
    }
    public String getSqltype1() {
        return this.sqltype1;
    }

    public ListSqlTypesForRuleRequest setKeyWorld(String keyWorld) {
        this.keyWorld = keyWorld;
        return this;
    }
    public String getKeyWorld() {
        return this.keyWorld;
    }

}
