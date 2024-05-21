// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetStatTrendRequest extends TeaModel {
    @NameInMap("appVersion")
    public String appVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    @NameInMap("endDate")
    public String endDate;

    @NameInMap("startDate")
    public String startDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public Integer type;

    public static GetStatTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStatTrendRequest self = new GetStatTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetStatTrendRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetStatTrendRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetStatTrendRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetStatTrendRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetStatTrendRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
