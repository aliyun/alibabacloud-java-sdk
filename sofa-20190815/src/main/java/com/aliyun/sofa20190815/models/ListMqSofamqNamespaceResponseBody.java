// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListMqSofamqNamespaceResponseBodyData> data;

    public static ListMqSofamqNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqNamespaceResponseBody self = new ListMqSofamqNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqNamespaceResponseBody setData(java.util.List<ListMqSofamqNamespaceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMqSofamqNamespaceResponseBodyData> getData() {
        return this.data;
    }

    public static class ListMqSofamqNamespaceResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("NamespaceName")
        public String namespaceName;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        public static ListMqSofamqNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqNamespaceResponseBodyData self = new ListMqSofamqNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqNamespaceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqNamespaceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqNamespaceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqNamespaceResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListMqSofamqNamespaceResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListMqSofamqNamespaceResponseBodyData setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListMqSofamqNamespaceResponseBodyData setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

    }

}
