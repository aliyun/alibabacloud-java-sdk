// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDeviceCountRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    public static QueryDeviceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceCountRequest self = new QueryDeviceCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceCountRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryDeviceCountRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public QueryDeviceCountRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
