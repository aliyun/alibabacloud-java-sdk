// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdRequest extends TeaModel {
    // The IDs of alert events. You can specify up to 100 IDs. If you do not specify this parameter, the value of the response parameter **Data** is **false**. The value false indicates that no alert events are generated on the server.
    // 
    // >  You can call the [DescribeAlarmEventList](~~DescribeAlarmEventList~~) operation to query the IDs of alert events.
    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    // The UUID of the server.
    // 
    // >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
    @NameInMap("Uuid")
    public String uuid;

    public static CheckSecurityEventIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdRequest self = new CheckSecurityEventIdRequest();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<String> getSecurityEventIds() {
        return this.securityEventIds;
    }

    public CheckSecurityEventIdRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
