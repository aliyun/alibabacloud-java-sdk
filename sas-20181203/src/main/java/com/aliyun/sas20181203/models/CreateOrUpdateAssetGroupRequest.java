// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAssetGroupRequest extends TeaModel {
    @NameInMap("Uuids")
    public String uuids;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupId")
    public Long groupId;

    public static CreateOrUpdateAssetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAssetGroupRequest self = new CreateOrUpdateAssetGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAssetGroupRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public CreateOrUpdateAssetGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateOrUpdateAssetGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
