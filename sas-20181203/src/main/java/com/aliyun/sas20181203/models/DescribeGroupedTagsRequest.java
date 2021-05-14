// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedTagsRequest extends TeaModel {
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
