// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Machine extends TeaModel {
    /**
     * <p>机器的主机id。</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("host-id")
    public String hostId;

    /**
     * <p>机器的IP地址。</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.x</p>
     */
    @NameInMap("ip")
    public String ip;

    /**
     * <p>最后一次心跳时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * 
     * <strong>example:</strong>
     * <p>1447182247</p>
     */
    @NameInMap("lastHeartbeatTime")
    public Long lastHeartbeatTime;

    /**
     * <p>机器的唯一标识。</p>
     * 
     * <strong>example:</strong>
     * <p>3B70F4F1-80F7-46C4-A6C1-100***CEE647</p>
     */
    @NameInMap("machine-uniqueid")
    public String machineUniqueid;

    /**
     * <p>机器的用户自定义标识，当机器组标识类型为用户自定义类型时有效。</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
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
