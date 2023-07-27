// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UserAntiDDOSInfo extends TeaModel {
    @NameInMap("ActiveTime")
    public Long activeTime;

    @NameInMap("Ctime")
    public Long ctime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mtime")
    public Long mtime;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("Status")
    public String status;

    public static UserAntiDDOSInfo build(java.util.Map<String, ?> map) throws Exception {
        UserAntiDDOSInfo self = new UserAntiDDOSInfo();
        return TeaModel.build(map, self);
    }

    public UserAntiDDOSInfo setActiveTime(Long activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public Long getActiveTime() {
        return this.activeTime;
    }

    public UserAntiDDOSInfo setCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }
    public Long getCtime() {
        return this.ctime;
    }

    public UserAntiDDOSInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UserAntiDDOSInfo setMtime(Long mtime) {
        this.mtime = mtime;
        return this;
    }
    public Long getMtime() {
        return this.mtime;
    }

    public UserAntiDDOSInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UserAntiDDOSInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
