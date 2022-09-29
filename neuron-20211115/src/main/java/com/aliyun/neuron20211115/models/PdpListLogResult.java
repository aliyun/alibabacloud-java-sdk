// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpListLogResult extends TeaModel {
    @NameInMap("logs")
    public java.util.List<PdpLog> logs;

    public static PdpListLogResult build(java.util.Map<String, ?> map) throws Exception {
        PdpListLogResult self = new PdpListLogResult();
        return TeaModel.build(map, self);
    }

    public PdpListLogResult setLogs(java.util.List<PdpLog> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<PdpLog> getLogs() {
        return this.logs;
    }

}
