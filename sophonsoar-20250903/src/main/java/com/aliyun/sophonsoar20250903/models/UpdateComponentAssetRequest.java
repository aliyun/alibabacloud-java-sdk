// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class UpdateComponentAssetRequest extends TeaModel {
    /**
     * <p>Asset name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_asset</p>
     */
    @NameInMap("ComponentAssetName")
    public String componentAssetName;

    /**
     * <p>Asset UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
     */
    @NameInMap("ComponentAssetUuid")
    public String componentAssetUuid;

    /**
     * <p>Configuration information of the asset.</p>
     */
    @NameInMap("ComponentAssetValues")
    public java.util.List<UpdateComponentAssetRequestComponentAssetValues> componentAssetValues;

    /**
     * <p>The language type for the request and response. Values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
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

    public static UpdateComponentAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentAssetRequest self = new UpdateComponentAssetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentAssetRequest setComponentAssetName(String componentAssetName) {
        this.componentAssetName = componentAssetName;
        return this;
    }
    public String getComponentAssetName() {
        return this.componentAssetName;
    }

    public UpdateComponentAssetRequest setComponentAssetUuid(String componentAssetUuid) {
        this.componentAssetUuid = componentAssetUuid;
        return this;
    }
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    public UpdateComponentAssetRequest setComponentAssetValues(java.util.List<UpdateComponentAssetRequestComponentAssetValues> componentAssetValues) {
        this.componentAssetValues = componentAssetValues;
        return this;
    }
    public java.util.List<UpdateComponentAssetRequestComponentAssetValues> getComponentAssetValues() {
        return this.componentAssetValues;
    }

    public UpdateComponentAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateComponentAssetRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class UpdateComponentAssetRequestComponentAssetValues extends TeaModel {
        /**
         * <p>Field name.</p>
         * 
         * <strong>example:</strong>
         * <p>lh_source</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>Field value.</p>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        public static UpdateComponentAssetRequestComponentAssetValues build(java.util.Map<String, ?> map) throws Exception {
            UpdateComponentAssetRequestComponentAssetValues self = new UpdateComponentAssetRequestComponentAssetValues();
            return TeaModel.build(map, self);
        }

        public UpdateComponentAssetRequestComponentAssetValues setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public UpdateComponentAssetRequestComponentAssetValues setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

}
