// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteLoginBaseConfigRequest extends TeaModel {
    /**
     * <p>The content of the logon security settings to delete. The content varies based on the type of the logon security settings. Valid values:</p>
     * <ul>
     * <li><strong>login_common_ip</strong>: approved logon IP addresses</li>
     * </ul>
     * <p>Example: {&quot;ip&quot;:&quot;10.23.23.23&quot;}.</p>
     * <ul>
     * <li><strong>login_common_time</strong>: approved logon time ranges</li>
     * </ul>
     * <p>Example: {&quot;startTime&quot;:&quot;06:00:00&quot;,&quot;endTime&quot;:&quot;16:00:00&quot;}.</p>
     * <ul>
     * <li><strong>login_common_account</strong>: approved logon accounts</li>
     * </ul>
     * <p>Example: {&quot;account&quot;:&quot;test_account_001&quot;}.</p>
     * <ul>
     * <li><strong>login_common_location</strong>: approved logon locations</li>
     * </ul>
     * <p>Example: {&quot;location&quot;:&quot;Shanghai&quot;}.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;startTime&quot;:&quot;06:00:00&quot;,&quot;endTime&quot;:&quot;16:00:00&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The UUID of the server whose logon security settings you want to delete.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The type of the logon security settings to delete. Valid values:</p>
     * <ul>
     * <li><strong>login_common_ip</strong>: approved logon IP addresses</li>
     * <li><strong>login_common_time</strong>: approved logon time ranges</li>
     * <li><strong>login_common_account</strong>: approved logon accounts</li>
     * <li><strong>login_common_location</strong>: approved logon locations</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>login_common_time</p>
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
