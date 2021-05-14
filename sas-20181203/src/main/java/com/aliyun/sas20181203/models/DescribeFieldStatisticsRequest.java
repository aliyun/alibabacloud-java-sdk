// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MachineTypes")
    public String machineTypes;

    public static DescribeFieldStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldStatisticsRequest self = new DescribeFieldStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFieldStatisticsRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

}
