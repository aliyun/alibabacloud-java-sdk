// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LiveRecord extends TeaModel {
    // description
    @NameInMap("EndTime")
    public String endTime;

    // description
    @NameInMap("RemoteAddr")
    public String remoteAddr;

    // description
    @NameInMap("StartTime")
    public String startTime;

    public static LiveRecord build(java.util.Map<String, ?> map) throws Exception {
        LiveRecord self = new LiveRecord();
        return TeaModel.build(map, self);
    }

    public LiveRecord setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LiveRecord setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
        return this;
    }
    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    public LiveRecord setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
