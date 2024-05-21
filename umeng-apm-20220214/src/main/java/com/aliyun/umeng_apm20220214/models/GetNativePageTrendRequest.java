// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetNativePageTrendRequest extends TeaModel {
    @NameInMap("appVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startDate")
    public String startDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("timeUnit")
    public String timeUnit;

    public static GetNativePageTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNativePageTrendRequest self = new GetNativePageTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetNativePageTrendRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetNativePageTrendRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetNativePageTrendRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetNativePageTrendRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetNativePageTrendRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
