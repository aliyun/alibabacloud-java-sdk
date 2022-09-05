// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskStatisticsRequest extends TeaModel {
    @NameInMap("StatType")
    public String statType;

    public static GetTaskStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatisticsRequest self = new GetTaskStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatisticsRequest setStatType(String statType) {
        this.statType = statType;
        return this;
    }
    public String getStatType() {
        return this.statType;
    }

}
