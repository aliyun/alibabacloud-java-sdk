// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ReceiveNotifyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Event")
    public String event;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("Content")
    public String content;

    public static ReceiveNotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveNotifyRequest self = new ReceiveNotifyRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveNotifyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReceiveNotifyRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public ReceiveNotifyRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ReceiveNotifyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ReceiveNotifyRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ReceiveNotifyRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ReceiveNotifyRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
