// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCUnifiedAccessInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetLDCUnifiedAccessInstanceResponseBodyData data;

    public static GetLDCUnifiedAccessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCUnifiedAccessInstanceResponseBody self = new GetLDCUnifiedAccessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCUnifiedAccessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCUnifiedAccessInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCUnifiedAccessInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCUnifiedAccessInstanceResponseBody setData(GetLDCUnifiedAccessInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLDCUnifiedAccessInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos extends TeaModel {
        @NameInMap("ContainerServiceName")
        public String containerServiceName;

        @NameInMap("Namespace")
        public String namespace;

        public static GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos self = new GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos setContainerServiceName(String containerServiceName) {
            this.containerServiceName = containerServiceName;
            return this;
        }
        public String getContainerServiceName() {
            return this.containerServiceName;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos extends TeaModel {
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

        public static GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos build(java.util.Map<String, ?> map) throws Exception {
            GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos self = new GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos();
            return TeaModel.build(map, self);
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos setMessageDetails(String messageDetails) {
            this.messageDetails = messageDetails;
            return this;
        }
        public String getMessageDetails() {
            return this.messageDetails;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

    }

    public static class GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry extends TeaModel {
        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Port")
        public Long port;

        @NameInMap("WebsocketConnect")
        public Boolean websocketConnect;

        public static GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry build(java.util.Map<String, ?> map) throws Exception {
            GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry self = new GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry();
            return TeaModel.build(map, self);
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry setWebsocketConnect(Boolean websocketConnect) {
            this.websocketConnect = websocketConnect;
            return this;
        }
        public Boolean getWebsocketConnect() {
            return this.websocketConnect;
        }

    }

    public static class GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry extends TeaModel {
        @NameInMap("Port")
        public Long port;

        @NameInMap("WebsocketConnect")
        public Boolean websocketConnect;

        public static GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry build(java.util.Map<String, ?> map) throws Exception {
            GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry self = new GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry();
            return TeaModel.build(map, self);
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry setWebsocketConnect(Boolean websocketConnect) {
            this.websocketConnect = websocketConnect;
            return this;
        }
        public Boolean getWebsocketConnect() {
            return this.websocketConnect;
        }

    }

    public static class GetLDCUnifiedAccessInstanceResponseBodyData extends TeaModel {
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
        public java.util.List<GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos> unifiedAccessInstanceContainerServiceInfos;

        @NameInMap("UnifiedAccessInstanceLocalDetailInfos")
        public java.util.List<GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos> unifiedAccessInstanceLocalDetailInfos;

        @NameInMap("UnifiedAccessInstanceHttpsEntry")
        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry unifiedAccessInstanceHttpsEntry;

        @NameInMap("UnifiedAccessInstanceHttpEntry")
        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry unifiedAccessInstanceHttpEntry;

        public static GetLDCUnifiedAccessInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLDCUnifiedAccessInstanceResponseBodyData self = new GetLDCUnifiedAccessInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setSpannerCluster(String spannerCluster) {
            this.spannerCluster = spannerCluster;
            return this;
        }
        public String getSpannerCluster() {
            return this.spannerCluster;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceId(String unifiedAccessInstanceId) {
            this.unifiedAccessInstanceId = unifiedAccessInstanceId;
            return this;
        }
        public String getUnifiedAccessInstanceId() {
            return this.unifiedAccessInstanceId;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceMessageDetails(String unifiedAccessInstanceMessageDetails) {
            this.unifiedAccessInstanceMessageDetails = unifiedAccessInstanceMessageDetails;
            return this;
        }
        public String getUnifiedAccessInstanceMessageDetails() {
            return this.unifiedAccessInstanceMessageDetails;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
            this.unifiedAccessInstanceName = unifiedAccessInstanceName;
            return this;
        }
        public String getUnifiedAccessInstanceName() {
            return this.unifiedAccessInstanceName;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceStatus(String unifiedAccessInstanceStatus) {
            this.unifiedAccessInstanceStatus = unifiedAccessInstanceStatus;
            return this;
        }
        public String getUnifiedAccessInstanceStatus() {
            return this.unifiedAccessInstanceStatus;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceType(String unifiedAccessInstanceType) {
            this.unifiedAccessInstanceType = unifiedAccessInstanceType;
            return this;
        }
        public String getUnifiedAccessInstanceType() {
            return this.unifiedAccessInstanceType;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceContainerServiceInfos(java.util.List<GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos> unifiedAccessInstanceContainerServiceInfos) {
            this.unifiedAccessInstanceContainerServiceInfos = unifiedAccessInstanceContainerServiceInfos;
            return this;
        }
        public java.util.List<GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceContainerServiceInfos> getUnifiedAccessInstanceContainerServiceInfos() {
            return this.unifiedAccessInstanceContainerServiceInfos;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceLocalDetailInfos(java.util.List<GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos> unifiedAccessInstanceLocalDetailInfos) {
            this.unifiedAccessInstanceLocalDetailInfos = unifiedAccessInstanceLocalDetailInfos;
            return this;
        }
        public java.util.List<GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceLocalDetailInfos> getUnifiedAccessInstanceLocalDetailInfos() {
            return this.unifiedAccessInstanceLocalDetailInfos;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceHttpsEntry(GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry unifiedAccessInstanceHttpsEntry) {
            this.unifiedAccessInstanceHttpsEntry = unifiedAccessInstanceHttpsEntry;
            return this;
        }
        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpsEntry getUnifiedAccessInstanceHttpsEntry() {
            return this.unifiedAccessInstanceHttpsEntry;
        }

        public GetLDCUnifiedAccessInstanceResponseBodyData setUnifiedAccessInstanceHttpEntry(GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry unifiedAccessInstanceHttpEntry) {
            this.unifiedAccessInstanceHttpEntry = unifiedAccessInstanceHttpEntry;
            return this;
        }
        public GetLDCUnifiedAccessInstanceResponseBodyDataUnifiedAccessInstanceHttpEntry getUnifiedAccessInstanceHttpEntry() {
            return this.unifiedAccessInstanceHttpEntry;
        }

    }

}
