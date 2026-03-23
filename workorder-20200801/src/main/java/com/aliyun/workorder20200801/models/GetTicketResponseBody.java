// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class GetTicketResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Email")
    public String email;

    @NameInMap("List")
    public java.util.List<GetTicketResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("NotifyTimeRange")
    public String notifyTimeRange;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("TicketStatus")
    public String ticketStatus;

    @NameInMap("Title")
    public String title;

    public static GetTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponseBody self = new GetTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetTicketResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTicketResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTicketResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetTicketResponseBody setList(java.util.List<GetTicketResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetTicketResponseBodyList> getList() {
        return this.list;
    }

    public GetTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketResponseBody setNotifyTimeRange(String notifyTimeRange) {
        this.notifyTimeRange = notifyTimeRange;
        return this;
    }
    public String getNotifyTimeRange() {
        return this.notifyTimeRange;
    }

    public GetTicketResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetTicketResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTicketResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTicketResponseBody setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public GetTicketResponseBody setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public GetTicketResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class GetTicketResponseBodyList extends TeaModel {
        @NameInMap("AttachList")
        public java.util.List<String> attachList;

        @NameInMap("Content")
        public String content;

        @NameInMap("FromOfficial")
        public Boolean fromOfficial;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("NoteId")
        public String noteId;

        @NameInMap("Special")
        public Boolean special;

        public static GetTicketResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyList self = new GetTicketResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyList setAttachList(java.util.List<String> attachList) {
            this.attachList = attachList;
            return this;
        }
        public java.util.List<String> getAttachList() {
            return this.attachList;
        }

        public GetTicketResponseBodyList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTicketResponseBodyList setFromOfficial(Boolean fromOfficial) {
            this.fromOfficial = fromOfficial;
            return this;
        }
        public Boolean getFromOfficial() {
            return this.fromOfficial;
        }

        public GetTicketResponseBodyList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public GetTicketResponseBodyList setNoteId(String noteId) {
            this.noteId = noteId;
            return this;
        }
        public String getNoteId() {
            return this.noteId;
        }

        public GetTicketResponseBodyList setSpecial(Boolean special) {
            this.special = special;
            return this;
        }
        public Boolean getSpecial() {
            return this.special;
        }

    }

}
