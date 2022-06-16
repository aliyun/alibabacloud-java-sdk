// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateNormalDeployConfigShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("ContainerResourceLimit")
    public String containerResourceLimitShrink;

    @NameInMap("ContainerResourceRequest")
    public String containerResourceRequestShrink;

    @NameInMap("Id")
    public Long id;

    public static UpdateNormalDeployConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalDeployConfigShrinkRequest self = new UpdateNormalDeployConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNormalDeployConfigShrinkRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateNormalDeployConfigShrinkRequest setContainerResourceLimitShrink(String containerResourceLimitShrink) {
        this.containerResourceLimitShrink = containerResourceLimitShrink;
        return this;
    }
    public String getContainerResourceLimitShrink() {
        return this.containerResourceLimitShrink;
    }

    public UpdateNormalDeployConfigShrinkRequest setContainerResourceRequestShrink(String containerResourceRequestShrink) {
        this.containerResourceRequestShrink = containerResourceRequestShrink;
        return this;
    }
    public String getContainerResourceRequestShrink() {
        return this.containerResourceRequestShrink;
    }

    public UpdateNormalDeployConfigShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
