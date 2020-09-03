// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessCardResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeBusinessCardResponseData data;

    public static RecognizeBusinessCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessCardResponse self = new RecognizeBusinessCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessCardResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeBusinessCardResponse setData(RecognizeBusinessCardResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeBusinessCardResponseData getData() {
        return this.data;
    }

    public static class RecognizeBusinessCardResponseData extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Companies")
        @Validation(required = true)
        public java.util.List<String> companies;

        @NameInMap("Departments")
        @Validation(required = true)
        public java.util.List<String> departments;

        @NameInMap("Titles")
        @Validation(required = true)
        public java.util.List<String> titles;

        @NameInMap("CellPhoneNumbers")
        @Validation(required = true)
        public java.util.List<String> cellPhoneNumbers;

        @NameInMap("OfficePhoneNumbers")
        @Validation(required = true)
        public java.util.List<String> officePhoneNumbers;

        @NameInMap("Addresses")
        @Validation(required = true)
        public java.util.List<String> addresses;

        @NameInMap("Emails")
        @Validation(required = true)
        public java.util.List<String> emails;

        public static RecognizeBusinessCardResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeBusinessCardResponseData self = new RecognizeBusinessCardResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeBusinessCardResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeBusinessCardResponseData setCompanies(java.util.List<String> companies) {
            this.companies = companies;
            return this;
        }
        public java.util.List<String> getCompanies() {
            return this.companies;
        }

        public RecognizeBusinessCardResponseData setDepartments(java.util.List<String> departments) {
            this.departments = departments;
            return this;
        }
        public java.util.List<String> getDepartments() {
            return this.departments;
        }

        public RecognizeBusinessCardResponseData setTitles(java.util.List<String> titles) {
            this.titles = titles;
            return this;
        }
        public java.util.List<String> getTitles() {
            return this.titles;
        }

        public RecognizeBusinessCardResponseData setCellPhoneNumbers(java.util.List<String> cellPhoneNumbers) {
            this.cellPhoneNumbers = cellPhoneNumbers;
            return this;
        }
        public java.util.List<String> getCellPhoneNumbers() {
            return this.cellPhoneNumbers;
        }

        public RecognizeBusinessCardResponseData setOfficePhoneNumbers(java.util.List<String> officePhoneNumbers) {
            this.officePhoneNumbers = officePhoneNumbers;
            return this;
        }
        public java.util.List<String> getOfficePhoneNumbers() {
            return this.officePhoneNumbers;
        }

        public RecognizeBusinessCardResponseData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public RecognizeBusinessCardResponseData setEmails(java.util.List<String> emails) {
            this.emails = emails;
            return this;
        }
        public java.util.List<String> getEmails() {
            return this.emails;
        }

    }

}
