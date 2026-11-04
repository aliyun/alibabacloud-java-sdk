// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLakebaseMountParameterGroupRequest extends TeaModel {
    /**
     * <p>The names of the parameters to delete, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>param1,param2</p>
     */
    @NameInMap("DeleteParameters")
    public String deleteParameters;

    /**
     * <p>The parameter template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxx</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The new parameter template name.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-new</p>
     */
    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    /**
     * <p>The JSON string of added or modified parameter key-value pairs.</p>
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

    public static ModifyLakebaseMountParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakebaseMountParameterGroupRequest self = new ModifyLakebaseMountParameterGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLakebaseMountParameterGroupRequest setDeleteParameters(String deleteParameters) {
        this.deleteParameters = deleteParameters;
        return this;
    }
    public String getDeleteParameters() {
        return this.deleteParameters;
    }

    public ModifyLakebaseMountParameterGroupRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyLakebaseMountParameterGroupRequest setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    public ModifyLakebaseMountParameterGroupRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyLakebaseMountParameterGroupRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public ModifyLakebaseMountParameterGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
