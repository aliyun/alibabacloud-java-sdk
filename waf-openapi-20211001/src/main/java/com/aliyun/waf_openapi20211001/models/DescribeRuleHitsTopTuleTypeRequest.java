// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleHitsTopTuleTypeRequest extends TeaModel {
    /**
     * <p>The end point of the time period for which to query. Unit: seconds. If you do not specify this parameter, the current time is used.</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: the Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protected object.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The start point of the time period for which to query. Unit: seconds.</p>
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
