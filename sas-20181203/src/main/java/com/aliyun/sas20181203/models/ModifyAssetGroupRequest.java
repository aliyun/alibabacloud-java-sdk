// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetGroupRequest extends TeaModel {
    // The ID of the new server group to which the servers belong.
    // 
    // >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
    @NameInMap("GroupId")
    public Long groupId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The UUIDs of the servers for which you want to change the server group. Separate multiple UUIDs with commas (,).
    // 
    // >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
    @NameInMap("Uuids")
    public String uuids;

    public static ModifyAssetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetGroupRequest self = new ModifyAssetGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAssetGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ModifyAssetGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAssetGroupRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
