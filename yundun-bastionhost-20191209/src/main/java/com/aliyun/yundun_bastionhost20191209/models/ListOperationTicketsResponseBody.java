// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationTicketsResponseBody extends TeaModel {
    /**
     * <p>The O\&amp;M applications to be reviewed.</p>
     */
    @NameInMap("OperationTickets")
    public java.util.List<ListOperationTicketsResponseBodyOperationTickets> operationTickets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of O\&amp;M applications to be reviewed.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The ID of the O\&amp;M applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ApplyUserId")
        public String applyUserId;

        /**
         * <p>The username of the O\&amp;M applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplyUsername")
        public String applyUsername;

        @NameInMap("ApproveComment")
        public String approveComment;

        /**
         * <p>The ID of the asset account.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssetAccountId")
        public String assetAccountId;

        /**
         * <p>The username of the asset account.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("AssetAccountName")
        public String assetAccountName;

        /**
         * <p>The IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>10.167.XX.XX</p>
         */
        @NameInMap("AssetAddress")
        public String assetAddress;

        /**
         * <p>The ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssetId")
        public String assetId;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>poros-test</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The network domain ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AssetNetworkDomainId")
        public String assetNetworkDomainId;

        /**
         * <p>The operating system of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("AssetOs")
        public String assetOs;

        /**
         * <p>The name of the asset source to which the asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>Local</strong>: an on-premises host.</li>
         * <li><strong>Ecs</strong>: an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>Rds</strong>: an ApsaraDB RDS instance.</li>
         * <li>A third-party asset source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Local</p>
         */
        @NameInMap("AssetSource")
        public String assetSource;

        /**
         * <p>The ID of the asset source to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssetSourceInstanceId")
        public String assetSourceInstanceId;

        /**
         * <p>The time when the O\&amp;M application was submitted. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669965908</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("EffectCount")
        public Integer effectCount;

        @NameInMap("EffectEndTime")
        public Integer effectEndTime;

        @NameInMap("EffectStartTime")
        public Integer effectStartTime;

        /**
         * <p>The ID of the O\&amp;M application to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperationTicketId")
        public String operationTicketId;

        /**
         * <p>The O\&amp;M protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        /**
         * <p>The status of the review. Valid value:</p>
         * <ul>
         * <li>Normal: to be reviewed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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

        public ListOperationTicketsResponseBodyOperationTickets setApproveComment(String approveComment) {
            this.approveComment = approveComment;
            return this;
        }
        public String getApproveComment() {
            return this.approveComment;
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

        public ListOperationTicketsResponseBodyOperationTickets setEffectCount(Integer effectCount) {
            this.effectCount = effectCount;
            return this;
        }
        public Integer getEffectCount() {
            return this.effectCount;
        }

        public ListOperationTicketsResponseBodyOperationTickets setEffectEndTime(Integer effectEndTime) {
            this.effectEndTime = effectEndTime;
            return this;
        }
        public Integer getEffectEndTime() {
            return this.effectEndTime;
        }

        public ListOperationTicketsResponseBodyOperationTickets setEffectStartTime(Integer effectStartTime) {
            this.effectStartTime = effectStartTime;
            return this;
        }
        public Integer getEffectStartTime() {
            return this.effectStartTime;
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
