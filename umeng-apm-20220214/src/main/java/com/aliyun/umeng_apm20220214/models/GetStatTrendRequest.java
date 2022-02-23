// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetStatTrendRequest extends TeaModel {
    // 结束日期（yyyy-MM-dd格式，和起始日期不能超过90天）
    @NameInMap("appVersion")
    public String appVersion;

    // 数据源id（appKey)
    @NameInMap("dataSourceId")
    public String dataSourceId;

    // 起始日期（yyyy-MM-dd格式）
    @NameInMap("endDate")
    public String endDate;

    // 指定App版本
    @NameInMap("startDate")
    public String startDate;

    // 异常类型（0. 全部崩溃 1. java/ios崩溃 2. native崩溃  3.ANR  4.自定义异常 5.卡顿）
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
