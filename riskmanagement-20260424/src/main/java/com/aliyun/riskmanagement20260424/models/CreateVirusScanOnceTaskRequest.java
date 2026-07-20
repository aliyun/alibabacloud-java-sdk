// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class CreateVirusScanOnceTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rm-0iw73ro05vcwn6ntq</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>12.3*.22.11</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateVirusScanOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirusScanOnceTaskRequest self = new CreateVirusScanOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirusScanOnceTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVirusScanOnceTaskRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateVirusScanOnceTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
