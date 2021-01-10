// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigResourcesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceId")
    public String resourceId;

    public static AddMsConfigResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsConfigResourcesRequest self = new AddMsConfigResourcesRequest();
        return TeaModel.build(map, self);
    }

    public AddMsConfigResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddMsConfigResourcesRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public AddMsConfigResourcesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AddMsConfigResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsConfigResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddMsConfigResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
