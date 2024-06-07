// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class VerifyVATInvoiceRequest extends TeaModel {
    @NameInMap("InvoiceCode")
    public String invoiceCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvoiceDate")
    public String invoiceDate;

    @NameInMap("InvoiceKind")
    public Integer invoiceKind;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvoiceNo")
    public String invoiceNo;

    @NameInMap("InvoiceSum")
    public String invoiceSum;

    @NameInMap("VerifyCode")
    public String verifyCode;

    public static VerifyVATInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyVATInvoiceRequest self = new VerifyVATInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyVATInvoiceRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public VerifyVATInvoiceRequest setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public VerifyVATInvoiceRequest setInvoiceKind(Integer invoiceKind) {
        this.invoiceKind = invoiceKind;
        return this;
    }
    public Integer getInvoiceKind() {
        return this.invoiceKind;
    }

    public VerifyVATInvoiceRequest setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public VerifyVATInvoiceRequest setInvoiceSum(String invoiceSum) {
        this.invoiceSum = invoiceSum;
        return this;
    }
    public String getInvoiceSum() {
        return this.invoiceSum;
    }

    public VerifyVATInvoiceRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
