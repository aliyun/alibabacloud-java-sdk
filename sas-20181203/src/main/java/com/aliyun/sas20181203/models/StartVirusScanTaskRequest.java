// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartVirusScanTaskRequest extends TeaModel {
    /**
     * <p>The asset on which you want to perform a virus scan task. You can select servers or server groups to scan for viruses. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><p><strong>type</strong>: the type of the asset on which you want to perform a virus scan task. Valid values:</p>
     * <ul>
     * <li><strong>groupId</strong>: server group.</li>
     * <li><strong>uuid</strong>: server.</li>
     * </ul>
     * </li>
     * <li><p><strong>name</strong>: the name of the server or server group.</p>
     * </li>
     * <li><p><strong>target</strong>: the asset on which you want to perform a virus scan task. Valid values:</p>
     * <ul>
     * <li>If you set <strong>type</strong> to <strong>groupId</strong>, you must set this field to the ID of the server group. You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of server groups.</li>
     * <li>If you set <strong>type</strong> to <strong>uuid</strong>, you must set this field to the UUID of the server. You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;Host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
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
