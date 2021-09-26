// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListLogAlarmTasksRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListLogAlarmTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogAlarmTasksRequest self = new ListLogAlarmTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListLogAlarmTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLogAlarmTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
