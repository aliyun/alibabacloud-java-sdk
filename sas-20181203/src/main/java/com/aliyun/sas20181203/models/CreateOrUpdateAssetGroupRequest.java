// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAssetGroupRequest extends TeaModel {
    /**
     * <p>The ID of the server group for which you want to add to or remove servers.</p>
     * <br>
     * <p>>  To modify the mapping between an asset and an asset group, you must provide the ID of the asset group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) to query the IDs of asset groups. If you do not configure this parameter when you call this operation, an asset group is created.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The name of the server group that you want to create or the server group for which you want to add or remove a server.</p>
     * <br>
     * <p>>  To modify the mapping between a server and a server group, you must provide the name of the server group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the names of server groups. If you do not configure GroupID when you call this operation, a server group is created. In this case, you must configure GroupName.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The UUID of the server in the server group that you want to create or the server group for which you want to add or remove servers. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static CreateOrUpdateAssetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAssetGroupRequest self = new CreateOrUpdateAssetGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAssetGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateAssetGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOrUpdateAssetGroupRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
