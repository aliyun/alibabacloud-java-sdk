// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerServiceIngressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Ingresses")
    public java.util.List<ListLDCContainerServiceIngressResponseBodyIngresses> ingresses;

    public static ListLDCContainerServiceIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerServiceIngressResponseBody self = new ListLDCContainerServiceIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerServiceIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCContainerServiceIngressResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCContainerServiceIngressResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCContainerServiceIngressResponseBody setIngresses(java.util.List<ListLDCContainerServiceIngressResponseBodyIngresses> ingresses) {
        this.ingresses = ingresses;
        return this;
    }
    public java.util.List<ListLDCContainerServiceIngressResponseBodyIngresses> getIngresses() {
        return this.ingresses;
    }

    public static class ListLDCContainerServiceIngressResponseBodyIngressesMeta extends TeaModel {
        @NameInMap("CellDisplayName")
        public String cellDisplayName;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Uid")
        public String uid;

        public static ListLDCContainerServiceIngressResponseBodyIngressesMeta build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerServiceIngressResponseBodyIngressesMeta self = new ListLDCContainerServiceIngressResponseBodyIngressesMeta();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerServiceIngressResponseBodyIngressesMeta setCellDisplayName(String cellDisplayName) {
            this.cellDisplayName = cellDisplayName;
            return this;
        }
        public String getCellDisplayName() {
            return this.cellDisplayName;
        }

        public ListLDCContainerServiceIngressResponseBodyIngressesMeta setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListLDCContainerServiceIngressResponseBodyIngressesMeta setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListLDCContainerServiceIngressResponseBodyIngressesMeta setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerServiceIngressResponseBodyIngressesMeta setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLDCContainerServiceIngressResponseBodyIngressesMeta setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListLDCContainerServiceIngressResponseBodyIngresses extends TeaModel {
        @NameInMap("UnifiedAccessInstanceName")
        public String unifiedAccessInstanceName;

        @NameInMap("Meta")
        public ListLDCContainerServiceIngressResponseBodyIngressesMeta meta;

        public static ListLDCContainerServiceIngressResponseBodyIngresses build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerServiceIngressResponseBodyIngresses self = new ListLDCContainerServiceIngressResponseBodyIngresses();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerServiceIngressResponseBodyIngresses setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
            this.unifiedAccessInstanceName = unifiedAccessInstanceName;
            return this;
        }
        public String getUnifiedAccessInstanceName() {
            return this.unifiedAccessInstanceName;
        }

        public ListLDCContainerServiceIngressResponseBodyIngresses setMeta(ListLDCContainerServiceIngressResponseBodyIngressesMeta meta) {
            this.meta = meta;
            return this;
        }
        public ListLDCContainerServiceIngressResponseBodyIngressesMeta getMeta() {
            return this.meta;
        }

    }

}
