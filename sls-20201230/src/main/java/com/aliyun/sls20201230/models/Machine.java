// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Machine extends TeaModel {
    // 机器 ip 地址。
    @NameInMap("ip")
    public String ip;

    // 最后一次心跳时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    @NameInMap("lastHeartbeatTime")
    public Long lastHeartbeatTime;

    // 机器的唯一标识。
    @NameInMap("machine-uniqueid")
    public String machineUniqueid;

    // 机器的用户自定义标识。
    @NameInMap("userdefined-id")
    public String userdefinedId;

    public static Machine build(java.util.Map<String, ?> map) throws Exception {
        Machine self = new Machine();
        return TeaModel.build(map, self);
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
