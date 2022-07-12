// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbjOperateRequest extends TeaModel {
    @NameInMap("Amount")
    public String amount;

    @NameInMap("ApplyNo")
    public String applyNo;

    @NameInMap("AuditStatus")
    public Boolean auditStatus;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FileDate")
    public String fileDate;

    @NameInMap("FileOssKey")
    public String fileOssKey;

    @NameInMap("Message")
    public String message;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("OrderNo")
    public String orderNo;

    @NameInMap("ReceiptOssKey")
    public String receiptOssKey;

    @NameInMap("SubmittedSuccess")
    public Boolean submittedSuccess;

    public static SbjOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        SbjOperateRequest self = new SbjOperateRequest();
        return TeaModel.build(map, self);
    }

    public SbjOperateRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SbjOperateRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public SbjOperateRequest setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Boolean getAuditStatus() {
        return this.auditStatus;
    }

    public SbjOperateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SbjOperateRequest setFileDate(String fileDate) {
        this.fileDate = fileDate;
        return this;
    }
    public String getFileDate() {
        return this.fileDate;
    }

    public SbjOperateRequest setFileOssKey(String fileOssKey) {
        this.fileOssKey = fileOssKey;
        return this;
    }
    public String getFileOssKey() {
        return this.fileOssKey;
    }

    public SbjOperateRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SbjOperateRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SbjOperateRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SbjOperateRequest setReceiptOssKey(String receiptOssKey) {
        this.receiptOssKey = receiptOssKey;
        return this;
    }
    public String getReceiptOssKey() {
        return this.receiptOssKey;
    }

    public SbjOperateRequest setSubmittedSuccess(Boolean submittedSuccess) {
        this.submittedSuccess = submittedSuccess;
        return this;
    }
    public Boolean getSubmittedSuccess() {
        return this.submittedSuccess;
    }

}
