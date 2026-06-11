// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryAppQuotaResponseBody extends TeaModel {
    @NameInMap("ActiveLicenseCount")
    public Integer activeLicenseCount;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("LicenseCount")
    public Integer licenseCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsagePercent")
    public Double usagePercent;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryAppQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppQuotaResponseBody self = new QueryAppQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppQuotaResponseBody setActiveLicenseCount(Integer activeLicenseCount) {
        this.activeLicenseCount = activeLicenseCount;
        return this;
    }
    public Integer getActiveLicenseCount() {
        return this.activeLicenseCount;
    }

    public QueryAppQuotaResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAppQuotaResponseBody setLicenseCount(Integer licenseCount) {
        this.licenseCount = licenseCount;
        return this;
    }
    public Integer getLicenseCount() {
        return this.licenseCount;
    }

    public QueryAppQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppQuotaResponseBody setUsagePercent(Double usagePercent) {
        this.usagePercent = usagePercent;
        return this;
    }
    public Double getUsagePercent() {
        return this.usagePercent;
    }

    public QueryAppQuotaResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
