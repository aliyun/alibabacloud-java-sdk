// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeIntranetUserCanAnalysisVpcsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CLOUD</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryTreeLevel")
    public Integer queryTreeLevel;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1204673843521685</p>
     */
    @NameInMap("VpcOwner")
    public Long vpcOwner;

    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("VpcType")
    public String vpcType;

    public static DescribeIntranetUserCanAnalysisVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntranetUserCanAnalysisVpcsRequest self = new DescribeIntranetUserCanAnalysisVpcsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setQueryTreeLevel(Integer queryTreeLevel) {
        this.queryTreeLevel = queryTreeLevel;
        return this;
    }
    public Integer getQueryTreeLevel() {
        return this.queryTreeLevel;
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setVpcOwner(Long vpcOwner) {
        this.vpcOwner = vpcOwner;
        return this;
    }
    public Long getVpcOwner() {
        return this.vpcOwner;
    }

    public DescribeIntranetUserCanAnalysisVpcsRequest setVpcType(String vpcType) {
        this.vpcType = vpcType;
        return this;
    }
    public String getVpcType() {
        return this.vpcType;
    }

}
