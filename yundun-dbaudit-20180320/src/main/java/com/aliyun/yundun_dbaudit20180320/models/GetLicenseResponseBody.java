// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLicenseResponseBody extends TeaModel {
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AssetLimit")
    public Integer assetLimit;

    @NameInMap("AssetLimitUsed")
    public Integer assetLimitUsed;

    public static GetLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseResponseBody self = new GetLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLicenseResponseBody setAssetLimit(Integer assetLimit) {
        this.assetLimit = assetLimit;
        return this;
    }
    public Integer getAssetLimit() {
        return this.assetLimit;
    }

    public GetLicenseResponseBody setAssetLimitUsed(Integer assetLimitUsed) {
        this.assetLimitUsed = assetLimitUsed;
        return this;
    }
    public Integer getAssetLimitUsed() {
        return this.assetLimitUsed;
    }

}
