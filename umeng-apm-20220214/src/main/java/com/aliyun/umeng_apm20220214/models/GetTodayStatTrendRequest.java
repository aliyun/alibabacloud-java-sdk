// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetTodayStatTrendRequest extends TeaModel {
    // 指定App版本
    @NameInMap("appVersion")
    public String appVersion;

    // 数据源id（appKey)
    @NameInMap("dataSourceId")
    public String dataSourceId;

    // 异常类型（0. 全部崩溃 1. java/ios崩溃 2. native崩溃  3.ANR  4.自定义异常 5.卡顿）
    @NameInMap("type")
    public Integer type;

    public static GetTodayStatTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTodayStatTrendRequest self = new GetTodayStatTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetTodayStatTrendRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetTodayStatTrendRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public GetTodayStatTrendRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
