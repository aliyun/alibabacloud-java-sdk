// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceConfigurationRequest extends TeaModel {
    @NameInMap("Configuration")
    public java.util.List<DeleteRenderingInstanceConfigurationRequestConfiguration> configuration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DeleteRenderingInstanceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceConfigurationRequest self = new DeleteRenderingInstanceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceConfigurationRequest setConfiguration(java.util.List<DeleteRenderingInstanceConfigurationRequestConfiguration> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<DeleteRenderingInstanceConfigurationRequestConfiguration> getConfiguration() {
        return this.configuration;
    }

    public DeleteRenderingInstanceConfigurationRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static class DeleteRenderingInstanceConfigurationRequestConfiguration extends TeaModel {
        @NameInMap("AttributeNames")
        public java.util.List<String> attributeNames;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>location</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        public static DeleteRenderingInstanceConfigurationRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DeleteRenderingInstanceConfigurationRequestConfiguration self = new DeleteRenderingInstanceConfigurationRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public DeleteRenderingInstanceConfigurationRequestConfiguration setAttributeNames(java.util.List<String> attributeNames) {
            this.attributeNames = attributeNames;
            return this;
        }
        public java.util.List<String> getAttributeNames() {
            return this.attributeNames;
        }

        public DeleteRenderingInstanceConfigurationRequestConfiguration setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
