// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowTopUrlRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeFlowTopUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTopUrlRequest self = new DescribeFlowTopUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTopUrlRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeFlowTopUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeFlowTopUrlRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeFlowTopUrlRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
