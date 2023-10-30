// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationTicketsResponseBody extends TeaModel {
    @NameInMap("OperationTickets")
    public java.util.List<ListOperationTicketsResponseBodyOperationTickets> operationTickets;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationTicketsResponseBody self = new ListOperationTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationTicketsResponseBody setOperationTickets(java.util.List<ListOperationTicketsResponseBodyOperationTickets> operationTickets) {
        this.operationTickets = operationTickets;
        return this;
    }
    public java.util.List<ListOperationTicketsResponseBodyOperationTickets> getOperationTickets() {
        return this.operationTickets;
    }

    public ListOperationTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationTicketsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationTicketsResponseBodyOperationTickets extends TeaModel {
        @NameInMap("ApplyUserId")
        public String applyUserId;

        @NameInMap("ApplyUsername")
        public String applyUsername;

        @NameInMap("AssetAccountId")
        public String assetAccountId;

        @NameInMap("AssetAccountName")
        public String assetAccountName;

        @NameInMap("AssetAddress")
        public String assetAddress;

        @NameInMap("AssetId")
        public String assetId;

        @NameInMap("AssetName")
        public String assetName;

        @NameInMap("AssetNetworkDomainId")
        public String assetNetworkDomainId;

        @NameInMap("AssetOs")
        public String assetOs;

        @NameInMap("AssetSource")
        public String assetSource;

        @NameInMap("AssetSourceInstanceId")
        public String assetSourceInstanceId;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("OperationTicketId")
        public String operationTicketId;

        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("State")
        public String state;

        public static ListOperationTicketsResponseBodyOperationTickets build(java.util.Map<String, ?> map) throws Exception {
            ListOperationTicketsResponseBodyOperationTickets self = new ListOperationTicketsResponseBodyOperationTickets();
            return TeaModel.build(map, self);
        }

        public ListOperationTicketsResponseBodyOperationTickets setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            return this;
        }
        public String getApplyUserId() {
            return this.applyUserId;
        }

        public ListOperationTicketsResponseBodyOperationTickets setApplyUsername(String applyUsername) {
            this.applyUsername = applyUsername;
            return this;
        }
        public String getApplyUsername() {
            return this.applyUsername;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetAccountId(String assetAccountId) {
            this.assetAccountId = assetAccountId;
            return this;
        }
        public String getAssetAccountId() {
            return this.assetAccountId;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetAccountName(String assetAccountName) {
            this.assetAccountName = assetAccountName;
            return this;
        }
        public String getAssetAccountName() {
            return this.assetAccountName;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetAddress(String assetAddress) {
            this.assetAddress = assetAddress;
            return this;
        }
        public String getAssetAddress() {
            return this.assetAddress;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetNetworkDomainId(String assetNetworkDomainId) {
            this.assetNetworkDomainId = assetNetworkDomainId;
            return this;
        }
        public String getAssetNetworkDomainId() {
            return this.assetNetworkDomainId;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetOs(String assetOs) {
            this.assetOs = assetOs;
            return this;
        }
        public String getAssetOs() {
            return this.assetOs;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetSource(String assetSource) {
            this.assetSource = assetSource;
            return this;
        }
        public String getAssetSource() {
            return this.assetSource;
        }

        public ListOperationTicketsResponseBodyOperationTickets setAssetSourceInstanceId(String assetSourceInstanceId) {
            this.assetSourceInstanceId = assetSourceInstanceId;
            return this;
        }
        public String getAssetSourceInstanceId() {
            return this.assetSourceInstanceId;
        }

        public ListOperationTicketsResponseBodyOperationTickets setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListOperationTicketsResponseBodyOperationTickets setOperationTicketId(String operationTicketId) {
            this.operationTicketId = operationTicketId;
            return this;
        }
        public String getOperationTicketId() {
            return this.operationTicketId;
        }

        public ListOperationTicketsResponseBodyOperationTickets setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

        public ListOperationTicketsResponseBodyOperationTickets setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
