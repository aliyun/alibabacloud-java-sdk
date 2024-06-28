// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7uj6idcfv****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The end of the time range to query. The time must be in UTC. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. For example, <code>2013-01-10T12:00:00Z</code> specifies 20:00:00 (UTC+8) on January 10, 2013.</p>
     * <p>If the value of seconds (ss) is not 00, the end time is automatically rounded up to the next minute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-05T03:05:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The duration of each monitoring data entry. Unit: seconds. Valid values: <strong>60</strong> (default), <strong>300</strong>, <strong>900</strong>, and <strong>3600</strong>.</p>
     * <ul>
     * <li>If the value of <strong>(EndTime</strong> - <strong>StartTime</strong>)/<strong>Period</strong> is greater than 200, a maximum of 200 monitoring data entries are returned at a time.</li>
     * <li>If the value of (<strong>EndTime</strong> - <strong>StartTime</strong>)/<strong>Period</strong> is less than or equal to 200, only the monitoring data collected between the start time and end time is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The ID of the region to which the EIP belongs. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. The time must be in UTC. Specify the time in the ISO 8601 standard in <code>YYYY-MM-DDThh:mm:ssZ</code> format. For example, <code>2013-01-10T12:00:00Z</code> specifies 20:00:00 (UTC+8) on January 10, 2013.</p>
     * <p>If the value of seconds (ss) is not 00, the start time is automatically rounded up to the next minute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-05T01:05:05Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEipMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipMonitorDataRequest self = new DescribeEipMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEipMonitorDataRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public DescribeEipMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEipMonitorDataRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEipMonitorDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEipMonitorDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeEipMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEipMonitorDataRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEipMonitorDataRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEipMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
