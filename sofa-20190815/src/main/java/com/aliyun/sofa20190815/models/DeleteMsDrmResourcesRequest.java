// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsDrmResourcesRequest extends TeaModel {
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

    public static DeleteMsDrmResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsDrmResourcesRequest self = new DeleteMsDrmResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsDrmResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteMsDrmResourcesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteMsDrmResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMsDrmResourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteMsDrmResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteMsDrmResourcesRequest setResourceDomain(String resourceDomain) {
        this.resourceDomain = resourceDomain;
        return this;
    }
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    public DeleteMsDrmResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DeleteMsDrmResourcesRequest setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public DeleteMsDrmResourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
