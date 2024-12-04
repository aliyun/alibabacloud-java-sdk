// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Machine extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("host-id")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>192.168.x.x</p>
     */
    @NameInMap("ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>1657509674</p>
     */
    @NameInMap("lastHeartbeatTime")
    public Long lastHeartbeatTime;

    /**
     * <strong>example:</strong>
     * <p>3B70F4F1-80F7-46C4-A6C1-100D66C***47</p>
     */
    @NameInMap("machine-uniqueid")
    public String machineUniqueid;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("userdefined-id")
    public String userdefinedId;

    public static Machine build(java.util.Map<String, ?> map) throws Exception {
        Machine self = new Machine();
        return TeaModel.build(map, self);
    }

    public Machine setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public Machine setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public Machine setLastHeartbeatTime(Long lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
        return this;
    }
    public Long getLastHeartbeatTime() {
        return this.lastHeartbeatTime;
    }

    public Machine setMachineUniqueid(String machineUniqueid) {
        this.machineUniqueid = machineUniqueid;
        return this;
    }
    public String getMachineUniqueid() {
        return this.machineUniqueid;
    }

    public Machine setUserdefinedId(String userdefinedId) {
        this.userdefinedId = userdefinedId;
        return this;
    }
    public String getUserdefinedId() {
        return this.userdefinedId;
    }

}
