// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The information about the instance type.</p>
     */
    @NameInMap("components")
    public java.util.List<UpdateInstanceRequestComponents> components;

    /**
     * <p>The description of the instance.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The type of the order. Valid values: UPGRADE and DOWNGRADE. UPGRADE indicates the instance type is to be upgraded. DOWNGRADE indicates the instance type is to be downgraded.</p>
     */
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
        /**
         * <p>The name of the specification. The value must be the same as the name of a parameter on the buy page.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The value of the specification.</p>
         */
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
