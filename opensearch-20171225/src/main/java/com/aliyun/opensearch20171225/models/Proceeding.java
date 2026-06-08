// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class Proceeding extends TeaModel {
    @NameInMap("detail")
    public java.util.Map<String, ?> detail;

    @NameInMap("progress")
    public Float progress;

    @NameInMap("status")
    public String status;

    @NameInMap("subTasks")
    public Proceeding subTasks;

    @NameInMap("type")
    public String type;

    public static Proceeding build(java.util.Map<String, ?> map) throws Exception {
        Proceeding self = new Proceeding();
        return TeaModel.build(map, self);
    }

    public Proceeding setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public Proceeding setProgress(Float progress) {
        this.progress = progress;
        return this;
    }
    public Float getProgress() {
        return this.progress;
    }

    public Proceeding setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Proceeding setSubTasks(Proceeding subTasks) {
        this.subTasks = subTasks;
        return this;
    }
    public Proceeding getSubTasks() {
        return this.subTasks;
    }

    public Proceeding setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
