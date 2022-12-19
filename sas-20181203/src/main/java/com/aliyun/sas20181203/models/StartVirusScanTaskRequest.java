// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskRequest extends TeaModel {
    // The information about the asset on which you want to perform a virus scan task. You can select servers or server groups to scan for viruses. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
    // 
    // *   **type**: the type of the asset on which you want to perform a virus scan task. Valid values:
    // 
    //     *   **groupId**: server group.
    //     *   **uuid**: server.
    // 
    // *   **name**: the name of the server or server group.
    // 
    // *   **target**: the asset on which you want to perform a virus scan task.
    // 
    //     *   If you set **type** to **groupId**, you must set this field to the ID of the server group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
    //     *   If you set **type** to **uuid**, you must set this field to the UUID of the server. You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
    @NameInMap("TargetInfo")
    public String targetInfo;

    public static StartVirusScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartVirusScanTaskRequest self = new StartVirusScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartVirusScanTaskRequest setTargetInfo(String targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }
    public String getTargetInfo() {
        return this.targetInfo;
    }

}
