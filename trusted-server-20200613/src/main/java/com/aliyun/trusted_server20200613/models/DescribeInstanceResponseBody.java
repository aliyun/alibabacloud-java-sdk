// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Extensions")
    public String extensions;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("GmtRecentReport")
    public Long gmtRecentReport;

    @NameInMap("OnlineStatus")
    public Integer onlineStatus;

    @NameInMap("ProgramExceptionNum")
    public Integer programExceptionNum;

    @NameInMap("ProgramTrustDetail")
    public String programTrustDetail;

    @NameInMap("ProgramTrustStatus")
    public Integer programTrustStatus;

    @NameInMap("ProgramWhiteListId")
    public Integer programWhiteListId;

    @NameInMap("ProgramWhiteListName")
    public String programWhiteListName;

    @NameInMap("PropertyAffiliation")
    public Integer propertyAffiliation;

    @NameInMap("PropertyName")
    public String propertyName;

    @NameInMap("PropertyPrivateIp")
    public String propertyPrivateIp;

    @NameInMap("PropertyPublicIp")
    public String propertyPublicIp;

    @NameInMap("PropertyUuid")
    public String propertyUuid;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemExceptionNum")
    public Integer systemExceptionNum;

    @NameInMap("SystemTrustDetail")
    public String systemTrustDetail;

    @NameInMap("SystemTrustStatus")
    public Integer systemTrustStatus;

    @NameInMap("SystemWhiteListId")
    public Integer systemWhiteListId;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setExtensions(String extensions) {
        this.extensions = extensions;
        return this;
    }
    public String getExtensions() {
        return this.extensions;
    }

    public DescribeInstanceResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeInstanceResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeInstanceResponseBody setGmtRecentReport(Long gmtRecentReport) {
        this.gmtRecentReport = gmtRecentReport;
        return this;
    }
    public Long getGmtRecentReport() {
        return this.gmtRecentReport;
    }

    public DescribeInstanceResponseBody setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }
    public Integer getOnlineStatus() {
        return this.onlineStatus;
    }

    public DescribeInstanceResponseBody setProgramExceptionNum(Integer programExceptionNum) {
        this.programExceptionNum = programExceptionNum;
        return this;
    }
    public Integer getProgramExceptionNum() {
        return this.programExceptionNum;
    }

    public DescribeInstanceResponseBody setProgramTrustDetail(String programTrustDetail) {
        this.programTrustDetail = programTrustDetail;
        return this;
    }
    public String getProgramTrustDetail() {
        return this.programTrustDetail;
    }

    public DescribeInstanceResponseBody setProgramTrustStatus(Integer programTrustStatus) {
        this.programTrustStatus = programTrustStatus;
        return this;
    }
    public Integer getProgramTrustStatus() {
        return this.programTrustStatus;
    }

    public DescribeInstanceResponseBody setProgramWhiteListId(Integer programWhiteListId) {
        this.programWhiteListId = programWhiteListId;
        return this;
    }
    public Integer getProgramWhiteListId() {
        return this.programWhiteListId;
    }

    public DescribeInstanceResponseBody setProgramWhiteListName(String programWhiteListName) {
        this.programWhiteListName = programWhiteListName;
        return this;
    }
    public String getProgramWhiteListName() {
        return this.programWhiteListName;
    }

    public DescribeInstanceResponseBody setPropertyAffiliation(Integer propertyAffiliation) {
        this.propertyAffiliation = propertyAffiliation;
        return this;
    }
    public Integer getPropertyAffiliation() {
        return this.propertyAffiliation;
    }

    public DescribeInstanceResponseBody setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

    public DescribeInstanceResponseBody setPropertyPrivateIp(String propertyPrivateIp) {
        this.propertyPrivateIp = propertyPrivateIp;
        return this;
    }
    public String getPropertyPrivateIp() {
        return this.propertyPrivateIp;
    }

    public DescribeInstanceResponseBody setPropertyPublicIp(String propertyPublicIp) {
        this.propertyPublicIp = propertyPublicIp;
        return this;
    }
    public String getPropertyPublicIp() {
        return this.propertyPublicIp;
    }

    public DescribeInstanceResponseBody setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setSystemExceptionNum(Integer systemExceptionNum) {
        this.systemExceptionNum = systemExceptionNum;
        return this;
    }
    public Integer getSystemExceptionNum() {
        return this.systemExceptionNum;
    }

    public DescribeInstanceResponseBody setSystemTrustDetail(String systemTrustDetail) {
        this.systemTrustDetail = systemTrustDetail;
        return this;
    }
    public String getSystemTrustDetail() {
        return this.systemTrustDetail;
    }

    public DescribeInstanceResponseBody setSystemTrustStatus(Integer systemTrustStatus) {
        this.systemTrustStatus = systemTrustStatus;
        return this;
    }
    public Integer getSystemTrustStatus() {
        return this.systemTrustStatus;
    }

    public DescribeInstanceResponseBody setSystemWhiteListId(Integer systemWhiteListId) {
        this.systemWhiteListId = systemWhiteListId;
        return this;
    }
    public Integer getSystemWhiteListId() {
        return this.systemWhiteListId;
    }

}
