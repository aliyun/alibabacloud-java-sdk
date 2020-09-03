// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVATInvoiceResponseData data;

    public static RecognizeVATInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceResponse self = new RecognizeVATInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVATInvoiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeVATInvoiceResponse setData(RecognizeVATInvoiceResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeVATInvoiceResponseData getData() {
        return this.data;
    }

    public static class RecognizeVATInvoiceResponseDataContent extends TeaModel {
        @NameInMap("InvoiceCode")
        @Validation(required = true)
        public String invoiceCode;

        @NameInMap("InvoiceNo")
        @Validation(required = true)
        public String invoiceNo;

        @NameInMap("InvoiceDate")
        @Validation(required = true)
        public String invoiceDate;

        @NameInMap("AntiFakeCode")
        @Validation(required = true)
        public String antiFakeCode;

        @NameInMap("PayerName")
        @Validation(required = true)
        public String payerName;

        @NameInMap("PayerRegisterNo")
        @Validation(required = true)
        public String payerRegisterNo;

        @NameInMap("PayerAddress")
        @Validation(required = true)
        public String payerAddress;

        @NameInMap("PayerBankName")
        @Validation(required = true)
        public String payerBankName;

        @NameInMap("WithoutTaxAmount")
        @Validation(required = true)
        public String withoutTaxAmount;

        @NameInMap("TaxAmount")
        @Validation(required = true)
        public String taxAmount;

        @NameInMap("SumAmount")
        @Validation(required = true)
        public String sumAmount;

        @NameInMap("InvoiceAmount")
        @Validation(required = true)
        public String invoiceAmount;

        @NameInMap("PayeeName")
        @Validation(required = true)
        public String payeeName;

        @NameInMap("PayeeRegisterNo")
        @Validation(required = true)
        public String payeeRegisterNo;

        @NameInMap("PayeeAddress")
        @Validation(required = true)
        public String payeeAddress;

        @NameInMap("PayeeBankName")
        @Validation(required = true)
        public String payeeBankName;

        @NameInMap("Payee")
        @Validation(required = true)
        public String payee;

        @NameInMap("Checker")
        @Validation(required = true)
        public String checker;

        @NameInMap("Clerk")
        @Validation(required = true)
        public String clerk;

        public static RecognizeVATInvoiceResponseDataContent build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVATInvoiceResponseDataContent self = new RecognizeVATInvoiceResponseDataContent();
            return TeaModel.build(map, self);
        }

        public RecognizeVATInvoiceResponseDataContent setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public RecognizeVATInvoiceResponseDataContent setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public RecognizeVATInvoiceResponseDataContent setInvoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        public RecognizeVATInvoiceResponseDataContent setAntiFakeCode(String antiFakeCode) {
            this.antiFakeCode = antiFakeCode;
            return this;
        }
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        public RecognizeVATInvoiceResponseDataContent setPayerName(String payerName) {
            this.payerName = payerName;
            return this;
        }
        public String getPayerName() {
            return this.payerName;
        }

        public RecognizeVATInvoiceResponseDataContent setPayerRegisterNo(String payerRegisterNo) {
            this.payerRegisterNo = payerRegisterNo;
            return this;
        }
        public String getPayerRegisterNo() {
            return this.payerRegisterNo;
        }

        public RecognizeVATInvoiceResponseDataContent setPayerAddress(String payerAddress) {
            this.payerAddress = payerAddress;
            return this;
        }
        public String getPayerAddress() {
            return this.payerAddress;
        }

        public RecognizeVATInvoiceResponseDataContent setPayerBankName(String payerBankName) {
            this.payerBankName = payerBankName;
            return this;
        }
        public String getPayerBankName() {
            return this.payerBankName;
        }

        public RecognizeVATInvoiceResponseDataContent setWithoutTaxAmount(String withoutTaxAmount) {
            this.withoutTaxAmount = withoutTaxAmount;
            return this;
        }
        public String getWithoutTaxAmount() {
            return this.withoutTaxAmount;
        }

        public RecognizeVATInvoiceResponseDataContent setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public RecognizeVATInvoiceResponseDataContent setSumAmount(String sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }
        public String getSumAmount() {
            return this.sumAmount;
        }

        public RecognizeVATInvoiceResponseDataContent setInvoiceAmount(String invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            return this;
        }
        public String getInvoiceAmount() {
            return this.invoiceAmount;
        }

        public RecognizeVATInvoiceResponseDataContent setPayeeName(String payeeName) {
            this.payeeName = payeeName;
            return this;
        }
        public String getPayeeName() {
            return this.payeeName;
        }

        public RecognizeVATInvoiceResponseDataContent setPayeeRegisterNo(String payeeRegisterNo) {
            this.payeeRegisterNo = payeeRegisterNo;
            return this;
        }
        public String getPayeeRegisterNo() {
            return this.payeeRegisterNo;
        }

        public RecognizeVATInvoiceResponseDataContent setPayeeAddress(String payeeAddress) {
            this.payeeAddress = payeeAddress;
            return this;
        }
        public String getPayeeAddress() {
            return this.payeeAddress;
        }

        public RecognizeVATInvoiceResponseDataContent setPayeeBankName(String payeeBankName) {
            this.payeeBankName = payeeBankName;
            return this;
        }
        public String getPayeeBankName() {
            return this.payeeBankName;
        }

        public RecognizeVATInvoiceResponseDataContent setPayee(String payee) {
            this.payee = payee;
            return this;
        }
        public String getPayee() {
            return this.payee;
        }

        public RecognizeVATInvoiceResponseDataContent setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public RecognizeVATInvoiceResponseDataContent setClerk(String clerk) {
            this.clerk = clerk;
            return this;
        }
        public String getClerk() {
            return this.clerk;
        }

    }

    public static class RecognizeVATInvoiceResponseDataBox extends TeaModel {
        @NameInMap("InvoiceCodes")
        @Validation(required = true)
        public java.util.List<Float> invoiceCodes;

        @NameInMap("InvoiceNoes")
        @Validation(required = true)
        public java.util.List<Float> invoiceNoes;

        @NameInMap("InvoiceDates")
        @Validation(required = true)
        public java.util.List<Float> invoiceDates;

        @NameInMap("InvoiceFakeCodes")
        @Validation(required = true)
        public java.util.List<Float> invoiceFakeCodes;

        @NameInMap("PayerNames")
        @Validation(required = true)
        public java.util.List<Float> payerNames;

        @NameInMap("PayerRegisterNoes")
        @Validation(required = true)
        public java.util.List<Float> payerRegisterNoes;

        @NameInMap("PayerAddresses")
        @Validation(required = true)
        public java.util.List<Float> payerAddresses;

        @NameInMap("PayerBankNames")
        @Validation(required = true)
        public java.util.List<Float> payerBankNames;

        @NameInMap("WithoutTaxAmounts")
        @Validation(required = true)
        public java.util.List<Float> withoutTaxAmounts;

        @NameInMap("TaxAmounts")
        @Validation(required = true)
        public java.util.List<Float> taxAmounts;

        @NameInMap("SumAmounts")
        @Validation(required = true)
        public java.util.List<Float> sumAmounts;

        @NameInMap("InvoiceAmounts")
        @Validation(required = true)
        public java.util.List<Float> invoiceAmounts;

        @NameInMap("PayeeNames")
        @Validation(required = true)
        public java.util.List<Float> payeeNames;

        @NameInMap("PayeeRegisterNoes")
        @Validation(required = true)
        public java.util.List<Float> payeeRegisterNoes;

        @NameInMap("PayeeAddresses")
        @Validation(required = true)
        public java.util.List<Float> payeeAddresses;

        @NameInMap("PayeeBankNames")
        @Validation(required = true)
        public java.util.List<Float> payeeBankNames;

        @NameInMap("Payees")
        @Validation(required = true)
        public java.util.List<Float> payees;

        @NameInMap("Checkers")
        @Validation(required = true)
        public java.util.List<Float> checkers;

        @NameInMap("Clerks")
        @Validation(required = true)
        public java.util.List<Float> clerks;

        public static RecognizeVATInvoiceResponseDataBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVATInvoiceResponseDataBox self = new RecognizeVATInvoiceResponseDataBox();
            return TeaModel.build(map, self);
        }

        public RecognizeVATInvoiceResponseDataBox setInvoiceCodes(java.util.List<Float> invoiceCodes) {
            this.invoiceCodes = invoiceCodes;
            return this;
        }
        public java.util.List<Float> getInvoiceCodes() {
            return this.invoiceCodes;
        }

        public RecognizeVATInvoiceResponseDataBox setInvoiceNoes(java.util.List<Float> invoiceNoes) {
            this.invoiceNoes = invoiceNoes;
            return this;
        }
        public java.util.List<Float> getInvoiceNoes() {
            return this.invoiceNoes;
        }

        public RecognizeVATInvoiceResponseDataBox setInvoiceDates(java.util.List<Float> invoiceDates) {
            this.invoiceDates = invoiceDates;
            return this;
        }
        public java.util.List<Float> getInvoiceDates() {
            return this.invoiceDates;
        }

        public RecognizeVATInvoiceResponseDataBox setInvoiceFakeCodes(java.util.List<Float> invoiceFakeCodes) {
            this.invoiceFakeCodes = invoiceFakeCodes;
            return this;
        }
        public java.util.List<Float> getInvoiceFakeCodes() {
            return this.invoiceFakeCodes;
        }

        public RecognizeVATInvoiceResponseDataBox setPayerNames(java.util.List<Float> payerNames) {
            this.payerNames = payerNames;
            return this;
        }
        public java.util.List<Float> getPayerNames() {
            return this.payerNames;
        }

        public RecognizeVATInvoiceResponseDataBox setPayerRegisterNoes(java.util.List<Float> payerRegisterNoes) {
            this.payerRegisterNoes = payerRegisterNoes;
            return this;
        }
        public java.util.List<Float> getPayerRegisterNoes() {
            return this.payerRegisterNoes;
        }

        public RecognizeVATInvoiceResponseDataBox setPayerAddresses(java.util.List<Float> payerAddresses) {
            this.payerAddresses = payerAddresses;
            return this;
        }
        public java.util.List<Float> getPayerAddresses() {
            return this.payerAddresses;
        }

        public RecognizeVATInvoiceResponseDataBox setPayerBankNames(java.util.List<Float> payerBankNames) {
            this.payerBankNames = payerBankNames;
            return this;
        }
        public java.util.List<Float> getPayerBankNames() {
            return this.payerBankNames;
        }

        public RecognizeVATInvoiceResponseDataBox setWithoutTaxAmounts(java.util.List<Float> withoutTaxAmounts) {
            this.withoutTaxAmounts = withoutTaxAmounts;
            return this;
        }
        public java.util.List<Float> getWithoutTaxAmounts() {
            return this.withoutTaxAmounts;
        }

        public RecognizeVATInvoiceResponseDataBox setTaxAmounts(java.util.List<Float> taxAmounts) {
            this.taxAmounts = taxAmounts;
            return this;
        }
        public java.util.List<Float> getTaxAmounts() {
            return this.taxAmounts;
        }

        public RecognizeVATInvoiceResponseDataBox setSumAmounts(java.util.List<Float> sumAmounts) {
            this.sumAmounts = sumAmounts;
            return this;
        }
        public java.util.List<Float> getSumAmounts() {
            return this.sumAmounts;
        }

        public RecognizeVATInvoiceResponseDataBox setInvoiceAmounts(java.util.List<Float> invoiceAmounts) {
            this.invoiceAmounts = invoiceAmounts;
            return this;
        }
        public java.util.List<Float> getInvoiceAmounts() {
            return this.invoiceAmounts;
        }

        public RecognizeVATInvoiceResponseDataBox setPayeeNames(java.util.List<Float> payeeNames) {
            this.payeeNames = payeeNames;
            return this;
        }
        public java.util.List<Float> getPayeeNames() {
            return this.payeeNames;
        }

        public RecognizeVATInvoiceResponseDataBox setPayeeRegisterNoes(java.util.List<Float> payeeRegisterNoes) {
            this.payeeRegisterNoes = payeeRegisterNoes;
            return this;
        }
        public java.util.List<Float> getPayeeRegisterNoes() {
            return this.payeeRegisterNoes;
        }

        public RecognizeVATInvoiceResponseDataBox setPayeeAddresses(java.util.List<Float> payeeAddresses) {
            this.payeeAddresses = payeeAddresses;
            return this;
        }
        public java.util.List<Float> getPayeeAddresses() {
            return this.payeeAddresses;
        }

        public RecognizeVATInvoiceResponseDataBox setPayeeBankNames(java.util.List<Float> payeeBankNames) {
            this.payeeBankNames = payeeBankNames;
            return this;
        }
        public java.util.List<Float> getPayeeBankNames() {
            return this.payeeBankNames;
        }

        public RecognizeVATInvoiceResponseDataBox setPayees(java.util.List<Float> payees) {
            this.payees = payees;
            return this;
        }
        public java.util.List<Float> getPayees() {
            return this.payees;
        }

        public RecognizeVATInvoiceResponseDataBox setCheckers(java.util.List<Float> checkers) {
            this.checkers = checkers;
            return this;
        }
        public java.util.List<Float> getCheckers() {
            return this.checkers;
        }

        public RecognizeVATInvoiceResponseDataBox setClerks(java.util.List<Float> clerks) {
            this.clerks = clerks;
            return this;
        }
        public java.util.List<Float> getClerks() {
            return this.clerks;
        }

    }

    public static class RecognizeVATInvoiceResponseData extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public RecognizeVATInvoiceResponseDataContent content;

        @NameInMap("Box")
        @Validation(required = true)
        public RecognizeVATInvoiceResponseDataBox box;

        public static RecognizeVATInvoiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVATInvoiceResponseData self = new RecognizeVATInvoiceResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeVATInvoiceResponseData setContent(RecognizeVATInvoiceResponseDataContent content) {
            this.content = content;
            return this;
        }
        public RecognizeVATInvoiceResponseDataContent getContent() {
            return this.content;
        }

        public RecognizeVATInvoiceResponseData setBox(RecognizeVATInvoiceResponseDataBox box) {
            this.box = box;
            return this;
        }
        public RecognizeVATInvoiceResponseDataBox getBox() {
            return this.box;
        }

    }

}
