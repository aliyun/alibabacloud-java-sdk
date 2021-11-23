// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeVATInvoiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeVATInvoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceResponseBody self = new RecognizeVATInvoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVATInvoiceResponseBody setData(RecognizeVATInvoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVATInvoiceResponseBodyData getData() {
        return this.data;
    }

    public RecognizeVATInvoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeVATInvoiceResponseBodyDataBox extends TeaModel {
        @NameInMap("Checkers")
        public java.util.List<Float> checkers;

        @NameInMap("Clerks")
        public java.util.List<Float> clerks;

        @NameInMap("InvoiceAmounts")
        public java.util.List<Float> invoiceAmounts;

        @NameInMap("InvoiceCodes")
        public java.util.List<Float> invoiceCodes;

        @NameInMap("InvoiceDates")
        public java.util.List<Float> invoiceDates;

        @NameInMap("InvoiceFakeCodes")
        public java.util.List<Float> invoiceFakeCodes;

        @NameInMap("InvoiceNoes")
        public java.util.List<Float> invoiceNoes;

        @NameInMap("PayeeAddresses")
        public java.util.List<Float> payeeAddresses;

        @NameInMap("PayeeBankNames")
        public java.util.List<Float> payeeBankNames;

        @NameInMap("PayeeNames")
        public java.util.List<Float> payeeNames;

        @NameInMap("PayeeRegisterNoes")
        public java.util.List<Float> payeeRegisterNoes;

        @NameInMap("Payees")
        public java.util.List<Float> payees;

        @NameInMap("PayerAddresses")
        public java.util.List<Float> payerAddresses;

        @NameInMap("PayerBankNames")
        public java.util.List<Float> payerBankNames;

        @NameInMap("PayerNames")
        public java.util.List<Float> payerNames;

        @NameInMap("PayerRegisterNoes")
        public java.util.List<Float> payerRegisterNoes;

        @NameInMap("SumAmounts")
        public java.util.List<Float> sumAmounts;

        @NameInMap("TaxAmounts")
        public java.util.List<Float> taxAmounts;

        @NameInMap("WithoutTaxAmounts")
        public java.util.List<Float> withoutTaxAmounts;

        public static RecognizeVATInvoiceResponseBodyDataBox build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVATInvoiceResponseBodyDataBox self = new RecognizeVATInvoiceResponseBodyDataBox();
            return TeaModel.build(map, self);
        }

        public RecognizeVATInvoiceResponseBodyDataBox setCheckers(java.util.List<Float> checkers) {
            this.checkers = checkers;
            return this;
        }
        public java.util.List<Float> getCheckers() {
            return this.checkers;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setClerks(java.util.List<Float> clerks) {
            this.clerks = clerks;
            return this;
        }
        public java.util.List<Float> getClerks() {
            return this.clerks;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setInvoiceAmounts(java.util.List<Float> invoiceAmounts) {
            this.invoiceAmounts = invoiceAmounts;
            return this;
        }
        public java.util.List<Float> getInvoiceAmounts() {
            return this.invoiceAmounts;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setInvoiceCodes(java.util.List<Float> invoiceCodes) {
            this.invoiceCodes = invoiceCodes;
            return this;
        }
        public java.util.List<Float> getInvoiceCodes() {
            return this.invoiceCodes;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setInvoiceDates(java.util.List<Float> invoiceDates) {
            this.invoiceDates = invoiceDates;
            return this;
        }
        public java.util.List<Float> getInvoiceDates() {
            return this.invoiceDates;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setInvoiceFakeCodes(java.util.List<Float> invoiceFakeCodes) {
            this.invoiceFakeCodes = invoiceFakeCodes;
            return this;
        }
        public java.util.List<Float> getInvoiceFakeCodes() {
            return this.invoiceFakeCodes;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setInvoiceNoes(java.util.List<Float> invoiceNoes) {
            this.invoiceNoes = invoiceNoes;
            return this;
        }
        public java.util.List<Float> getInvoiceNoes() {
            return this.invoiceNoes;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayeeAddresses(java.util.List<Float> payeeAddresses) {
            this.payeeAddresses = payeeAddresses;
            return this;
        }
        public java.util.List<Float> getPayeeAddresses() {
            return this.payeeAddresses;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayeeBankNames(java.util.List<Float> payeeBankNames) {
            this.payeeBankNames = payeeBankNames;
            return this;
        }
        public java.util.List<Float> getPayeeBankNames() {
            return this.payeeBankNames;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayeeNames(java.util.List<Float> payeeNames) {
            this.payeeNames = payeeNames;
            return this;
        }
        public java.util.List<Float> getPayeeNames() {
            return this.payeeNames;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayeeRegisterNoes(java.util.List<Float> payeeRegisterNoes) {
            this.payeeRegisterNoes = payeeRegisterNoes;
            return this;
        }
        public java.util.List<Float> getPayeeRegisterNoes() {
            return this.payeeRegisterNoes;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayees(java.util.List<Float> payees) {
            this.payees = payees;
            return this;
        }
        public java.util.List<Float> getPayees() {
            return this.payees;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayerAddresses(java.util.List<Float> payerAddresses) {
            this.payerAddresses = payerAddresses;
            return this;
        }
        public java.util.List<Float> getPayerAddresses() {
            return this.payerAddresses;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayerBankNames(java.util.List<Float> payerBankNames) {
            this.payerBankNames = payerBankNames;
            return this;
        }
        public java.util.List<Float> getPayerBankNames() {
            return this.payerBankNames;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayerNames(java.util.List<Float> payerNames) {
            this.payerNames = payerNames;
            return this;
        }
        public java.util.List<Float> getPayerNames() {
            return this.payerNames;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setPayerRegisterNoes(java.util.List<Float> payerRegisterNoes) {
            this.payerRegisterNoes = payerRegisterNoes;
            return this;
        }
        public java.util.List<Float> getPayerRegisterNoes() {
            return this.payerRegisterNoes;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setSumAmounts(java.util.List<Float> sumAmounts) {
            this.sumAmounts = sumAmounts;
            return this;
        }
        public java.util.List<Float> getSumAmounts() {
            return this.sumAmounts;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setTaxAmounts(java.util.List<Float> taxAmounts) {
            this.taxAmounts = taxAmounts;
            return this;
        }
        public java.util.List<Float> getTaxAmounts() {
            return this.taxAmounts;
        }

        public RecognizeVATInvoiceResponseBodyDataBox setWithoutTaxAmounts(java.util.List<Float> withoutTaxAmounts) {
            this.withoutTaxAmounts = withoutTaxAmounts;
            return this;
        }
        public java.util.List<Float> getWithoutTaxAmounts() {
            return this.withoutTaxAmounts;
        }

    }

    public static class RecognizeVATInvoiceResponseBodyDataContent extends TeaModel {
        @NameInMap("AntiFakeCode")
        public String antiFakeCode;

        @NameInMap("Checker")
        public String checker;

        @NameInMap("Clerk")
        public String clerk;

        @NameInMap("InvoiceAmount")
        public String invoiceAmount;

        @NameInMap("InvoiceCode")
        public String invoiceCode;

        @NameInMap("InvoiceDate")
        public String invoiceDate;

        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("Payee")
        public String payee;

        @NameInMap("PayeeAddress")
        public String payeeAddress;

        @NameInMap("PayeeBankName")
        public String payeeBankName;

        @NameInMap("PayeeName")
        public String payeeName;

        @NameInMap("PayeeRegisterNo")
        public String payeeRegisterNo;

        @NameInMap("PayerAddress")
        public String payerAddress;

        @NameInMap("PayerBankName")
        public String payerBankName;

        @NameInMap("PayerName")
        public String payerName;

        @NameInMap("PayerRegisterNo")
        public String payerRegisterNo;

        @NameInMap("SumAmount")
        public String sumAmount;

        @NameInMap("TaxAmount")
        public String taxAmount;

        @NameInMap("WithoutTaxAmount")
        public String withoutTaxAmount;

        public static RecognizeVATInvoiceResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVATInvoiceResponseBodyDataContent self = new RecognizeVATInvoiceResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public RecognizeVATInvoiceResponseBodyDataContent setAntiFakeCode(String antiFakeCode) {
            this.antiFakeCode = antiFakeCode;
            return this;
        }
        public String getAntiFakeCode() {
            return this.antiFakeCode;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setChecker(String checker) {
            this.checker = checker;
            return this;
        }
        public String getChecker() {
            return this.checker;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setClerk(String clerk) {
            this.clerk = clerk;
            return this;
        }
        public String getClerk() {
            return this.clerk;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setInvoiceAmount(String invoiceAmount) {
            this.invoiceAmount = invoiceAmount;
            return this;
        }
        public String getInvoiceAmount() {
            return this.invoiceAmount;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setInvoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayee(String payee) {
            this.payee = payee;
            return this;
        }
        public String getPayee() {
            return this.payee;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayeeAddress(String payeeAddress) {
            this.payeeAddress = payeeAddress;
            return this;
        }
        public String getPayeeAddress() {
            return this.payeeAddress;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayeeBankName(String payeeBankName) {
            this.payeeBankName = payeeBankName;
            return this;
        }
        public String getPayeeBankName() {
            return this.payeeBankName;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayeeName(String payeeName) {
            this.payeeName = payeeName;
            return this;
        }
        public String getPayeeName() {
            return this.payeeName;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayeeRegisterNo(String payeeRegisterNo) {
            this.payeeRegisterNo = payeeRegisterNo;
            return this;
        }
        public String getPayeeRegisterNo() {
            return this.payeeRegisterNo;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayerAddress(String payerAddress) {
            this.payerAddress = payerAddress;
            return this;
        }
        public String getPayerAddress() {
            return this.payerAddress;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayerBankName(String payerBankName) {
            this.payerBankName = payerBankName;
            return this;
        }
        public String getPayerBankName() {
            return this.payerBankName;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayerName(String payerName) {
            this.payerName = payerName;
            return this;
        }
        public String getPayerName() {
            return this.payerName;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setPayerRegisterNo(String payerRegisterNo) {
            this.payerRegisterNo = payerRegisterNo;
            return this;
        }
        public String getPayerRegisterNo() {
            return this.payerRegisterNo;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setSumAmount(String sumAmount) {
            this.sumAmount = sumAmount;
            return this;
        }
        public String getSumAmount() {
            return this.sumAmount;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public RecognizeVATInvoiceResponseBodyDataContent setWithoutTaxAmount(String withoutTaxAmount) {
            this.withoutTaxAmount = withoutTaxAmount;
            return this;
        }
        public String getWithoutTaxAmount() {
            return this.withoutTaxAmount;
        }

    }

    public static class RecognizeVATInvoiceResponseBodyData extends TeaModel {
        @NameInMap("Box")
        public RecognizeVATInvoiceResponseBodyDataBox box;

        @NameInMap("Content")
        public RecognizeVATInvoiceResponseBodyDataContent content;

        public static RecognizeVATInvoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVATInvoiceResponseBodyData self = new RecognizeVATInvoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVATInvoiceResponseBodyData setBox(RecognizeVATInvoiceResponseBodyDataBox box) {
            this.box = box;
            return this;
        }
        public RecognizeVATInvoiceResponseBodyDataBox getBox() {
            return this.box;
        }

        public RecognizeVATInvoiceResponseBodyData setContent(RecognizeVATInvoiceResponseBodyDataContent content) {
            this.content = content;
            return this;
        }
        public RecognizeVATInvoiceResponseBodyDataContent getContent() {
            return this.content;
        }

    }

}
