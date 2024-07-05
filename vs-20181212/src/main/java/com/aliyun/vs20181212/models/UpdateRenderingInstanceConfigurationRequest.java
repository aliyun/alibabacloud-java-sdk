// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateRenderingInstanceConfigurationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Configuration")
    public java.util.List<UpdateRenderingInstanceConfigurationRequestConfiguration> configuration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static UpdateRenderingInstanceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRenderingInstanceConfigurationRequest self = new UpdateRenderingInstanceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRenderingInstanceConfigurationRequest setConfiguration(java.util.List<UpdateRenderingInstanceConfigurationRequestConfiguration> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<UpdateRenderingInstanceConfigurationRequestConfiguration> getConfiguration() {
        return this.configuration;
    }

    public UpdateRenderingInstanceConfigurationRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static class UpdateRenderingInstanceConfigurationRequestConfigurationAttributes extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lon</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public Object value;

        public static UpdateRenderingInstanceConfigurationRequestConfigurationAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdateRenderingInstanceConfigurationRequestConfigurationAttributes self = new UpdateRenderingInstanceConfigurationRequestConfigurationAttributes();
            return TeaModel.build(map, self);
        }

        public UpdateRenderingInstanceConfigurationRequestConfigurationAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRenderingInstanceConfigurationRequestConfigurationAttributes setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class UpdateRenderingInstanceConfigurationRequestConfiguration extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<UpdateRenderingInstanceConfigurationRequestConfigurationAttributes> attributes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>location</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        public static UpdateRenderingInstanceConfigurationRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateRenderingInstanceConfigurationRequestConfiguration self = new UpdateRenderingInstanceConfigurationRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateRenderingInstanceConfigurationRequestConfiguration setAttributes(java.util.List<UpdateRenderingInstanceConfigurationRequestConfigurationAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<UpdateRenderingInstanceConfigurationRequestConfigurationAttributes> getAttributes() {
            return this.attributes;
        }

        public UpdateRenderingInstanceConfigurationRequestConfiguration setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
