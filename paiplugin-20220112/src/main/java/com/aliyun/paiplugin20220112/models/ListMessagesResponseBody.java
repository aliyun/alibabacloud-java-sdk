// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessagesResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public ListMessagesResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static ListMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesResponseBody self = new ListMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessagesResponseBody setData(ListMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListMessagesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListMessagesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class ListMessagesResponseBodyDataMessages extends TeaModel {
        // 错误码。
        @NameInMap("ErrorCode")
        public String errorCode;

        // 关联人群Id。
        @NameInMap("GroupId")
        public String groupId;

        // 短信序列号。
        @NameInMap("Id")
        public String id;

        // 外部拓展字段。
        @NameInMap("OutId")
        public String outId;

        // 手机号码。
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        // 关联发送计划Id。
        @NameInMap("ScheduleId")
        public String scheduleId;

        // 签名名称。
        @NameInMap("Signature")
        public String signature;

        // 短信发送状态
        // - 0 : 发送中。
        // - 1 : 发送成功。
        // - 2 : 发送失败。
        @NameInMap("Status")
        public Integer status;

        // 模板号。
        @NameInMap("TemplateCode")
        public String templateCode;

        // 模板参数。
        @NameInMap("TemplateParams")
        public String templateParams;

        public static ListMessagesResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataMessages self = new ListMessagesResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataMessages setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMessagesResponseBodyDataMessages setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListMessagesResponseBodyDataMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMessagesResponseBodyDataMessages setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public ListMessagesResponseBodyDataMessages setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListMessagesResponseBodyDataMessages setScheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public String getScheduleId() {
            return this.scheduleId;
        }

        public ListMessagesResponseBodyDataMessages setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ListMessagesResponseBodyDataMessages setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListMessagesResponseBodyDataMessages setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListMessagesResponseBodyDataMessages setTemplateParams(String templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public String getTemplateParams() {
            return this.templateParams;
        }

    }

    public static class ListMessagesResponseBodyData extends TeaModel {
        // 短信列表。
        @NameInMap("Messages")
        public java.util.List<ListMessagesResponseBodyDataMessages> messages;

        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 短信数量。
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyData self = new ListMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyData setMessages(java.util.List<ListMessagesResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public ListMessagesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMessagesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMessagesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
