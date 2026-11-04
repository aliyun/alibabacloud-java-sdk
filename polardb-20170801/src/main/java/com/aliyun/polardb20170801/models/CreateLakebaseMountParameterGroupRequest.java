// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateLakebaseMountParameterGroupRequest extends TeaModel {
    /**
     * <p>The instance category. Valid values:</p>
     * <ul>
     * <li>basic: Basic Edition.</li>
     * <li>high_performance: High-performance Edition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ParamGroupCategory")
    public String paramGroupCategory;

    /**
     * <p>The description of the parameter template.</p>
     * 
     * <strong>example:</strong>
     * <p>Test template</p>
     */
    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    /**
     * <p>The name of the parameter template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-test</p>
     */
    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    /**
     * <p>The JSON string of parameters and their values.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

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

    public static CreateLakebaseMountParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLakebaseMountParameterGroupRequest self = new CreateLakebaseMountParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateLakebaseMountParameterGroupRequest setParamGroupCategory(String paramGroupCategory) {
        this.paramGroupCategory = paramGroupCategory;
        return this;
    }
    public String getParamGroupCategory() {
        return this.paramGroupCategory;
    }

    public CreateLakebaseMountParameterGroupRequest setParameterGroupDesc(String parameterGroupDesc) {
        this.parameterGroupDesc = parameterGroupDesc;
        return this;
    }
    public String getParameterGroupDesc() {
        return this.parameterGroupDesc;
    }

    public CreateLakebaseMountParameterGroupRequest setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public CreateLakebaseMountParameterGroupRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateLakebaseMountParameterGroupRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public CreateLakebaseMountParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
