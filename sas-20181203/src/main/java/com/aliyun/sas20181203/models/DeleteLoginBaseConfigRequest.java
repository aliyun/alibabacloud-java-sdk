// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteLoginBaseConfigRequest extends TeaModel {
    /**
     * <p>The content of the logon security settings to delete. The content varies based on the type of the logon security settings. Valid values:</p>
     * <br>
     * <p>*   **login_common_ip**: approved logon IP addresses</p>
     * <br>
     * <p>Example: {"ip":"10.23.23.23"}.</p>
     * <br>
     * <p>*   **login_common_time**: approved logon time ranges</p>
     * <br>
     * <p>Example: {"startTime":"06:00:00","endTime":"16:00:00"}.</p>
     * <br>
     * <p>*   **login_common_account**: approved logon accounts</p>
     * <br>
     * <p>Example: {"account":"test_account_001"}.</p>
     * <br>
     * <p>*   **login_common_location**: approved logon locations</p>
     * <br>
     * <p>Example: {"location":"Shanghai"}.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The UUID of the server whose logon security settings you want to delete.</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the logon security settings to delete. Valid values:</p>
     * <br>
     * <p>*   **login_common_ip**: approved logon IP addresses</p>
     * <p>*   **login_common_time**: approved logon time ranges</p>
     * <p>*   **login_common_account**: approved logon accounts</p>
     * <p>*   **login_common_location**: approved logon locations</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
