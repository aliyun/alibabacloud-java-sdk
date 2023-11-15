// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbjOperateNewRequest extends TeaModel {
    @NameInMap("AddSubmitCount")
    public Boolean addSubmitCount;

    @NameInMap("AllowResubmit")
    public Boolean allowResubmit;

    @NameInMap("Amount")
    public String amount;

    @NameInMap("ApplyNo")
    public String applyNo;

    @NameInMap("AuditStatus")
    public Boolean auditStatus;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ChangeStatus")
    public Boolean changeStatus;

    @NameInMap("ErrorMsgScreenshot")
    public String errorMsgScreenshot;

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

    @NameInMap("SuccessType")
    public String successType;

    public static SbjOperateNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SbjOperateNewRequest self = new SbjOperateNewRequest();
        return TeaModel.build(map, self);
    }

    public SbjOperateNewRequest setAddSubmitCount(Boolean addSubmitCount) {
        this.addSubmitCount = addSubmitCount;
        return this;
    }
    public Boolean getAddSubmitCount() {
        return this.addSubmitCount;
    }

    public SbjOperateNewRequest setAllowResubmit(Boolean allowResubmit) {
        this.allowResubmit = allowResubmit;
        return this;
    }
    public Boolean getAllowResubmit() {
        return this.allowResubmit;
    }

    public SbjOperateNewRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SbjOperateNewRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public SbjOperateNewRequest setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Boolean getAuditStatus() {
        return this.auditStatus;
    }

    public SbjOperateNewRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SbjOperateNewRequest setChangeStatus(Boolean changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }
    public Boolean getChangeStatus() {
        return this.changeStatus;
    }

    public SbjOperateNewRequest setErrorMsgScreenshot(String errorMsgScreenshot) {
        this.errorMsgScreenshot = errorMsgScreenshot;
        return this;
    }
    public String getErrorMsgScreenshot() {
        return this.errorMsgScreenshot;
    }

    public SbjOperateNewRequest setFileDate(String fileDate) {
        this.fileDate = fileDate;
        return this;
    }
    public String getFileDate() {
        return this.fileDate;
    }

    public SbjOperateNewRequest setFileOssKey(String fileOssKey) {
        this.fileOssKey = fileOssKey;
        return this;
    }
    public String getFileOssKey() {
        return this.fileOssKey;
    }

    public SbjOperateNewRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SbjOperateNewRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SbjOperateNewRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SbjOperateNewRequest setReceiptOssKey(String receiptOssKey) {
        this.receiptOssKey = receiptOssKey;
        return this;
    }
    public String getReceiptOssKey() {
        return this.receiptOssKey;
    }

    public SbjOperateNewRequest setSubmittedSuccess(Boolean submittedSuccess) {
        this.submittedSuccess = submittedSuccess;
        return this;
    }
    public Boolean getSubmittedSuccess() {
        return this.submittedSuccess;
    }

    public SbjOperateNewRequest setSuccessType(String successType) {
        this.successType = successType;
        return this;
    }
    public String getSuccessType() {
        return this.successType;
    }

}
