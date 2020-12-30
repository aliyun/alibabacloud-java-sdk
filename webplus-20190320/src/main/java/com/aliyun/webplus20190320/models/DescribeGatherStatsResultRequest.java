// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeGatherStatsResultRequest extends TeaModel {
    @NameInMap("ChangeId")
    public String changeId;

    public static DescribeGatherStatsResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatherStatsResultRequest self = new DescribeGatherStatsResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatherStatsResultRequest setChangeId(String changeId) {
        this.changeId = changeId;
        return this;
    }
    public String getChangeId() {
        return this.changeId;
    }

}
