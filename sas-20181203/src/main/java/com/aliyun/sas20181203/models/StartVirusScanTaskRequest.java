// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskRequest extends TeaModel {
    /**
     * <p>The asset on which you want to perform a virus scan task. You can select servers or server groups to scan for viruses. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>*   **type**: the type of the asset on which you want to perform a virus scan task. Valid values:</p>
     * <br>
     * <p>    *   **groupId**: server group.</p>
     * <p>    *   **uuid**: server.</p>
     * <br>
     * <p>*   **name**: the name of the server or server group.</p>
     * <br>
     * <p>*   **target**: the asset on which you want to perform a virus scan task. Valid values:</p>
     * <br>
     * <p>    *   If you set **type** to **groupId**, you must set this field to the ID of the server group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.</p>
     * <p>    *   If you set **type** to **uuid**, you must set this field to the UUID of the server. You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
