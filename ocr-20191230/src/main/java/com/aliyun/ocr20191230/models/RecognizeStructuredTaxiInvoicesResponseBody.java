// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStructuredTaxiInvoicesResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeStructuredTaxiInvoicesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeStructuredTaxiInvoicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStructuredTaxiInvoicesResponseBody self = new RecognizeStructuredTaxiInvoicesResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeStructuredTaxiInvoicesResponseBody setData(RecognizeStructuredTaxiInvoicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeStructuredTaxiInvoicesResponseBodyData getData() {
        return this.data;
    }

    public RecognizeStructuredTaxiInvoicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeStructuredTaxiInvoicesResponseBodyData extends TeaModel {
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        @NameInMap("CellPhoneNumbers")
        public java.util.List<String> cellPhoneNumbers;

        @NameInMap("Companies")
        public java.util.List<String> companies;

        @NameInMap("Departments")
        public java.util.List<String> departments;

        @NameInMap("Emails")
        public java.util.List<String> emails;

        @NameInMap("Name")
        public String name;

        @NameInMap("OfficePhoneNumbers")
        public java.util.List<String> officePhoneNumbers;

        @NameInMap("Titles")
        public java.util.List<String> titles;

        public static RecognizeStructuredTaxiInvoicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStructuredTaxiInvoicesResponseBodyData self = new RecognizeStructuredTaxiInvoicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setCellPhoneNumbers(java.util.List<String> cellPhoneNumbers) {
            this.cellPhoneNumbers = cellPhoneNumbers;
            return this;
        }
        public java.util.List<String> getCellPhoneNumbers() {
            return this.cellPhoneNumbers;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setCompanies(java.util.List<String> companies) {
            this.companies = companies;
            return this;
        }
        public java.util.List<String> getCompanies() {
            return this.companies;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setDepartments(java.util.List<String> departments) {
            this.departments = departments;
            return this;
        }
        public java.util.List<String> getDepartments() {
            return this.departments;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setEmails(java.util.List<String> emails) {
            this.emails = emails;
            return this;
        }
        public java.util.List<String> getEmails() {
            return this.emails;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setOfficePhoneNumbers(java.util.List<String> officePhoneNumbers) {
            this.officePhoneNumbers = officePhoneNumbers;
            return this;
        }
        public java.util.List<String> getOfficePhoneNumbers() {
            return this.officePhoneNumbers;
        }

        public RecognizeStructuredTaxiInvoicesResponseBodyData setTitles(java.util.List<String> titles) {
            this.titles = titles;
            return this;
        }
        public java.util.List<String> getTitles() {
            return this.titles;
        }

    }

}
