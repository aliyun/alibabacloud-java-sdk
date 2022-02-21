// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddRenderingDeviceInternetPortsRequest extends TeaModel {
    @NameInMap("ISP")
    public String ISP;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("InternalPort")
    public String internalPort;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static AddRenderingDeviceInternetPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRenderingDeviceInternetPortsRequest self = new AddRenderingDeviceInternetPortsRequest();
        return TeaModel.build(map, self);
    }

    public AddRenderingDeviceInternetPortsRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AddRenderingDeviceInternetPortsRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public AddRenderingDeviceInternetPortsRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public AddRenderingDeviceInternetPortsRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AddRenderingDeviceInternetPortsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
