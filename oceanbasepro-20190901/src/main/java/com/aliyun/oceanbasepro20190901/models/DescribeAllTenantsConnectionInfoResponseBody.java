// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAllTenantsConnectionInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAllTenantsConnectionInfoResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAllTenantsConnectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllTenantsConnectionInfoResponseBody self = new DescribeAllTenantsConnectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllTenantsConnectionInfoResponseBody setData(java.util.List<DescribeAllTenantsConnectionInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAllTenantsConnectionInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAllTenantsConnectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllTenantsConnectionInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAllTenantsConnectionInfoResponseBodyData extends TeaModel {
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("IntranetAddress")
        public String intranetAddress;

        @NameInMap("IntranetPort")
        public Integer intranetPort;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Region")
        public String region;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("TenantDescription")
        public String tenantDescription;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeAllTenantsConnectionInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllTenantsConnectionInfoResponseBodyData self = new DescribeAllTenantsConnectionInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setIntranetPort(Integer intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public Integer getIntranetPort() {
            return this.intranetPort;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setTenantDescription(String tenantDescription) {
            this.tenantDescription = tenantDescription;
            return this;
        }
        public String getTenantDescription() {
            return this.tenantDescription;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeAllTenantsConnectionInfoResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
