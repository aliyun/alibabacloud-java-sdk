// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketNotesResponseBody extends TeaModel {
    /**
     * <p>The details of the permission error. An empty string is returned if you have the required permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;AuthAction\&quot;:\&quot;ram:ListTicketNotes\&quot;,\&quot;AuthPrincipalDisplayName\&quot;:\&quot;2146216584788xxxxx\&quot;,\&quot;AuthPrincipalOwnerId\&quot;:\&quot;1135850448xxxxx\&quot;,\&quot;AuthPrincipalType\&quot;:\&quot;SubUser\&quot;,\&quot;NoPermissionType\&quot;:\&quot;ImplicitDeny\&quot;,\&quot;PolicyType\&quot;:\&quot;AccountLevelIdentityBasedPolicy\&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The return code for the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return value, which is a list of communication records for the specified ticket.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTicketNotesResponseBodyData> data;

    /**
     * <p>The error message. This parameter is returned when \<code>Success\\</code> is \<code>false\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid input parameter</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Each request has a unique ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC0AB2EC-AFBC-44BA-AE77-132A5A1EC0AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of \<code>true\\</code> indicates a successful call.</p>
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
         * <p>The name of the attachment.</p>
         * 
         * <strong>example:</strong>
         * <p>003.jpg</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A temporary URL to access the attachment.</p>
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
         * <p>The content of the ticket communication.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, my ECS renewal failed. What is the reason?</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The system card for the ticket communication record. This parameter is reserved for future use. Currently, you can use the \<code>Content\\</code> parameter to retrieve the plain text.</p>
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
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The role of the user in the communication. This parameter distinguishes between customer service agents and customers. Valid values: \<code>2\\</code>: Customer service agent. \<code>3\\</code>: Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The list of attachments.</p>
         */
        @NameInMap("Attachments")
        public java.util.List<ListTicketNotesResponseBodyDataAttachments> attachments;

        /**
         * <p>The UNIX timestamp when the communication message was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1623396736000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ticket communication record object.</p>
         */
        @NameInMap("Dialog")
        public ListTicketNotesResponseBodyDataDialog dialog;

        /**
         * <p>The unique ID of the communication record.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("DialogId")
        public Long dialogId;

        /**
         * <p>The status of the communication message. Valid values: \<code>1\\</code>: Unread. \<code>2\\</code>: Read.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>This parameter is not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Tip")
        public String tip;

        /**
         * <p>The type of communication. Valid values: \<code>1\\</code>: Card, which corresponds to \<code>Schema\\</code>. \<code>2\\</code>: Text, which corresponds to \<code>Content\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The user in the communication.</p>
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
