// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingInstanceSettingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    @NameInMap("Settings")
    public java.util.List<UpdateRenderingInstanceSettingsRequestSettings> settings;

    public static UpdateRenderingInstanceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingInstanceSettingsRequest self = new UpdateRenderingInstanceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingInstanceSettingsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public UpdateRenderingInstanceSettingsRequest setSettings(java.util.List<UpdateRenderingInstanceSettingsRequestSettings> settings) {
        this.settings = settings;
        return this;
    }
    public java.util.List<UpdateRenderingInstanceSettingsRequestSettings> getSettings() {
        return this.settings;
    }

    public static class UpdateRenderingInstanceSettingsRequestSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>navbar.hide</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AttributeValue")
        public String attributeValue;

        public static UpdateRenderingInstanceSettingsRequestSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateRenderingInstanceSettingsRequestSettings self = new UpdateRenderingInstanceSettingsRequestSettings();
            return TeaModel.build(map, self);
        }

        public UpdateRenderingInstanceSettingsRequestSettings setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public UpdateRenderingInstanceSettingsRequestSettings setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

}
