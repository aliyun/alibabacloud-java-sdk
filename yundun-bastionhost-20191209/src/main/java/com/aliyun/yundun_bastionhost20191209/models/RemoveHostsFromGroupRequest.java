// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupRequest extends TeaModel {
    /**
     * <p>The return code that indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **OK**: The call was successful.</p>
     * <p>*   **UNEXPECTED**: An unknown error occurred.</p>
     * <p>*   **INVALID_ARGUMENT**: A request parameter is invalid.</p>
     * <p>*   **OBJECT_NOT_FOUND**: The specified object on which you want to perform the operation does not exist.</p>
     * <p>*   **OBJECT_AlREADY_EXISTS**: The specified object on which you want to perform the operation already exists.</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("HostIds")
    public String hostIds;

    /**
     * <p>The ID of the host that you want to remove from the host group. The value is a JSON string. You can add up to 100 host IDs.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the IDs of hosts.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the host group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveHostsFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveHostsFromGroupRequest self = new RemoveHostsFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveHostsFromGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public RemoveHostsFromGroupRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public RemoveHostsFromGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveHostsFromGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
