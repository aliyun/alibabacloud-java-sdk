// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Body extends TeaModel {
    @NameInMap("activity")
    public String activity;

    @NameInMap("afterOpen")
    public String afterOpen;

    @NameInMap("badge")
    public Integer badge;

    @NameInMap("builderId")
    public Long builderId;

    @NameInMap("custom")
    public String custom;

    @NameInMap("expandImage")
    public String expandImage;

    @NameInMap("icon")
    public String icon;

    @NameInMap("img")
    public String img;

    @NameInMap("largeIcon")
    public String largeIcon;

    @NameInMap("playLights")
    public Boolean playLights;

    @NameInMap("playSound")
    public Boolean playSound;

    @NameInMap("playVibrate")
    public Boolean playVibrate;

    @NameInMap("sound")
    public String sound;

    @NameInMap("text")
    public String text;

    @NameInMap("title")
    public String title;

    @NameInMap("url")
    public String url;

    public static Body build(java.util.Map<String, ?> map) throws Exception {
        Body self = new Body();
        return TeaModel.build(map, self);
    }

    public Body setActivity(String activity) {
        this.activity = activity;
        return this;
    }
    public String getActivity() {
        return this.activity;
    }

    public Body setAfterOpen(String afterOpen) {
        this.afterOpen = afterOpen;
        return this;
    }
    public String getAfterOpen() {
        return this.afterOpen;
    }

    public Body setBadge(Integer badge) {
        this.badge = badge;
        return this;
    }
    public Integer getBadge() {
        return this.badge;
    }

    public Body setBuilderId(Long builderId) {
        this.builderId = builderId;
        return this;
    }
    public Long getBuilderId() {
        return this.builderId;
    }

    public Body setCustom(String custom) {
        this.custom = custom;
        return this;
    }
    public String getCustom() {
        return this.custom;
    }

    public Body setExpandImage(String expandImage) {
        this.expandImage = expandImage;
        return this;
    }
    public String getExpandImage() {
        return this.expandImage;
    }

    public Body setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public Body setImg(String img) {
        this.img = img;
        return this;
    }
    public String getImg() {
        return this.img;
    }

    public Body setLargeIcon(String largeIcon) {
        this.largeIcon = largeIcon;
        return this;
    }
    public String getLargeIcon() {
        return this.largeIcon;
    }

    public Body setPlayLights(Boolean playLights) {
        this.playLights = playLights;
        return this;
    }
    public Boolean getPlayLights() {
        return this.playLights;
    }

    public Body setPlaySound(Boolean playSound) {
        this.playSound = playSound;
        return this;
    }
    public Boolean getPlaySound() {
        return this.playSound;
    }

    public Body setPlayVibrate(Boolean playVibrate) {
        this.playVibrate = playVibrate;
        return this;
    }
    public Boolean getPlayVibrate() {
        return this.playVibrate;
    }

    public Body setSound(String sound) {
        this.sound = sound;
        return this;
    }
    public String getSound() {
        return this.sound;
    }

    public Body setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Body setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Body setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class CancelByMsgIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static CancelByMsgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelByMsgIdResponseBodyData self = new CancelByMsgIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelByMsgIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class QueryMsgStatResponseBodyData extends TeaModel {
        @NameInMap("Accept")
        public Long accept;

        @NameInMap("Arrive")
        public Long arrive;

        @NameInMap("ClosePush")
        public Long closePush;

        @NameInMap("Dismiss")
        public Long dismiss;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("Open")
        public Long open;

        @NameInMap("Sent")
        public Long sent;

        @NameInMap("Status")
        public Integer status;

        public static QueryMsgStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMsgStatResponseBodyData self = new QueryMsgStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMsgStatResponseBodyData setAccept(Long accept) {
            this.accept = accept;
            return this;
        }
        public Long getAccept() {
            return this.accept;
        }

        public QueryMsgStatResponseBodyData setArrive(Long arrive) {
            this.arrive = arrive;
            return this;
        }
        public Long getArrive() {
            return this.arrive;
        }

        public QueryMsgStatResponseBodyData setClosePush(Long closePush) {
            this.closePush = closePush;
            return this;
        }
        public Long getClosePush() {
            return this.closePush;
        }

        public QueryMsgStatResponseBodyData setDismiss(Long dismiss) {
            this.dismiss = dismiss;
            return this;
        }
        public Long getDismiss() {
            return this.dismiss;
        }

        public QueryMsgStatResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public QueryMsgStatResponseBodyData setOpen(Long open) {
            this.open = open;
            return this;
        }
        public Long getOpen() {
            return this.open;
        }

        public QueryMsgStatResponseBodyData setSent(Long sent) {
            this.sent = sent;
            return this;
        }
        public Long getSent() {
            return this.sent;
        }

        public QueryMsgStatResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class SendByAliasResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByAliasResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByAliasResponseBodyData self = new SendByAliasResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByAliasResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class SendByAliasFileIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByAliasFileIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByAliasFileIdResponseBodyData self = new SendByAliasFileIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByAliasFileIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class SendByAppResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByAppResponseBodyData self = new SendByAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByAppResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class SendByDeviceResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByDeviceResponseBodyData self = new SendByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByDeviceResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class SendByDeviceFileIdResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByDeviceFileIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByDeviceFileIdResponseBodyData self = new SendByDeviceFileIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByDeviceFileIdResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class SendByFilterResponseBodyData extends TeaModel {
        @NameInMap("MsgId")
        public String msgId;

        public static SendByFilterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendByFilterResponseBodyData self = new SendByFilterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendByFilterResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

    }

    public static class UploadDeviceResponseBodyData extends TeaModel {
        @NameInMap("FileId")
        public String fileId;

        public static UploadDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadDeviceResponseBodyData self = new UploadDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadDeviceResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
