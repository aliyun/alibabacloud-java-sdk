// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurSummaryOverviewRequest extends TeaModel {
    @NameInMap("CurTs")
    public Long curTs;

    @NameInMap("TimeZone")
    public String timeZone;

    public static DescribeIceDurSummaryOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurSummaryOverviewRequest self = new DescribeIceDurSummaryOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurSummaryOverviewRequest setCurTs(Long curTs) {
        this.curTs = curTs;
        return this;
    }
    public Long getCurTs() {
        return this.curTs;
    }

    public DescribeIceDurSummaryOverviewRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
