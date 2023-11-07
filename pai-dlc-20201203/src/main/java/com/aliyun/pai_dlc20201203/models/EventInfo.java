// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class EventInfo extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public String id;

    @NameInMap("PodId")
    public String podId;

    @NameInMap("PodUid")
    public String podUid;

    @NameInMap("Time")
    public String time;

    public static EventInfo build(java.util.Map<String, ?> map) throws Exception {
        EventInfo self = new EventInfo();
        return TeaModel.build(map, self);
    }

    public EventInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EventInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EventInfo setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

    public EventInfo setPodUid(String podUid) {
        this.podUid = podUid;
        return this;
    }
    public String getPodUid() {
        return this.podUid;
    }

    public EventInfo setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
