// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsConfigAttributesRequest extends TeaModel {
    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMsConfigAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsConfigAttributesRequest self = new UpdateMsConfigAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsConfigAttributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public UpdateMsConfigAttributesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateMsConfigAttributesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsConfigAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
