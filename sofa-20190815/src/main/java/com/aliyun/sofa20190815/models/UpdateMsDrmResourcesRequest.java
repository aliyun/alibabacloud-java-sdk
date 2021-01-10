// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmResourcesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceDomain")
    public String resourceDomain;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceVersion")
    public String resourceVersion;

    @NameInMap("Type")
    public String type;

    public static UpdateMsDrmResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmResourcesRequest self = new UpdateMsDrmResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsDrmResourcesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsDrmResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsDrmResourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMsDrmResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMsDrmResourcesRequest setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public UpdateMsDrmResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateMsDrmResourcesRequest setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public UpdateMsDrmResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
