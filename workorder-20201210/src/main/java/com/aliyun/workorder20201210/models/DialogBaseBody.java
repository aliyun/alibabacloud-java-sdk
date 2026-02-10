// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class DialogBaseBody extends TeaModel {
    @NameInMap("Attachments")
    public java.util.List<DialogBaseBodyAttachments> attachments;

    @NameInMap("ChannelCode")
    public String channelCode;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DataInfo")
    public DialogBaseBodyDataInfo dataInfo;

    @NameInMap("DialogId")
    public Long dialogId;

    @NameInMap("FooterInfo")
    public DialogBaseBodyFooterInfo footerInfo;

    @NameInMap("HitWords")
    public java.util.List<String> hitWords;

    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    @NameInMap("ReferInfo")
    public DialogBaseBody referInfo;

    @NameInMap("Stage")
    public Integer stage;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("TicketStatus")
    public Integer ticketStatus;

    @NameInMap("Timestamp")
    public Long timestamp;

    @NameInMap("Tip")
    public String tip;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("UserInfo")
    public DialogBaseBodyUserInfo userInfo;

    public static DialogBaseBody build(java.util.Map<String, ?> map) throws Exception {
        DialogBaseBody self = new DialogBaseBody();
        return TeaModel.build(map, self);
    }

    public DialogBaseBody setAttachments(java.util.List<DialogBaseBodyAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<DialogBaseBodyAttachments> getAttachments() {
        return this.attachments;
    }

    public DialogBaseBody setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public DialogBaseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DialogBaseBody setDataInfo(DialogBaseBodyDataInfo dataInfo) {
        this.dataInfo = dataInfo;
        return this;
    }
    public DialogBaseBodyDataInfo getDataInfo() {
        return this.dataInfo;
    }

    public DialogBaseBody setDialogId(Long dialogId) {
        this.dialogId = dialogId;
        return this;
    }
    public Long getDialogId() {
        return this.dialogId;
    }

    public DialogBaseBody setFooterInfo(DialogBaseBodyFooterInfo footerInfo) {
        this.footerInfo = footerInfo;
        return this;
    }
    public DialogBaseBodyFooterInfo getFooterInfo() {
        return this.footerInfo;
    }

    public DialogBaseBody setHitWords(java.util.List<String> hitWords) {
        this.hitWords = hitWords;
        return this;
    }
    public java.util.List<String> getHitWords() {
        return this.hitWords;
    }

    public DialogBaseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public DialogBaseBody setReferInfo(DialogBaseBody referInfo) {
        this.referInfo = referInfo;
        return this;
    }
    public DialogBaseBody getReferInfo() {
        return this.referInfo;
    }

    public DialogBaseBody setStage(Integer stage) {
        this.stage = stage;
        return this;
    }
    public Integer getStage() {
        return this.stage;
    }

    public DialogBaseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DialogBaseBody setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public DialogBaseBody setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public Integer getTicketStatus() {
        return this.ticketStatus;
    }

    public DialogBaseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public DialogBaseBody setTip(String tip) {
        this.tip = tip;
        return this;
    }
    public String getTip() {
        return this.tip;
    }

    public DialogBaseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public DialogBaseBody setUserInfo(DialogBaseBodyUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public DialogBaseBodyUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class DialogBaseBodyAttachments extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public String size;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static DialogBaseBodyAttachments build(java.util.Map<String, ?> map) throws Exception {
            DialogBaseBodyAttachments self = new DialogBaseBodyAttachments();
            return TeaModel.build(map, self);
        }

        public DialogBaseBodyAttachments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DialogBaseBodyAttachments setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DialogBaseBodyAttachments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DialogBaseBodyAttachments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DialogBaseBodyDataInfo extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public Integer bizType;

        @NameInMap("Component")
        public java.util.List<java.util.Map<String, ?>> component;

        @NameInMap("Container")
        public Object container;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentDesensitized")
        public String contentDesensitized;

        @NameInMap("Editable")
        public Integer editable;

        @NameInMap("Props")
        public java.util.List<java.util.Map<String, ?>> props;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("SchemaId")
        public Long schemaId;

        @NameInMap("ServiceChannel")
        public String serviceChannel;

        @NameInMap("Title")
        public String title;

        @NameInMap("Values")
        public java.util.Map<String, ?> values;

        public static DialogBaseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DialogBaseBodyDataInfo self = new DialogBaseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public DialogBaseBodyDataInfo setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public DialogBaseBodyDataInfo setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public DialogBaseBodyDataInfo setComponent(java.util.List<java.util.Map<String, ?>> component) {
            this.component = component;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getComponent() {
            return this.component;
        }

        public DialogBaseBodyDataInfo setContainer(Object container) {
            this.container = container;
            return this;
        }
        public Object getContainer() {
            return this.container;
        }

        public DialogBaseBodyDataInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DialogBaseBodyDataInfo setContentDesensitized(String contentDesensitized) {
            this.contentDesensitized = contentDesensitized;
            return this;
        }
        public String getContentDesensitized() {
            return this.contentDesensitized;
        }

        public DialogBaseBodyDataInfo setEditable(Integer editable) {
            this.editable = editable;
            return this;
        }
        public Integer getEditable() {
            return this.editable;
        }

        public DialogBaseBodyDataInfo setProps(java.util.List<java.util.Map<String, ?>> props) {
            this.props = props;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getProps() {
            return this.props;
        }

        public DialogBaseBodyDataInfo setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DialogBaseBodyDataInfo setSchemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public Long getSchemaId() {
            return this.schemaId;
        }

        public DialogBaseBodyDataInfo setServiceChannel(String serviceChannel) {
            this.serviceChannel = serviceChannel;
            return this;
        }
        public String getServiceChannel() {
            return this.serviceChannel;
        }

        public DialogBaseBodyDataInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DialogBaseBodyDataInfo setValues(java.util.Map<String, ?> values) {
            this.values = values;
            return this;
        }
        public java.util.Map<String, ?> getValues() {
            return this.values;
        }

    }

    public static class DialogBaseBodyFooterInfo extends TeaModel {
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("Schema")
        public String schema;

        public static DialogBaseBodyFooterInfo build(java.util.Map<String, ?> map) throws Exception {
            DialogBaseBodyFooterInfo self = new DialogBaseBodyFooterInfo();
            return TeaModel.build(map, self);
        }

        public DialogBaseBodyFooterInfo setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DialogBaseBodyFooterInfo setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class DialogBaseBodyUserInfo extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Role")
        public Integer role;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static DialogBaseBodyUserInfo build(java.util.Map<String, ?> map) throws Exception {
            DialogBaseBodyUserInfo self = new DialogBaseBodyUserInfo();
            return TeaModel.build(map, self);
        }

        public DialogBaseBodyUserInfo setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public DialogBaseBodyUserInfo setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

        public DialogBaseBodyUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DialogBaseBodyUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
