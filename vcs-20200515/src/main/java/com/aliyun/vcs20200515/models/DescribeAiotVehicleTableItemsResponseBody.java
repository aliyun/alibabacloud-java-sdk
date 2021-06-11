// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotVehicleTableItemsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("VehicleTableItems")
    public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems vehicleTableItems;

    @NameInMap("Message")
    public String message;

    public static DescribeAiotVehicleTableItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotVehicleTableItemsResponseBody self = new DescribeAiotVehicleTableItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiotVehicleTableItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiotVehicleTableItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAiotVehicleTableItemsResponseBody setVehicleTableItems(DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems vehicleTableItems) {
        this.vehicleTableItems = vehicleTableItems;
        return this;
    }
    public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems getVehicleTableItems() {
        return this.vehicleTableItems;
    }

    public DescribeAiotVehicleTableItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList extends TeaModel {
        @NameInMap("VehicleTableItemId")
        public String vehicleTableItemId;

        @NameInMap("VehicleTableId")
        public String vehicleTableId;

        @NameInMap("PlateNo")
        public String plateNo;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Remarks")
        public String remarks;

        public static DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList self = new DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setVehicleTableItemId(String vehicleTableItemId) {
            this.vehicleTableItemId = vehicleTableItemId;
            return this;
        }
        public String getVehicleTableItemId() {
            return this.vehicleTableItemId;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setVehicleTableId(String vehicleTableId) {
            this.vehicleTableId = vehicleTableId;
            return this;
        }
        public String getVehicleTableId() {
            return this.vehicleTableId;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setPlateNo(String plateNo) {
            this.plateNo = plateNo;
            return this;
        }
        public String getPlateNo() {
            return this.plateNo;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

    }

    public static class DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalNum")
        public Long totalNum;

        @NameInMap("VehicleTableItemList")
        public java.util.List<DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList> vehicleTableItemList;

        public static DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems self = new DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems();
            return TeaModel.build(map, self);
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public DescribeAiotVehicleTableItemsResponseBodyVehicleTableItems setVehicleTableItemList(java.util.List<DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList> vehicleTableItemList) {
            this.vehicleTableItemList = vehicleTableItemList;
            return this;
        }
        public java.util.List<DescribeAiotVehicleTableItemsResponseBodyVehicleTableItemsVehicleTableItemList> getVehicleTableItemList() {
            return this.vehicleTableItemList;
        }

    }

}
