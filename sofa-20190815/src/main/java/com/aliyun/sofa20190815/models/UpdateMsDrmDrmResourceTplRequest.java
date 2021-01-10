// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmDrmResourceTplRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("HasInstance")
    public Boolean hasInstance;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("TplId")
    public Long tplId;

    public static UpdateMsDrmDrmResourceTplRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmDrmResourceTplRequest self = new UpdateMsDrmDrmResourceTplRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmDrmResourceTplRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMsDrmDrmResourceTplRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public UpdateMsDrmDrmResourceTplRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateMsDrmDrmResourceTplRequest setHasInstance(Boolean hasInstance) {
        this.hasInstance = hasInstance;
        return this;
    }
    public Boolean getHasInstance() {
        return this.hasInstance;
    }

    public UpdateMsDrmDrmResourceTplRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsDrmDrmResourceTplRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsDrmDrmResourceTplRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMsDrmDrmResourceTplRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateMsDrmDrmResourceTplRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

}
