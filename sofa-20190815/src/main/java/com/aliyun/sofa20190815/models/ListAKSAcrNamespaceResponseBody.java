// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Namespaces")
    public java.util.List<ListAKSAcrNamespaceResponseBodyNamespaces> namespaces;

    public static ListAKSAcrNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrNamespaceResponseBody self = new ListAKSAcrNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSAcrNamespaceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSAcrNamespaceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSAcrNamespaceResponseBody setNamespaces(java.util.List<ListAKSAcrNamespaceResponseBodyNamespaces> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<ListAKSAcrNamespaceResponseBodyNamespaces> getNamespaces() {
        return this.namespaces;
    }

    public static class ListAKSAcrNamespaceResponseBodyNamespaces extends TeaModel {
        @NameInMap("AuthorizeType")
        public String authorizeType;

        @NameInMap("AutoCreate")
        public String autoCreate;

        @NameInMap("DefaultVisibility")
        public String defaultVisibility;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NamespaceStatus")
        public String namespaceStatus;

        public static ListAKSAcrNamespaceResponseBodyNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListAKSAcrNamespaceResponseBodyNamespaces self = new ListAKSAcrNamespaceResponseBodyNamespaces();
            return TeaModel.build(map, self);
        }

        public ListAKSAcrNamespaceResponseBodyNamespaces setAuthorizeType(String authorizeType) {
            this.authorizeType = authorizeType;
            return this;
        }
        public String getAuthorizeType() {
            return this.authorizeType;
        }

        public ListAKSAcrNamespaceResponseBodyNamespaces setAutoCreate(String autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public String getAutoCreate() {
            return this.autoCreate;
        }

        public ListAKSAcrNamespaceResponseBodyNamespaces setDefaultVisibility(String defaultVisibility) {
            this.defaultVisibility = defaultVisibility;
            return this;
        }
        public String getDefaultVisibility() {
            return this.defaultVisibility;
        }

        public ListAKSAcrNamespaceResponseBodyNamespaces setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListAKSAcrNamespaceResponseBodyNamespaces setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListAKSAcrNamespaceResponseBodyNamespaces setNamespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

    }

}
