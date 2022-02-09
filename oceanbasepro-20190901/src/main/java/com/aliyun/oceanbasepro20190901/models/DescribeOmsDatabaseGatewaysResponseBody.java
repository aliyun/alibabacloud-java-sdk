// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsDatabaseGatewaysResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeOmsDatabaseGatewaysResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOmsDatabaseGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsDatabaseGatewaysResponseBody self = new DescribeOmsDatabaseGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsDatabaseGatewaysResponseBody setData(java.util.List<DescribeOmsDatabaseGatewaysResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsDatabaseGatewaysResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsDatabaseGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOmsDatabaseGatewaysResponseBodyData extends TeaModel {
        @NameInMap("ExceptionMsg")
        public String exceptionMsg;

        @NameInMap("GatewayDesc")
        public String gatewayDesc;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("NumOfExceptionInstance")
        public Integer numOfExceptionInstance;

        @NameInMap("NumOfRunningInstance")
        public Integer numOfRunningInstance;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static DescribeOmsDatabaseGatewaysResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsDatabaseGatewaysResponseBodyData self = new DescribeOmsDatabaseGatewaysResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setExceptionMsg(String exceptionMsg) {
            this.exceptionMsg = exceptionMsg;
            return this;
        }
        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setGatewayDesc(String gatewayDesc) {
            this.gatewayDesc = gatewayDesc;
            return this;
        }
        public String getGatewayDesc() {
            return this.gatewayDesc;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setNumOfExceptionInstance(Integer numOfExceptionInstance) {
            this.numOfExceptionInstance = numOfExceptionInstance;
            return this;
        }
        public Integer getNumOfExceptionInstance() {
            return this.numOfExceptionInstance;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setNumOfRunningInstance(Integer numOfRunningInstance) {
            this.numOfRunningInstance = numOfRunningInstance;
            return this;
        }
        public Integer getNumOfRunningInstance() {
            return this.numOfRunningInstance;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOmsDatabaseGatewaysResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
