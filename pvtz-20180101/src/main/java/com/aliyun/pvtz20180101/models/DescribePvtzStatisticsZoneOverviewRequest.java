// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsZoneOverviewRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><code>zh-CN</code>: Chinese</p>
     * </li>
     * <li><p><code>en-US</code>: English</p>
     * </li>
     * </ul>
     * <p>Default value: <code>en-US</code>.</p>
     * <blockquote>
     * <p>This parameter takes precedence over the <code>Lang</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A client token to ensure request idempotence. Your client must generate a unique token for each request. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>234534535432323...</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The statistical module.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTHORITY</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The network parameters.</p>
     */
    @NameInMap("NetworkParams")
    public java.util.List<DescribePvtzStatisticsZoneOverviewRequestNetworkParams> networkParams;

    /**
     * <p>The statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("OverviewPeriod")
    public String overviewPeriod;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    public static DescribePvtzStatisticsZoneOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsZoneOverviewRequest self = new DescribePvtzStatisticsZoneOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsZoneOverviewRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribePvtzStatisticsZoneOverviewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribePvtzStatisticsZoneOverviewRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribePvtzStatisticsZoneOverviewRequest setNetworkParams(java.util.List<DescribePvtzStatisticsZoneOverviewRequestNetworkParams> networkParams) {
        this.networkParams = networkParams;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsZoneOverviewRequestNetworkParams> getNetworkParams() {
        return this.networkParams;
    }

    public DescribePvtzStatisticsZoneOverviewRequest setOverviewPeriod(String overviewPeriod) {
        this.overviewPeriod = overviewPeriod;
        return this;
    }
    public String getOverviewPeriod() {
        return this.overviewPeriod;
    }

    public DescribePvtzStatisticsZoneOverviewRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public static class DescribePvtzStatisticsZoneOverviewRequestNetworkParams extends TeaModel {
        /**
         * <p>The region ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf68l2l04nqoyg7ie1kaw</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>5209821778041881</p>
         */
        @NameInMap("VpcOwner")
        public String vpcOwner;

        /**
         * <p>The type of the VPC. Valid values:</p>
         * <ul>
         * <li><p><code>STANDARD</code>: standard VPC</p>
         * </li>
         * <li><p><code>EDS</code>: Elastic Desktop Service (EDS) VPC</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static DescribePvtzStatisticsZoneOverviewRequestNetworkParams build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsZoneOverviewRequestNetworkParams self = new DescribePvtzStatisticsZoneOverviewRequestNetworkParams();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsZoneOverviewRequestNetworkParams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePvtzStatisticsZoneOverviewRequestNetworkParams setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribePvtzStatisticsZoneOverviewRequestNetworkParams setVpcOwner(String vpcOwner) {
            this.vpcOwner = vpcOwner;
            return this;
        }
        public String getVpcOwner() {
            return this.vpcOwner;
        }

        public DescribePvtzStatisticsZoneOverviewRequestNetworkParams setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
