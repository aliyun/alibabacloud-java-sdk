// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListWorkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public java.util.List<ListWorkspaceResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceResponseBody self = new ListWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspaceResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListWorkspaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListWorkspaceResponseBody setData(java.util.List<ListWorkspaceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkspaceResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkspaceResponseBodyData extends TeaModel {
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspaceResponseBodyData self = new ListWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkspaceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspaceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkspaceResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
