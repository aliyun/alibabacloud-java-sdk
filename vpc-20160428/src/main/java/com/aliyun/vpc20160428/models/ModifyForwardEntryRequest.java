// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyForwardEntryRequest extends TeaModel {
    @NameInMap("ForwardTableId")
    @Validation(required = true)
    public String forwardTableId;

    @NameInMap("ForwardEntryId")
    @Validation(required = true)
    public String forwardEntryId;

    @NameInMap("ExternalIp")
    public String externalIp;

    @NameInMap("ExternalPort")
    public String externalPort;

    @NameInMap("InternalIp")
    public String internalIp;

    @NameInMap("InternalPort")
    public String internalPort;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PortBreak")
    public Boolean portBreak;

    public static ModifyForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardEntryRequest self = new ModifyForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyForwardEntryRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public ModifyForwardEntryRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public ModifyForwardEntryRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public ModifyForwardEntryRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public ModifyForwardEntryRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public ModifyForwardEntryRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public ModifyForwardEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyForwardEntryRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public ModifyForwardEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyForwardEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyForwardEntryRequest setPortBreak(Boolean portBreak) {
        this.portBreak = portBreak;
        return this;
    }
    public Boolean getPortBreak() {
        return this.portBreak;
    }

}
