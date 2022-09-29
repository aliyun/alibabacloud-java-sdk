// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessagesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMessagesResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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

    public ListMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMessagesResponseBodyDataMessages extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ScheduleId")
        public String scheduleId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateParams")
        public String templateParams;

        @NameInMap("TemplateType")
        public Integer templateType;

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

        public ListMessagesResponseBodyDataMessages setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

    }

    public static class ListMessagesResponseBodyData extends TeaModel {
        @NameInMap("Messages")
        public java.util.List<ListMessagesResponseBodyDataMessages> messages;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
