// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeRequest extends TeaModel {
    /**
     * <p>cn-hangzhou</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The array of the top 10 protection modules that are matched.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: the Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribeRuleHitsTopTuleTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitsTopTuleTypeRequest self = new DescribeRuleHitsTopTuleTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitsTopTuleTypeRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRuleHitsTopTuleTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRuleHitsTopTuleTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRuleHitsTopTuleTypeRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeRuleHitsTopTuleTypeRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
