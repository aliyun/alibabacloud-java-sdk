// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetGroupRequest extends TeaModel {
    /**
     * <p>The ID of the new server group to which the servers belong.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUIDs of the servers for which you want to change the server group. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
