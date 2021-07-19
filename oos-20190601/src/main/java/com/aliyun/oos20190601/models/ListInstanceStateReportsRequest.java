// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstanceStateReportsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StateConfigurationId")
    public String stateConfigurationId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListInstanceStateReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStateReportsRequest self = new ListInstanceStateReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceStateReportsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstanceStateReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceStateReportsRequest setStateConfigurationId(String stateConfigurationId) {
        this.stateConfigurationId = stateConfigurationId;
        return this;
    }
    public String getStateConfigurationId() {
        return this.stateConfigurationId;
    }

    public ListInstanceStateReportsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceStateReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
