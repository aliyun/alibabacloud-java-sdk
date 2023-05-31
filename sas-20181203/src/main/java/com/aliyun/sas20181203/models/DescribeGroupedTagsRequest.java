// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsRequest extends TeaModel {
    /**
     * <p>The type of the asset to query. If you do not specify this parameter, the tags of all asset types are queried. Valid values:</p>
     * <br>
     * <p>*   **ecs**: server</p>
     * <p>*   **cloud_product**: Alibaba Cloud service</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    public static DescribeGroupedTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedTagsRequest self = new DescribeGroupedTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedTagsRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

}
