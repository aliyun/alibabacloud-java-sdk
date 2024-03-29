// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SendXspaceStationMsgToServicerRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedReceiptConfirm")
    public Boolean needReceiptConfirm;

    @NameInMap("NeedRingNotify")
    public Boolean needRingNotify;

    @NameInMap("ReceiverIds")
    public java.util.List<Long> receiverIds;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SenderId")
    public Long senderId;

    @NameInMap("SourceId")
    public Long sourceId;

    @NameInMap("Title")
    public String title;

    public static SendXspaceStationMsgToServicerRequest build(java.util.Map<String, ?> map) throws Exception {
        SendXspaceStationMsgToServicerRequest self = new SendXspaceStationMsgToServicerRequest();
        return TeaModel.build(map, self);
    }

    public SendXspaceStationMsgToServicerRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SendXspaceStationMsgToServicerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendXspaceStationMsgToServicerRequest setNeedReceiptConfirm(Boolean needReceiptConfirm) {
        this.needReceiptConfirm = needReceiptConfirm;
        return this;
    }
    public Boolean getNeedReceiptConfirm() {
        return this.needReceiptConfirm;
    }

    public SendXspaceStationMsgToServicerRequest setNeedRingNotify(Boolean needRingNotify) {
        this.needRingNotify = needRingNotify;
        return this;
    }
    public Boolean getNeedRingNotify() {
        return this.needRingNotify;
    }

    public SendXspaceStationMsgToServicerRequest setReceiverIds(java.util.List<Long> receiverIds) {
        this.receiverIds = receiverIds;
        return this;
    }
    public java.util.List<Long> getReceiverIds() {
        return this.receiverIds;
    }

    public SendXspaceStationMsgToServicerRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SendXspaceStationMsgToServicerRequest setSenderId(Long senderId) {
        this.senderId = senderId;
        return this;
    }
    public Long getSenderId() {
        return this.senderId;
    }

    public SendXspaceStationMsgToServicerRequest setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public SendXspaceStationMsgToServicerRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
