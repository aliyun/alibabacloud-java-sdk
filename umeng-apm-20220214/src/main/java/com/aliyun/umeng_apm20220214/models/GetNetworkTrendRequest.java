// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNetworkTrendRequest extends TeaModel {
    @NameInMap("appVersion")
    public String appVersion;

    @NameInMap("dataSourceId")
    public String dataSourceId;

    @NameInMap("endDate")
    public String endDate;

    @NameInMap("startDate")
    public String startDate;

    @NameInMap("timeUnit")
    public String timeUnit;

    public static GetNetworkTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkTrendRequest self = new GetNetworkTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkTrendRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetNetworkTrendRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetNetworkTrendRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetNetworkTrendRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetNetworkTrendRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
