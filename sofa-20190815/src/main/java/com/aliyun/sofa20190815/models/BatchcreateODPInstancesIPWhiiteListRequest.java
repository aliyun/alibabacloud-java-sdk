// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateODPInstancesIPWhiiteListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    public static BatchcreateODPInstancesIPWhiiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateODPInstancesIPWhiiteListRequest self = new BatchcreateODPInstancesIPWhiiteListRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateODPInstancesIPWhiiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchcreateODPInstancesIPWhiiteListRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public BatchcreateODPInstancesIPWhiiteListRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

}
