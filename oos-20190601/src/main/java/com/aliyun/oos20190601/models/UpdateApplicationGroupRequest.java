// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationGroupRequest extends TeaModel {
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
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateApplicationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationGroupRequest self = new UpdateApplicationGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationGroupRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateApplicationGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApplicationGroupRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    public String getNewName() {
        return this.newName;
    }

    public UpdateApplicationGroupRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public UpdateApplicationGroupRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public UpdateApplicationGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
