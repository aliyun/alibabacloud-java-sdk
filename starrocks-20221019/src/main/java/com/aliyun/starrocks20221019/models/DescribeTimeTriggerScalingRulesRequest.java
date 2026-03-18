// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeTimeTriggerScalingRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ng-d332aa8bca48****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static DescribeTimeTriggerScalingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimeTriggerScalingRulesRequest self = new DescribeTimeTriggerScalingRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTimeTriggerScalingRulesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
