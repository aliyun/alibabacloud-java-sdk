// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotVehicleTableItemsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("VehicleTableId")
    public String vehicleTableId;

    @NameInMap("VehicleTableItemId")
    public String vehicleTableItemId;

    public static DescribeAiotVehicleTableItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotVehicleTableItemsRequest self = new DescribeAiotVehicleTableItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAiotVehicleTableItemsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeAiotVehicleTableItemsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeAiotVehicleTableItemsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAiotVehicleTableItemsRequest setVehicleTableId(String vehicleTableId) {
        this.vehicleTableId = vehicleTableId;
        return this;
    }
    public String getVehicleTableId() {
        return this.vehicleTableId;
    }

    public DescribeAiotVehicleTableItemsRequest setVehicleTableItemId(String vehicleTableItemId) {
        this.vehicleTableItemId = vehicleTableItemId;
        return this;
    }
    public String getVehicleTableItemId() {
        return this.vehicleTableItemId;
    }

}
