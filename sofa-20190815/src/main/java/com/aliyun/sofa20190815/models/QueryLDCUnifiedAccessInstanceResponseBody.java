// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCUnifiedAccessInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("List")
    public java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyList> list;

    public static QueryLDCUnifiedAccessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCUnifiedAccessInstanceResponseBody self = new QueryLDCUnifiedAccessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCUnifiedAccessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCUnifiedAccessInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCUnifiedAccessInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCUnifiedAccessInstanceResponseBody setList(java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos extends TeaModel {
        @NameInMap("ContainerServiceName")
        public String containerServiceName;

        @NameInMap("Namespace")
        public String namespace;

        public static QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos self = new QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos();
            return TeaModel.build(map, self);
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos setContainerServiceName(String containerServiceName) {
            this.containerServiceName = containerServiceName;
            return this;
        }
        public String getContainerServiceName() {
            return this.containerServiceName;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("DataCenter")
        public String dataCenter;

        @NameInMap("MessageDetails")
        public String messageDetails;

        @NameInMap("Status")
        public String status;

        @NameInMap("Vip")
        public String vip;

        public static QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos self = new QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos();
            return TeaModel.build(map, self);
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos setMessageDetails(String messageDetails) {
            this.messageDetails = messageDetails;
            return this;
        }
        public String getMessageDetails() {
            return this.messageDetails;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

    }

    public static class QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry extends TeaModel {
        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Port")
        public Long port;

        @NameInMap("WebsocketConnect")
        public Boolean websocketConnect;

        public static QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry self = new QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry();
            return TeaModel.build(map, self);
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry setWebsocketConnect(Boolean websocketConnect) {
            this.websocketConnect = websocketConnect;
            return this;
        }
        public Boolean getWebsocketConnect() {
            return this.websocketConnect;
        }

    }

    public static class QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry extends TeaModel {
        @NameInMap("Port")
        public Long port;

        @NameInMap("WebsocketConnect")
        public Boolean websocketConnect;

        public static QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry self = new QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry();
            return TeaModel.build(map, self);
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry setWebsocketConnect(Boolean websocketConnect) {
            this.websocketConnect = websocketConnect;
            return this;
        }
        public Boolean getWebsocketConnect() {
            return this.websocketConnect;
        }

    }

    public static class QueryLDCUnifiedAccessInstanceResponseBodyList extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("SpannerCluster")
        public String spannerCluster;

        @NameInMap("UnifiedAccessInstanceId")
        public String unifiedAccessInstanceId;

        @NameInMap("UnifiedAccessInstanceMessageDetails")
        public String unifiedAccessInstanceMessageDetails;

        @NameInMap("UnifiedAccessInstanceName")
        public String unifiedAccessInstanceName;

        @NameInMap("UnifiedAccessInstanceStatus")
        public String unifiedAccessInstanceStatus;

        @NameInMap("UnifiedAccessInstanceType")
        public String unifiedAccessInstanceType;

        @NameInMap("UnifiedAccessInstanceContainerServiceInfos")
        public java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos> unifiedAccessInstanceContainerServiceInfos;

        @NameInMap("UnifiedAccessInstanceLocalDetailInfos")
        public java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos> unifiedAccessInstanceLocalDetailInfos;

        @NameInMap("UnifiedAccessInstanceHttpsEntry")
        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry unifiedAccessInstanceHttpsEntry;

        @NameInMap("UnifiedAccessInstanceHttpEntry")
        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry unifiedAccessInstanceHttpEntry;

        public static QueryLDCUnifiedAccessInstanceResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCUnifiedAccessInstanceResponseBodyList self = new QueryLDCUnifiedAccessInstanceResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setSpannerCluster(String spannerCluster) {
            this.spannerCluster = spannerCluster;
            return this;
        }
        public String getSpannerCluster() {
            return this.spannerCluster;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceId(String unifiedAccessInstanceId) {
            this.unifiedAccessInstanceId = unifiedAccessInstanceId;
            return this;
        }
        public String getUnifiedAccessInstanceId() {
            return this.unifiedAccessInstanceId;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceMessageDetails(String unifiedAccessInstanceMessageDetails) {
            this.unifiedAccessInstanceMessageDetails = unifiedAccessInstanceMessageDetails;
            return this;
        }
        public String getUnifiedAccessInstanceMessageDetails() {
            return this.unifiedAccessInstanceMessageDetails;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
            this.unifiedAccessInstanceName = unifiedAccessInstanceName;
            return this;
        }
        public String getUnifiedAccessInstanceName() {
            return this.unifiedAccessInstanceName;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceStatus(String unifiedAccessInstanceStatus) {
            this.unifiedAccessInstanceStatus = unifiedAccessInstanceStatus;
            return this;
        }
        public String getUnifiedAccessInstanceStatus() {
            return this.unifiedAccessInstanceStatus;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceType(String unifiedAccessInstanceType) {
            this.unifiedAccessInstanceType = unifiedAccessInstanceType;
            return this;
        }
        public String getUnifiedAccessInstanceType() {
            return this.unifiedAccessInstanceType;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceContainerServiceInfos(java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos> unifiedAccessInstanceContainerServiceInfos) {
            this.unifiedAccessInstanceContainerServiceInfos = unifiedAccessInstanceContainerServiceInfos;
            return this;
        }
        public java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceContainerServiceInfos> getUnifiedAccessInstanceContainerServiceInfos() {
            return this.unifiedAccessInstanceContainerServiceInfos;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceLocalDetailInfos(java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos> unifiedAccessInstanceLocalDetailInfos) {
            this.unifiedAccessInstanceLocalDetailInfos = unifiedAccessInstanceLocalDetailInfos;
            return this;
        }
        public java.util.List<QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceLocalDetailInfos> getUnifiedAccessInstanceLocalDetailInfos() {
            return this.unifiedAccessInstanceLocalDetailInfos;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceHttpsEntry(QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry unifiedAccessInstanceHttpsEntry) {
            this.unifiedAccessInstanceHttpsEntry = unifiedAccessInstanceHttpsEntry;
            return this;
        }
        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpsEntry getUnifiedAccessInstanceHttpsEntry() {
            return this.unifiedAccessInstanceHttpsEntry;
        }

        public QueryLDCUnifiedAccessInstanceResponseBodyList setUnifiedAccessInstanceHttpEntry(QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry unifiedAccessInstanceHttpEntry) {
            this.unifiedAccessInstanceHttpEntry = unifiedAccessInstanceHttpEntry;
            return this;
        }
        public QueryLDCUnifiedAccessInstanceResponseBodyListUnifiedAccessInstanceHttpEntry getUnifiedAccessInstanceHttpEntry() {
            return this.unifiedAccessInstanceHttpEntry;
        }

    }

}
