// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteLoginBaseConfigRequest extends TeaModel {
    // The configuration item that you want to delete. The items vary based on the type of logon configurations. Valid values:
    // 
    // *   **login\_common_ip**: approved logon IP addresses
    // 
    // Example: {"ip":"10.23.23.23"}.
    // 
    // *   **login\_common_time**: approved logon time ranges
    // 
    // Example: {"startTime":"06:00:00","endTime":"16:00:00"}.
    // 
    // *   **login\_common_account**: approved logon accounts
    // 
    // Example: {"account":"test_account\_001"}.
    // 
    // *   **login\_common_location**: approved logon locations
    // 
    // Example: {"location":"Shanghai"}.
    @NameInMap("Config")
    public String config;

    // The UUID of the server whose logon configurations you want to delete.
    // 
    // > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
    @NameInMap("Target")
    public String target;

    // The type of logon configurations to delete. Valid values:
    // 
    // *   **login\_common_ip**: approved logon IP addresses
    // *   **login\_common_time**: approved logon time ranges
    // *   **login\_common_account**: approved logon accounts
    // *   **login\_common_location**: approved logon locations
    @NameInMap("Type")
    public String type;

    public static DeleteLoginBaseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginBaseConfigRequest self = new DeleteLoginBaseConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoginBaseConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DeleteLoginBaseConfigRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public DeleteLoginBaseConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
