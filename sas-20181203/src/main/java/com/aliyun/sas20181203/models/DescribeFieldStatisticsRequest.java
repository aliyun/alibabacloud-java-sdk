// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsRequest extends TeaModel {
    /**
     * <p>The type of the asset to query. If no asset types are specified, all types of assets are returned. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: server</li>
     * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The ID of the region in which the asset resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the primary account of the Resource Directory member account.</p>
     * <blockquote>
     * <p>call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> interface to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
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
