// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteHostAccountRequest extends TeaModel {
    /**
     * <p>DeleteHostAccount</p>
     */
    @NameInMap("HostAccountId")
    public String hostAccountId;

    /**
     * <p>DeleteHostAccount</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>WB01014029</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteHostAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAccountRequest self = new DeleteHostAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHostAccountRequest setHostAccountId(String hostAccountId) {
        this.hostAccountId = hostAccountId;
        return this;
    }
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    public DeleteHostAccountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteHostAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
