// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostRequest extends TeaModel {
    /**
     * <p>The protocol that is used to connect to the host. Valid values:</p>
     * <br>
     * <p>*   **SSH**</p>
     * <p>*   **RDP**</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <p>The ID of the host that you want to query. You can specify only one host ID.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the host.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetHostRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHostRequest self = new GetHostRequest();
        return TeaModel.build(map, self);
    }

    public GetHostRequest setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
