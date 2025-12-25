// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketNotesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The return code of the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Return value, that is, the dialog record list data of the specified ticket</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTicketNotesResponseBodyData> data;

    /**
     * <p>The error message. If success is set to false, the message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the API request. The requestID is unique for each call.</p>
     * 
     * <strong>example:</strong>
     * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTicketNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketNotesResponseBody self = new ListTicketNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketNotesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>Attachment Name</p>
         * 
         * <strong>example:</strong>
         * <p>003.jpg</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Temporary Accessible Attachment Address</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gts-workorder.oss-cn-beijing.aliyuncs.com/20221003/cbc00fb0-b612-4d89-a75b-8d535f750f9f/image.png">https://gts-workorder.oss-cn-beijing.aliyuncs.com/20221003/cbc00fb0-b612-4d89-a75b-8d535f750f9f/image.png</a></p>
         */
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
        /**
         * <p>Work order communication content</p>
         * 
         * <strong>example:</strong>
         * <p>ECS backup failed</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ticket communication record system card will be used when the system card docking capability is opened in the future. At present, the content can be used to obtain plain text content.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
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
        /**
         * <p>Dialog User Name</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Dialogue user role, distinguish between agent and user.
         * 2 represents agent, 3 represents user.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>Attachment List</p>
         */
        @NameInMap("Attachments")
        public java.util.List<ListTicketNotesResponseBodyDataAttachments> attachments;

        /**
         * <p>The timestamp when the communication message was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1623396736000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Work order communication record object</p>
         */
        @NameInMap("Dialog")
        public ListTicketNotesResponseBodyDataDialog dialog;

        /**
         * <p>The unique ID of the conversation record.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("DialogId")
        public Long dialogId;

        /**
         * <p>Communication message status field, reference value Unread=1, Read=2</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Fields Not Used</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <p>Conversation Type 1 card, that is, schema 2 Text, that is, content</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>Conversation of users</p>
         */
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
