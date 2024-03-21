// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListApplicantsResponseBody extends TeaModel {
    @NameInMap("Applicants")
    public ListApplicantsResponseBodyApplicants applicants;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicantsResponseBody self = new ListApplicantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicantsResponseBody setApplicants(ListApplicantsResponseBodyApplicants applicants) {
        this.applicants = applicants;
        return this;
    }
    public ListApplicantsResponseBodyApplicants getApplicants() {
        return this.applicants;
    }

    public ListApplicantsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicantsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicantsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicantsResponseBodyApplicantsApplicant extends TeaModel {
        @NameInMap("ApplicantId")
        public Long applicantId;

        @NameInMap("ApplicantName")
        public String applicantName;

        @NameInMap("ApplicantRegion")
        public Integer applicantRegion;

        @NameInMap("ApplicantType")
        public Integer applicantType;

        @NameInMap("ApplicantVersion")
        public String applicantVersion;

        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("AuthorizationAuditStatus")
        public Integer authorizationAuditStatus;

        @NameInMap("AuthorizationUrl")
        public String authorizationUrl;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("PrincipalName")
        public Integer principalName;

        @NameInMap("SystemVersion")
        public String systemVersion;

        @NameInMap("ValidDate")
        public Long validDate;

        public static ListApplicantsResponseBodyApplicantsApplicant build(java.util.Map<String, ?> map) throws Exception {
            ListApplicantsResponseBodyApplicantsApplicant self = new ListApplicantsResponseBodyApplicantsApplicant();
            return TeaModel.build(map, self);
        }

        public ListApplicantsResponseBodyApplicantsApplicant setApplicantId(Long applicantId) {
            this.applicantId = applicantId;
            return this;
        }
        public Long getApplicantId() {
            return this.applicantId;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setApplicantRegion(Integer applicantRegion) {
            this.applicantRegion = applicantRegion;
            return this;
        }
        public Integer getApplicantRegion() {
            return this.applicantRegion;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setApplicantType(Integer applicantType) {
            this.applicantType = applicantType;
            return this;
        }
        public Integer getApplicantType() {
            return this.applicantType;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setApplicantVersion(String applicantVersion) {
            this.applicantVersion = applicantVersion;
            return this;
        }
        public String getApplicantVersion() {
            return this.applicantVersion;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setAuthorizationAuditStatus(Integer authorizationAuditStatus) {
            this.authorizationAuditStatus = authorizationAuditStatus;
            return this;
        }
        public Integer getAuthorizationAuditStatus() {
            return this.authorizationAuditStatus;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }
        public String getAuthorizationUrl() {
            return this.authorizationUrl;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setPrincipalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }
        public Integer getPrincipalName() {
            return this.principalName;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setSystemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            return this;
        }
        public String getSystemVersion() {
            return this.systemVersion;
        }

        public ListApplicantsResponseBodyApplicantsApplicant setValidDate(Long validDate) {
            this.validDate = validDate;
            return this;
        }
        public Long getValidDate() {
            return this.validDate;
        }

    }

    public static class ListApplicantsResponseBodyApplicants extends TeaModel {
        @NameInMap("Applicant")
        public java.util.List<ListApplicantsResponseBodyApplicantsApplicant> applicant;

        public static ListApplicantsResponseBodyApplicants build(java.util.Map<String, ?> map) throws Exception {
            ListApplicantsResponseBodyApplicants self = new ListApplicantsResponseBodyApplicants();
            return TeaModel.build(map, self);
        }

        public ListApplicantsResponseBodyApplicants setApplicant(java.util.List<ListApplicantsResponseBodyApplicantsApplicant> applicant) {
            this.applicant = applicant;
            return this;
        }
        public java.util.List<ListApplicantsResponseBodyApplicantsApplicant> getApplicant() {
            return this.applicant;
        }

    }

}
