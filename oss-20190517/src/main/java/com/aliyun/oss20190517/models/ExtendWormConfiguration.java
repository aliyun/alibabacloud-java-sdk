// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ExtendWormConfiguration extends TeaModel {
    // The number of days for which objects can be retained
    @NameInMap("RetentionPeriodInDays")
    public Integer retentionPeriodInDays;

    public static ExtendWormConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ExtendWormConfiguration self = new ExtendWormConfiguration();
        return TeaModel.build(map, self);
    }

    public ExtendWormConfiguration setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }
    public Integer getRetentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

}
