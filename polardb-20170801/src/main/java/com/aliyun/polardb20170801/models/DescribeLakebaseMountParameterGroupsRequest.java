// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupsRequest extends TeaModel {
    /**
     * <p>The instance category. Valid values: basic (Basic Edition) and high_performance (High-performance Edition).</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ParamGroupCategory")
    public String paramGroupCategory;

    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLakebaseMountParameterGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupsRequest self = new DescribeLakebaseMountParameterGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupsRequest setParamGroupCategory(String paramGroupCategory) {
        this.paramGroupCategory = paramGroupCategory;
        return this;
    }
    public String getParamGroupCategory() {
        return this.paramGroupCategory;
    }

    public DescribeLakebaseMountParameterGroupsRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribeLakebaseMountParameterGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
