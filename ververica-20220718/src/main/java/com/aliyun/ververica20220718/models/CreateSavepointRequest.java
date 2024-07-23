// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSavepointRequest extends TeaModel {
    /**
     * <p>The deployment ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>The description of the savepoint.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to use the native format mode. Valid values:</p>
     * <ul>
     * <li>true: The native format mode is used.</li>
     * <li>false: The native format mode is not used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nativeFormat")
    public Boolean nativeFormat;

    public static CreateSavepointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavepointRequest self = new CreateSavepointRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavepointRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public CreateSavepointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSavepointRequest setNativeFormat(Boolean nativeFormat) {
        this.nativeFormat = nativeFormat;
        return this;
    }
    public Boolean getNativeFormat() {
        return this.nativeFormat;
    }

}
