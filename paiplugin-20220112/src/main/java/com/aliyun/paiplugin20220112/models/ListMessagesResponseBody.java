// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessagesResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public ListMessagesResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
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
        /**
         * <p>短信错误码。</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>关联人群Id，未关联则为空。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>短信序列号。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>外部拓展字段。</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>手机号码。</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>关联触达计划Id，未关联则为空。</p>
         */
        @NameInMap("ScheduleId")
        public String scheduleId;

        /**
         * <p>签名名称。</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>短信发送状态。</p>
         * <p>- 0 : 发送中。</p>
         * <p>- 1 : 发送成功。</p>
         * <p>- 2 : 发送失败。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>模板号。</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>模板参数。</p>
         */
        @NameInMap("TemplateParams")
        public String templateParams;

        /**
         * <p>模板类型。</p>
         * <p>- 0 : 验证码。</p>
         * <p>- 1 : 短信通知。</p>
         * <p>- 2 : 推广短信。</p>
         */
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
        /**
         * <p>短信列表。</p>
         */
        @NameInMap("Messages")
        public java.util.List<ListMessagesResponseBodyDataMessages> messages;

        /**
         * <p>分页数，从1开始，默认为1。</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>分页大小，默认为10。</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>短信数量。</p>
         */
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
