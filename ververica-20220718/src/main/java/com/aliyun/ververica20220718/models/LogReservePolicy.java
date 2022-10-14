// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class LogReservePolicy extends TeaModel {
    @NameInMap("expirationDays")
    public Long expirationDays;

    @NameInMap("openHistory")
    public Boolean openHistory;

    public static LogReservePolicy build(java.util.Map<String, ?> map) throws Exception {
        LogReservePolicy self = new LogReservePolicy();
        return TeaModel.build(map, self);
    }

    public LogReservePolicy setExpirationDays(Long expirationDays) {
        this.expirationDays = expirationDays;
        return this;
    }
    public Long getExpirationDays() {
        return this.expirationDays;
    }

    public LogReservePolicy setOpenHistory(Boolean openHistory) {
        this.openHistory = openHistory;
        return this;
    }
    public Boolean getOpenHistory() {
        return this.openHistory;
    }

}
