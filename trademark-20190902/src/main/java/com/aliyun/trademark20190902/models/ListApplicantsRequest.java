// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListApplicantsRequest extends TeaModel {
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

    @NameInMap("CardNumber")
    public String cardNumber;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("SystemVersion")
    public String systemVersion;

    public static ListApplicantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicantsRequest self = new ListApplicantsRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicantsRequest setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public ListApplicantsRequest setApplicantRegion(Integer applicantRegion) {
        this.applicantRegion = applicantRegion;
        return this;
    }
    public Integer getApplicantRegion() {
        return this.applicantRegion;
    }

    public ListApplicantsRequest setApplicantType(Integer applicantType) {
        this.applicantType = applicantType;
        return this;
    }
    public Integer getApplicantType() {
        return this.applicantType;
    }

    public ListApplicantsRequest setApplicantVersion(String applicantVersion) {
        this.applicantVersion = applicantVersion;
        return this;
    }
    public String getApplicantVersion() {
        return this.applicantVersion;
    }

    public ListApplicantsRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public ListApplicantsRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public ListApplicantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicantsRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public ListApplicantsRequest setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
        return this;
    }
    public String getSystemVersion() {
        return this.systemVersion;
    }

}
