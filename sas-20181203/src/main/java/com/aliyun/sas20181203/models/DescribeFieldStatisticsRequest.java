// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsRequest extends TeaModel {
    /**
     * <p>The type of the asset to query. If no asset types are specified, all types of assets are returned. Valid values:</p>
     * <br>
     * <p>*   **ecs**: server</p>
     * <p>*   **cloud_product**: Alibaba Cloud service</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The ID of the region in which the asset resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the primary account of the Resource Directory member account.</p>
     * <p>> call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) interface to obtain this parameter.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    public static DescribeFieldStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldStatisticsRequest self = new DescribeFieldStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldStatisticsRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeFieldStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFieldStatisticsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
