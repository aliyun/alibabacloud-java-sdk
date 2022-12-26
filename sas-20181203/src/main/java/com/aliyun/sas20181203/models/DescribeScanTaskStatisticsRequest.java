// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskStatisticsRequest extends TeaModel {
    @NameInMap("Levels")
    public String levels;

    public static DescribeScanTaskStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskStatisticsRequest self = new DescribeScanTaskStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskStatisticsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

}
