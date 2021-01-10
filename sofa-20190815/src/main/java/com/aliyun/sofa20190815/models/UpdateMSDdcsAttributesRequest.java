// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdcsAttributesRequest extends TeaModel {
    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateMSDdcsAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdcsAttributesRequest self = new UpdateMSDdcsAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdcsAttributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public UpdateMSDdcsAttributesRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateMSDdcsAttributesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMSDdcsAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
