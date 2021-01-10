// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigAttributesRequest extends TeaModel {
    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceId")
    public Long resourceId;

    public static AddMsConfigAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsConfigAttributesRequest self = new AddMsConfigAttributesRequest();
        return TeaModel.build(map, self);
    }

    public AddMsConfigAttributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public AddMsConfigAttributesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AddMsConfigAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsConfigAttributesRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

}
