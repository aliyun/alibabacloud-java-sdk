// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationGroupShrinkRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplication</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The name of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplicationGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The new name of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateMyApplicationGroup</p>
     */
    @NameInMap("NewName")
    public String newName;

    /**
     * <p>The name of the configuration update operation.</p>
     * 
     * <strong>example:</strong>
     * <p>/business/v1/product/spus/{spu_id}</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The JSON string that consists of a set of parameters. Default value: {}.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;username&quot;: &quot;xx&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateApplicationGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationGroupShrinkRequest self = new UpdateApplicationGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationGroupShrinkRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationGroupShrinkRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateApplicationGroupShrinkRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public UpdateApplicationGroupShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public UpdateApplicationGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
