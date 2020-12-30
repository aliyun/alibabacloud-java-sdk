// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketNotesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListTicketNotesResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ListTicketNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketNotesResponseBody self = new ListTicketNotesResponseBody();
        return TeaModel.build(map, self);
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

    public ListTicketNotesResponseBody setData(ListTicketNotesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTicketNotesResponseBodyData getData() {
        return this.data;
    }

    public ListTicketNotesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTicketNotesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTicketNotesResponseBodyDataList extends TeaModel {
        @NameInMap("GmtCreated")
        public Integer gmtCreated;

        @NameInMap("NoteId")
        public String noteId;

        @NameInMap("FromOfficial")
        public Boolean fromOfficial;

        @NameInMap("Content")
        public String content;

        public static ListTicketNotesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyDataList self = new ListTicketNotesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyDataList setGmtCreated(Integer gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Integer getGmtCreated() {
            return this.gmtCreated;
        }

        public ListTicketNotesResponseBodyDataList setNoteId(String noteId) {
            this.noteId = noteId;
            return this;
        }
        public String getNoteId() {
            return this.noteId;
        }

        public ListTicketNotesResponseBodyDataList setFromOfficial(Boolean fromOfficial) {
            this.fromOfficial = fromOfficial;
            return this;
        }
        public Boolean getFromOfficial() {
            return this.fromOfficial;
        }

        public ListTicketNotesResponseBodyDataList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ListTicketNotesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListTicketNotesResponseBodyDataList> list;

        public static ListTicketNotesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyData self = new ListTicketNotesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyData setList(java.util.List<ListTicketNotesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTicketNotesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
