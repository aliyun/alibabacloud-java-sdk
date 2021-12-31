// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupDataReportRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("startTime")
    public String startTime;

    public static DescribeAppGroupDataReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupDataReportRequest self = new DescribeAppGroupDataReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupDataReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAppGroupDataReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
