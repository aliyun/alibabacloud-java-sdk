// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class LogInfo extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public String id;

    @NameInMap("PodId")
    public String podId;

    @NameInMap("PodUid")
    public String podUid;

    @NameInMap("Source")
    public String source;

    @NameInMap("Time")
    public String time;

    public static LogInfo build(java.util.Map<String, ?> map) throws Exception {
        LogInfo self = new LogInfo();
        return TeaModel.build(map, self);
    }

    public LogInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public LogInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LogInfo setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public LogInfo setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public LogInfo setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public LogInfo setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
