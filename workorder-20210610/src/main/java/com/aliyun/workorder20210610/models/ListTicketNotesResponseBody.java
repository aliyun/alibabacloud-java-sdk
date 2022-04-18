// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketNotesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListTicketNotesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTicketNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketNotesResponseBody self = new ListTicketNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketNotesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTicketNotesResponseBody setData(java.util.List<ListTicketNotesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTicketNotesResponseBodyData> getData() {
        return this.data;
    }

    public ListTicketNotesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTicketNotesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTicketNotesResponseBodyDataAttachments extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Url")
        public String url;

        public static ListTicketNotesResponseBodyDataAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyDataAttachments self = new ListTicketNotesResponseBodyDataAttachments();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyDataAttachments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTicketNotesResponseBodyDataAttachments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListTicketNotesResponseBodyDataDialog extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Schema")
        public String schema;

        public static ListTicketNotesResponseBodyDataDialog build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyDataDialog self = new ListTicketNotesResponseBodyDataDialog();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyDataDialog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTicketNotesResponseBodyDataDialog setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

    public static class ListTicketNotesResponseBodyDataUser extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public Integer role;

        public static ListTicketNotesResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyDataUser self = new ListTicketNotesResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyDataUser setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTicketNotesResponseBodyDataUser setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

    public static class ListTicketNotesResponseBodyData extends TeaModel {
        @NameInMap("Attachments")
        public java.util.List<ListTicketNotesResponseBodyDataAttachments> attachments;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Dialog")
        public ListTicketNotesResponseBodyDataDialog dialog;

        @NameInMap("DialogId")
        public Long dialogId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Tip")
        public String tip;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("User")
        public ListTicketNotesResponseBodyDataUser user;

        public static ListTicketNotesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyData self = new ListTicketNotesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyData setAttachments(java.util.List<ListTicketNotesResponseBodyDataAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<ListTicketNotesResponseBodyDataAttachments> getAttachments() {
            return this.attachments;
        }

        public ListTicketNotesResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTicketNotesResponseBodyData setDialog(ListTicketNotesResponseBodyDataDialog dialog) {
            this.dialog = dialog;
            return this;
        }
        public ListTicketNotesResponseBodyDataDialog getDialog() {
            return this.dialog;
        }

        public ListTicketNotesResponseBodyData setDialogId(Long dialogId) {
            this.dialogId = dialogId;
            return this;
        }
        public Long getDialogId() {
            return this.dialogId;
        }

        public ListTicketNotesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTicketNotesResponseBodyData setTip(String tip) {
            this.tip = tip;
            return this;
        }
        public String getTip() {
            return this.tip;
        }

        public ListTicketNotesResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListTicketNotesResponseBodyData setUser(ListTicketNotesResponseBodyDataUser user) {
            this.user = user;
            return this;
        }
        public ListTicketNotesResponseBodyDataUser getUser() {
            return this.user;
        }

    }

}
