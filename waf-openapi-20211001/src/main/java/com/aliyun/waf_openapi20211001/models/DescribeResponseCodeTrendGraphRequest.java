// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResponseCodeTrendGraphRequest extends TeaModel {
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StartTimestamp")
    public String startTimestamp;

    @NameInMap("Type")
    public String type;

    public static DescribeResponseCodeTrendGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResponseCodeTrendGraphRequest self = new DescribeResponseCodeTrendGraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResponseCodeTrendGraphRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeResponseCodeTrendGraphRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeResponseCodeTrendGraphRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeResponseCodeTrendGraphRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeResponseCodeTrendGraphRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeResponseCodeTrendGraphRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
