// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePeakTrendRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: seconds. If you do not specify this parameter, the current time is used.</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time interval. Unit: seconds. The value must be an integral multiple of 60.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The protected object.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The beginning of the time range to query. Unit: seconds.</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    public static DescribePeakTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePeakTrendRequest self = new DescribePeakTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribePeakTrendRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribePeakTrendRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePeakTrendRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribePeakTrendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePeakTrendRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribePeakTrendRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribePeakTrendRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

}
