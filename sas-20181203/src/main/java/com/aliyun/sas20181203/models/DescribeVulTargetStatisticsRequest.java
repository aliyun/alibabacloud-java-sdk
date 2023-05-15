// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetStatisticsRequest extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeVulTargetStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetStatisticsRequest self = new DescribeVulTargetStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
