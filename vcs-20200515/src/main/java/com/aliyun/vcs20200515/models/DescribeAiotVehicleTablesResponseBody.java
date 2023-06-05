// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotVehicleTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VehicleTableList")
    public java.util.List<DescribeAiotVehicleTablesResponseBodyVehicleTableList> vehicleTableList;

    public static DescribeAiotVehicleTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotVehicleTablesResponseBody self = new DescribeAiotVehicleTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiotVehicleTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAiotVehicleTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAiotVehicleTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAiotVehicleTablesResponseBody setVehicleTableList(java.util.List<DescribeAiotVehicleTablesResponseBodyVehicleTableList> vehicleTableList) {
        this.vehicleTableList = vehicleTableList;
        return this;
    }
    public java.util.List<DescribeAiotVehicleTablesResponseBodyVehicleTableList> getVehicleTableList() {
        return this.vehicleTableList;
    }

    public static class DescribeAiotVehicleTablesResponseBodyVehicleTableList extends TeaModel {
        @NameInMap("VehicleTableId")
        public String vehicleTableId;

        @NameInMap("VehicleTableName")
        public String vehicleTableName;

        public static DescribeAiotVehicleTablesResponseBodyVehicleTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiotVehicleTablesResponseBodyVehicleTableList self = new DescribeAiotVehicleTablesResponseBodyVehicleTableList();
            return TeaModel.build(map, self);
        }

        public DescribeAiotVehicleTablesResponseBodyVehicleTableList setVehicleTableId(String vehicleTableId) {
            this.vehicleTableId = vehicleTableId;
            return this;
        }
        public String getVehicleTableId() {
            return this.vehicleTableId;
        }

        public DescribeAiotVehicleTablesResponseBodyVehicleTableList setVehicleTableName(String vehicleTableName) {
            this.vehicleTableName = vehicleTableName;
            return this;
        }
        public String getVehicleTableName() {
            return this.vehicleTableName;
        }

    }

}
