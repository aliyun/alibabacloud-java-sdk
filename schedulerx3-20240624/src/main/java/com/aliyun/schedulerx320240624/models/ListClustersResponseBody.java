// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListClustersResponseBodyData data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListClustersResponseBody setData(ListClustersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListClustersResponseBodyData getData() {
        return this.data;
    }

    public ListClustersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListClustersResponseBodyDataRecordsVSwitches extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vsw-8vbl54xzux86usy61r5zm</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClustersResponseBodyDataRecordsVSwitches build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyDataRecordsVSwitches self = new ListClustersResponseBodyDataRecordsVSwitches();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyDataRecordsVSwitches setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListClustersResponseBodyDataRecordsVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListClustersResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>xxljob-c20f7ec9a78</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>xxl-job-test-1730427510169</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>scx.small.x2</p>
         */
        @NameInMap("ClusterSpec")
        public String clusterSpec;

        /**
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-10-29 15:56:36</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>xxljob</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InternetDomain")
        public String internetDomain;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxljob-b9e19e46c4e.schedulerx.mse.aliyuncs.com">http://xxljob-b9e19e46c4e.schedulerx.mse.aliyuncs.com</a></p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProductType")
        public Integer productType;

        @NameInMap("SpInstanceId")
        public String spInstanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("VSwitches")
        public java.util.List<ListClustersResponseBodyDataRecordsVSwitches> vSwitches;

        @NameInMap("VersionLifecycle")
        public String versionLifecycle;

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1fxort6ag5h9752i305</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListClustersResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyDataRecords self = new ListClustersResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyDataRecords setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListClustersResponseBodyDataRecords setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClustersResponseBodyDataRecords setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListClustersResponseBodyDataRecords setClusterSpec(String clusterSpec) {
            this.clusterSpec = clusterSpec;
            return this;
        }
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        public ListClustersResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyDataRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListClustersResponseBodyDataRecords setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListClustersResponseBodyDataRecords setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListClustersResponseBodyDataRecords setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public ListClustersResponseBodyDataRecords setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public ListClustersResponseBodyDataRecords setProductType(Integer productType) {
            this.productType = productType;
            return this;
        }
        public Integer getProductType() {
            return this.productType;
        }

        public ListClustersResponseBodyDataRecords setSpInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }
        public String getSpInstanceId() {
            return this.spInstanceId;
        }

        public ListClustersResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListClustersResponseBodyDataRecords setVSwitches(java.util.List<ListClustersResponseBodyDataRecordsVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<ListClustersResponseBodyDataRecordsVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public ListClustersResponseBodyDataRecords setVersionLifecycle(String versionLifecycle) {
            this.versionLifecycle = versionLifecycle;
            return this;
        }
        public String getVersionLifecycle() {
            return this.versionLifecycle;
        }

        public ListClustersResponseBodyDataRecords setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListClustersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListClustersResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListClustersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyData self = new ListClustersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListClustersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClustersResponseBodyData setRecords(java.util.List<ListClustersResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListClustersResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListClustersResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
