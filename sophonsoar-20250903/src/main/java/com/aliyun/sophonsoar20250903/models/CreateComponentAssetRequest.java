// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class CreateComponentAssetRequest extends TeaModel {
    /**
     * <p>The name of the asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai-log-config</p>
     */
    @NameInMap("ComponentAssetName")
    public String componentAssetName;

    /**
     * <p>Configuration information of the asset.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ComponentAssetValues")
    public java.util.List<CreateComponentAssetRequestComponentAssetValues> componentAssetValues;

    /**
     * <p>The name of the component.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The language type for receiving messages. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Resource directory member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static CreateComponentAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentAssetRequest self = new CreateComponentAssetRequest();
        return TeaModel.build(map, self);
    }

    public CreateComponentAssetRequest setComponentAssetName(String componentAssetName) {
        this.componentAssetName = componentAssetName;
        return this;
    }
    public String getComponentAssetName() {
        return this.componentAssetName;
    }

    public CreateComponentAssetRequest setComponentAssetValues(java.util.List<CreateComponentAssetRequestComponentAssetValues> componentAssetValues) {
        this.componentAssetValues = componentAssetValues;
        return this;
    }
    public java.util.List<CreateComponentAssetRequestComponentAssetValues> getComponentAssetValues() {
        return this.componentAssetValues;
    }

    public CreateComponentAssetRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public CreateComponentAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateComponentAssetRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class CreateComponentAssetRequestComponentAssetValues extends TeaModel {
        /**
         * <p>Field name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Field value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://logs.aliyuncs.com">http://logs.aliyuncs.com</a></p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        public static CreateComponentAssetRequestComponentAssetValues build(java.util.Map<String, ?> map) throws Exception {
            CreateComponentAssetRequestComponentAssetValues self = new CreateComponentAssetRequestComponentAssetValues();
            return TeaModel.build(map, self);
        }

        public CreateComponentAssetRequestComponentAssetValues setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public CreateComponentAssetRequestComponentAssetValues setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
