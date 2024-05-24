// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSavepointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("description")
    public String description;

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
