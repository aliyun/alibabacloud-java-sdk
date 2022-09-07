// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("components")
    public java.util.List<UpdateInstanceRequestComponents> components;

    @NameInMap("description")
    public String description;

    @NameInMap("orderType")
    public String orderType;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setComponents(java.util.List<UpdateInstanceRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<UpdateInstanceRequestComponents> getComponents() {
        return this.components;
    }

    public UpdateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateInstanceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public static class UpdateInstanceRequestComponents extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("value")
        public String value;

        public static UpdateInstanceRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestComponents self = new UpdateInstanceRequestComponents();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestComponents setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateInstanceRequestComponents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
