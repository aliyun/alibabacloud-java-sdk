// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdcsResourcesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("UpdateAttribute")
    public Boolean updateAttribute;

    public static UpdateMSDdcsResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdcsResourcesRequest self = new UpdateMSDdcsResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdcsResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMSDdcsResourcesRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateMSDdcsResourcesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateMSDdcsResourcesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMSDdcsResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMSDdcsResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMSDdcsResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateMSDdcsResourcesRequest setUpdateAttribute(Boolean updateAttribute) {
        this.updateAttribute = updateAttribute;
        return this;
    }
    public Boolean getUpdateAttribute() {
        return this.updateAttribute;
    }

}
