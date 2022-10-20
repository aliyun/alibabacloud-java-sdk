// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOnlineTouchSessionListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOnlineTouchSessionListResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalResults")
    public Integer totalResults;

    public static GetOnlineTouchSessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineTouchSessionListResponseBody self = new GetOnlineTouchSessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnlineTouchSessionListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOnlineTouchSessionListResponseBody setData(java.util.List<GetOnlineTouchSessionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOnlineTouchSessionListResponseBodyData> getData() {
        return this.data;
    }

    public GetOnlineTouchSessionListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetOnlineTouchSessionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOnlineTouchSessionListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOnlineTouchSessionListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOnlineTouchSessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOnlineTouchSessionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetOnlineTouchSessionListResponseBody setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static class GetOnlineTouchSessionListResponseBodyDataMessageInfo extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("MessageId")
        public Long messageId;

        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("SenderName")
        public String senderName;

        @NameInMap("SenderType")
        public String senderType;

        @NameInMap("Status")
        public String status;

        public static GetOnlineTouchSessionListResponseBodyDataMessageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineTouchSessionListResponseBodyDataMessageInfo self = new GetOnlineTouchSessionListResponseBodyDataMessageInfo();
            return TeaModel.build(map, self);
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setMessageId(Long messageId) {
            this.messageId = messageId;
            return this;
        }
        public Long getMessageId() {
            return this.messageId;
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setSenderName(String senderName) {
            this.senderName = senderName;
            return this;
        }
        public String getSenderName() {
            return this.senderName;
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setSenderType(String senderType) {
            this.senderType = senderType;
            return this;
        }
        public String getSenderType() {
            return this.senderType;
        }

        public GetOnlineTouchSessionListResponseBodyDataMessageInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetOnlineTouchSessionListResponseBodyData extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("MessageInfo")
        public java.util.List<GetOnlineTouchSessionListResponseBodyDataMessageInfo> messageInfo;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("TouchId")
        public String touchId;

        @NameInMap("UserForeignId")
        public String userForeignId;

        public static GetOnlineTouchSessionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOnlineTouchSessionListResponseBodyData self = new GetOnlineTouchSessionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOnlineTouchSessionListResponseBodyData setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetOnlineTouchSessionListResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public GetOnlineTouchSessionListResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetOnlineTouchSessionListResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetOnlineTouchSessionListResponseBodyData setMessageInfo(java.util.List<GetOnlineTouchSessionListResponseBodyDataMessageInfo> messageInfo) {
            this.messageInfo = messageInfo;
            return this;
        }
        public java.util.List<GetOnlineTouchSessionListResponseBodyDataMessageInfo> getMessageInfo() {
            return this.messageInfo;
        }

        public GetOnlineTouchSessionListResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetOnlineTouchSessionListResponseBodyData setTouchId(String touchId) {
            this.touchId = touchId;
            return this;
        }
        public String getTouchId() {
            return this.touchId;
        }

        public GetOnlineTouchSessionListResponseBodyData setUserForeignId(String userForeignId) {
            this.userForeignId = userForeignId;
            return this;
        }
        public String getUserForeignId() {
            return this.userForeignId;
        }

    }

}
