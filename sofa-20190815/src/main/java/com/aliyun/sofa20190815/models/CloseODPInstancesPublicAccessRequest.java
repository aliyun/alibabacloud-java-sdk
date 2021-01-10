// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloseODPInstancesPublicAccessRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZdalproxyInstanceId")
    public String zdalproxyInstanceId;

    @NameInMap("ZonesRepeatList")
    public java.util.List<String> zonesRepeatList;

    public static CloseODPInstancesPublicAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseODPInstancesPublicAccessRequest self = new CloseODPInstancesPublicAccessRequest();
        return TeaModel.build(map, self);
    }

    public CloseODPInstancesPublicAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloseODPInstancesPublicAccessRequest setZdalproxyInstanceId(String zdalproxyInstanceId) {
        this.zdalproxyInstanceId = zdalproxyInstanceId;
        return this;
    }
    public String getZdalproxyInstanceId() {
        return this.zdalproxyInstanceId;
    }

    public CloseODPInstancesPublicAccessRequest setZonesRepeatList(java.util.List<String> zonesRepeatList) {
        this.zonesRepeatList = zonesRepeatList;
        return this;
    }
    public java.util.List<String> getZonesRepeatList() {
        return this.zonesRepeatList;
    }

}
