// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetLaunchTrendRequest extends TeaModel {
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

    public static GetLaunchTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLaunchTrendRequest self = new GetLaunchTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetLaunchTrendRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetLaunchTrendRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetLaunchTrendRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLaunchTrendRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetLaunchTrendRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
