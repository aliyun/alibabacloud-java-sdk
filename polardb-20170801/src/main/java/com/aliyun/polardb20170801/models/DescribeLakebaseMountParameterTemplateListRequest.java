// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterTemplateListRequest extends TeaModel {
    /**
     * <p>The database engine. Set the value to polar_3fs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polar_3fs</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance category. Valid values:</p>
     * <ul>
     * <li>basic: Basic Edition.</li>
     * <li>high_performance: High-performance Edition.</li>
     * </ul>
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

    public static DescribeLakebaseMountParameterTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterTemplateListRequest self = new DescribeLakebaseMountParameterTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterTemplateListRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeLakebaseMountParameterTemplateListRequest setParamGroupCategory(String paramGroupCategory) {
        this.paramGroupCategory = paramGroupCategory;
        return this;
    }
    public String getParamGroupCategory() {
        return this.paramGroupCategory;
    }

    public DescribeLakebaseMountParameterTemplateListRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribeLakebaseMountParameterTemplateListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
