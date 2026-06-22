// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetGroupRequest extends TeaModel {
    /**
     * <p>The ID of the new group to which you want to assign the servers.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the group IDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9586199</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>10.12.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUIDs of the servers whose group you want to modify. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>076a446d-df7d-424c-bdc5-bb5dc7f1****</p>
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
