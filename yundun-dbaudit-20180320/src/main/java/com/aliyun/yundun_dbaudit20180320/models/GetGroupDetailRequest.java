// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetGroupDetailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupKeyId")
    public String groupKeyId;

    @NameInMap("GroupType")
    public String groupType;

    public static GetGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupDetailRequest self = new GetGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetGroupDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetGroupDetailRequest setGroupKeyId(String groupKeyId) {
        this.groupKeyId = groupKeyId;
        return this;
    }
    public String getGroupKeyId() {
        return this.groupKeyId;
    }

    public GetGroupDetailRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

}
