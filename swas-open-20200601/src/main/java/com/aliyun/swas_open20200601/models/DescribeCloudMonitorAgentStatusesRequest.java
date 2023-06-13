// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorAgentStatusesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudMonitorAgentStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMonitorAgentStatusesRequest self = new DescribeCloudMonitorAgentStatusesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMonitorAgentStatusesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeCloudMonitorAgentStatusesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeCloudMonitorAgentStatusesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
