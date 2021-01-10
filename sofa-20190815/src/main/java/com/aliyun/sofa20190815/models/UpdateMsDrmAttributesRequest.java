// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmAttributesRequest extends TeaModel {
    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Parent")
    public String parent;

    @NameInMap("ParentId")
    public Long parentId;

    public static UpdateMsDrmAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmAttributesRequest self = new UpdateMsDrmAttributesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmAttributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public UpdateMsDrmAttributesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateMsDrmAttributesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateMsDrmAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMsDrmAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMsDrmAttributesRequest setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

    public UpdateMsDrmAttributesRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
