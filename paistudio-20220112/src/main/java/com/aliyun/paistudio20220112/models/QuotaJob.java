// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaJob extends TeaModel {
    @NameInMap("Queuing")
    public Long queuing;

    @NameInMap("Running")
    public Long running;

    @NameInMap("Total")
    public Long total;

    public static QuotaJob build(java.util.Map<String, ?> map) throws Exception {
        QuotaJob self = new QuotaJob();
        return TeaModel.build(map, self);
    }

    public QuotaJob setQueuing(Long queuing) {
        this.queuing = queuing;
        return this;
    }
    public Long getQueuing() {
        return this.queuing;
    }

    public QuotaJob setRunning(Long running) {
        this.running = running;
        return this;
    }
    public Long getRunning() {
        return this.running;
    }

    public QuotaJob setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
