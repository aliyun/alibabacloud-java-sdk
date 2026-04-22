// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsGlobalOverviewRequest extends TeaModel {
    @NameInMap("NetworkParams")
    public java.util.List<DescribePvtzStatisticsGlobalOverviewRequestNetworkParams> networkParams;

    /**
     * <strong>example:</strong>
     * <p>DAY, WEEK, MONTH</p>
     */
    @NameInMap("OverviewPeriod")
    public String overviewPeriod;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    public static DescribePvtzStatisticsGlobalOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsGlobalOverviewRequest self = new DescribePvtzStatisticsGlobalOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsGlobalOverviewRequest setNetworkParams(java.util.List<DescribePvtzStatisticsGlobalOverviewRequestNetworkParams> networkParams) {
        this.networkParams = networkParams;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsGlobalOverviewRequestNetworkParams> getNetworkParams() {
        return this.networkParams;
    }

    public DescribePvtzStatisticsGlobalOverviewRequest setOverviewPeriod(String overviewPeriod) {
        this.overviewPeriod = overviewPeriod;
        return this;
    }
    public String getOverviewPeriod() {
        return this.overviewPeriod;
    }

    public DescribePvtzStatisticsGlobalOverviewRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public static class DescribePvtzStatisticsGlobalOverviewRequestNetworkParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1y5y4wk5810n50cx765</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>5924158341670144</p>
         */
        @NameInMap("VpcOwner")
        public String vpcOwner;

        /**
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static DescribePvtzStatisticsGlobalOverviewRequestNetworkParams build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsGlobalOverviewRequestNetworkParams self = new DescribePvtzStatisticsGlobalOverviewRequestNetworkParams();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsGlobalOverviewRequestNetworkParams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePvtzStatisticsGlobalOverviewRequestNetworkParams setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribePvtzStatisticsGlobalOverviewRequestNetworkParams setVpcOwner(String vpcOwner) {
            this.vpcOwner = vpcOwner;
            return this;
        }
        public String getVpcOwner() {
            return this.vpcOwner;
        }

        public DescribePvtzStatisticsGlobalOverviewRequestNetworkParams setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
