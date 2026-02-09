// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketNotesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListTicketNotesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CA6204AC-6AA9-4CFA-9310-7DFD20C19EBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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

    public ListTicketNotesResponseBody setData(ListTicketNotesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTicketNotesResponseBodyData getData() {
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

    public static class ListTicketNotesResponseBodyDataList extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FromOfficial")
        public Boolean fromOfficial;

        /**
         * <strong>example:</strong>
         * <p>1586920240</p>
         */
        @NameInMap("GmtCreated")
        public Integer gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>CT24GHXT</p>
         */
        @NameInMap("NoteId")
        public String noteId;

        public static ListTicketNotesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTicketNotesResponseBodyDataList self = new ListTicketNotesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTicketNotesResponseBodyDataList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListTicketNotesResponseBodyDataList setFromOfficial(Boolean fromOfficial) {
            this.fromOfficial = fromOfficial;
            return this;
        }
        public Boolean getFromOfficial() {
            return this.fromOfficial;
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
