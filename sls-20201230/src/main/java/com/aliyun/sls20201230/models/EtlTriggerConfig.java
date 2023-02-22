// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EtlTriggerConfig extends TeaModel {
    @NameInMap("maxRetryTime")
    public Integer maxRetryTime;

    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("startingPosition")
    public String startingPosition;

    @NameInMap("startingUnixtime")
    public Long startingUnixtime;

    @NameInMap("triggerInterval")
    public Integer triggerInterval;

    public static EtlTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        EtlTriggerConfig self = new EtlTriggerConfig();
        return TeaModel.build(map, self);
    }

    public EtlTriggerConfig setMaxRetryTime(Integer maxRetryTime) {
        this.maxRetryTime = maxRetryTime;
        return this;
    }
    public Integer getMaxRetryTime() {
        return this.maxRetryTime;
    }

    public EtlTriggerConfig setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public EtlTriggerConfig setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
        return this;
    }
    public String getStartingPosition() {
        return this.startingPosition;
    }

    public EtlTriggerConfig setStartingUnixtime(Long startingUnixtime) {
        this.startingUnixtime = startingUnixtime;
        return this;
    }
    public Long getStartingUnixtime() {
        return this.startingUnixtime;
    }

    public EtlTriggerConfig setTriggerInterval(Integer triggerInterval) {
        this.triggerInterval = triggerInterval;
        return this;
    }
    public Integer getTriggerInterval() {
        return this.triggerInterval;
    }

}
