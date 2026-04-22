// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>1571673600000</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("GrowType")
    public String growType;

    @NameInMap("Module")
    public String module;

    @NameInMap("NetworkParams")
    public java.util.List<DescribePvtzStatisticsSummaryRequestNetworkParams> networkParams;

    /**
     * <strong>example:</strong>
     * <p>fluctuation_ratio</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <strong>example:</strong>
     * <p>1571587200000</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    @NameInMap("StatisticalType")
    public String statisticalType;

    /**
     * <strong>example:</strong>
     * <p>host.local</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribePvtzStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsSummaryRequest self = new DescribePvtzStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsSummaryRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribePvtzStatisticsSummaryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribePvtzStatisticsSummaryRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribePvtzStatisticsSummaryRequest setGrowType(String growType) {
        this.growType = growType;
        return this;
    }
    public String getGrowType() {
        return this.growType;
    }

    public DescribePvtzStatisticsSummaryRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribePvtzStatisticsSummaryRequest setNetworkParams(java.util.List<DescribePvtzStatisticsSummaryRequestNetworkParams> networkParams) {
        this.networkParams = networkParams;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsSummaryRequestNetworkParams> getNetworkParams() {
        return this.networkParams;
    }

    public DescribePvtzStatisticsSummaryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribePvtzStatisticsSummaryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePvtzStatisticsSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePvtzStatisticsSummaryRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribePvtzStatisticsSummaryRequest setRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }
    public String getRcode() {
        return this.rcode;
    }

    public DescribePvtzStatisticsSummaryRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribePvtzStatisticsSummaryRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribePvtzStatisticsSummaryRequest setStatisticalType(String statisticalType) {
        this.statisticalType = statisticalType;
        return this;
    }
    public String getStatisticalType() {
        return this.statisticalType;
    }

    public DescribePvtzStatisticsSummaryRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class DescribePvtzStatisticsSummaryRequestNetworkParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1uvv79h1t8unnzdh3nq</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>1256177436790486</p>
         */
        @NameInMap("VpcOwner")
        public String vpcOwner;

        /**
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static DescribePvtzStatisticsSummaryRequestNetworkParams build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsSummaryRequestNetworkParams self = new DescribePvtzStatisticsSummaryRequestNetworkParams();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setVpcOwner(String vpcOwner) {
            this.vpcOwner = vpcOwner;
            return this;
        }
        public String getVpcOwner() {
            return this.vpcOwner;
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
