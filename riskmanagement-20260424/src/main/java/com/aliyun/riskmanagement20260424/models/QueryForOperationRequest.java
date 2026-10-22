// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryForOperationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1791937232000</p>
     */
    @NameInMap("ApplyTimeEnd")
    public Long applyTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1791937132000</p>
     */
    @NameInMap("ApplyTimeStart")
    public Long applyTimeStart;

    /**
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <strong>example:</strong>
     * <p>1791937232000</p>
     */
    @NameInMap("AuditTimeEnd")
    public Long auditTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1791937132000</p>
     */
    @NameInMap("AuditTimeStart")
    public Long auditTimeStart;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>1647796581073291</p>
     */
    @NameInMap("CustomerUid")
    public String customerUid;

    /**
     * <strong>example:</strong>
     * <p>12.3*.22.11</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>approved</p>
     */
    @NameInMap("Status")
    public String status;

    public static QueryForOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryForOperationRequest self = new QueryForOperationRequest();
        return TeaModel.build(map, self);
    }

    public QueryForOperationRequest setApplyTimeEnd(Long applyTimeEnd) {
        this.applyTimeEnd = applyTimeEnd;
        return this;
    }
    public Long getApplyTimeEnd() {
        return this.applyTimeEnd;
    }

    public QueryForOperationRequest setApplyTimeStart(Long applyTimeStart) {
        this.applyTimeStart = applyTimeStart;
        return this;
    }
    public Long getApplyTimeStart() {
        return this.applyTimeStart;
    }

    public QueryForOperationRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public QueryForOperationRequest setAuditTimeEnd(Long auditTimeEnd) {
        this.auditTimeEnd = auditTimeEnd;
        return this;
    }
    public Long getAuditTimeEnd() {
        return this.auditTimeEnd;
    }

    public QueryForOperationRequest setAuditTimeStart(Long auditTimeStart) {
        this.auditTimeStart = auditTimeStart;
        return this;
    }
    public Long getAuditTimeStart() {
        return this.auditTimeStart;
    }

    public QueryForOperationRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryForOperationRequest setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public String getCustomerUid() {
        return this.customerUid;
    }

    public QueryForOperationRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryForOperationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryForOperationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
