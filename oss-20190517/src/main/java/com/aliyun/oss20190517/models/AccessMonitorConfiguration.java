// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AccessMonitorConfiguration extends TeaModel {
    @NameInMap("Status")
    public String status;

    public static AccessMonitorConfiguration build(java.util.Map<String, ?> map) throws Exception {
        AccessMonitorConfiguration self = new AccessMonitorConfiguration();
        return TeaModel.build(map, self);
    }

    public AccessMonitorConfiguration setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
