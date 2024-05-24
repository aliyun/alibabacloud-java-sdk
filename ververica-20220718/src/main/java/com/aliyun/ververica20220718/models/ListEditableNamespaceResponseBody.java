// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListEditableNamespaceResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEditableNamespaceResponseBodyData data;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("message")
    public String message;

    @NameInMap("reason")
    public String reason;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListEditableNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEditableNamespaceResponseBody self = new ListEditableNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEditableNamespaceResponseBody setData(ListEditableNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEditableNamespaceResponseBodyData getData() {
        return this.data;
    }

    public ListEditableNamespaceResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListEditableNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEditableNamespaceResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ListEditableNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEditableNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEditableNamespaceResponseBodyData extends TeaModel {
        @NameInMap("editableNamespaces")
        public java.util.List<EditableNamespace> editableNamespaces;

        @NameInMap("pageIndex")
        public String pageIndex;

        @NameInMap("pageSize")
        public String pageSize;

        @NameInMap("total")
        public String total;

        public static ListEditableNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEditableNamespaceResponseBodyData self = new ListEditableNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEditableNamespaceResponseBodyData setEditableNamespaces(java.util.List<EditableNamespace> editableNamespaces) {
            this.editableNamespaces = editableNamespaces;
            return this;
        }
        public java.util.List<EditableNamespace> getEditableNamespaces() {
            return this.editableNamespaces;
        }

        public ListEditableNamespaceResponseBodyData setPageIndex(String pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public String getPageIndex() {
            return this.pageIndex;
        }

        public ListEditableNamespaceResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListEditableNamespaceResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
