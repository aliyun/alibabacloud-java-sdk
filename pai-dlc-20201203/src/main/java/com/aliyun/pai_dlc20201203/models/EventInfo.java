// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class EventInfo extends TeaModel {
    /**
     * <p>The text content of the event.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the event, which is used to obtain the related context.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the pod to which the event belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc*****-master-0</p>
     */
    @NameInMap("PodId")
    public String podId;

    /**
     * <p>The UID of the pod to which the event belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>94a7cc7c-0033-48b5-85bd-71c63592c268</p>
     */
    @NameInMap("PodUid")
    public String podUid;

    /**
     * <p>The timestamp of the event in UTC.</p>
     */
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
