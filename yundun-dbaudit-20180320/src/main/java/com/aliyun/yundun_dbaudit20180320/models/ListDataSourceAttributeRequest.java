// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListDataSourceAttributeRequest extends TeaModel {
    @NameInMap("DbIds")
    public java.util.List<String> dbIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListDataSourceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceAttributeRequest self = new ListDataSourceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceAttributeRequest setDbIds(java.util.List<String> dbIds) {
        this.dbIds = dbIds;
        return this;
    }
    public java.util.List<String> getDbIds() {
        return this.dbIds;
    }

    public ListDataSourceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDataSourceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
