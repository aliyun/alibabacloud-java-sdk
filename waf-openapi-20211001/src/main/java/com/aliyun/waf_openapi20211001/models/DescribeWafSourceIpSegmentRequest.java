// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeWafSourceIpSegmentRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeWafSourceIpSegmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafSourceIpSegmentRequest self = new DescribeWafSourceIpSegmentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWafSourceIpSegmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
