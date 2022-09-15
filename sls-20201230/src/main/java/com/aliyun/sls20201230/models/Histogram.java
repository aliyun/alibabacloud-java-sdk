// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Histogram extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("from")
    public Integer from;

    @NameInMap("progress")
    public String progress;

    @NameInMap("to")
    public Integer to;

    public static Histogram build(java.util.Map<String, ?> map) throws Exception {
        Histogram self = new Histogram();
        return TeaModel.build(map, self);
    }

    public Histogram setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public Histogram setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public Histogram setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public Histogram setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

}
