// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotVehicleTablesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("VehicleTableIdList")
    public String vehicleTableIdList;

    public static DescribeAiotVehicleTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotVehicleTablesRequest self = new DescribeAiotVehicleTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiotVehicleTablesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeAiotVehicleTablesRequest setVehicleTableIdList(String vehicleTableIdList) {
        this.vehicleTableIdList = vehicleTableIdList;
        return this;
    }
    public String getVehicleTableIdList() {
        return this.vehicleTableIdList;
    }

}
