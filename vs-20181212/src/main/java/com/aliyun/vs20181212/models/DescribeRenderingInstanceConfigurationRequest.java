// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceConfigurationRequest extends TeaModel {
    @NameInMap("Configuration")
    public java.util.List<DescribeRenderingInstanceConfigurationRequestConfiguration> configuration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    public static DescribeRenderingInstanceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceConfigurationRequest self = new DescribeRenderingInstanceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceConfigurationRequest setConfiguration(java.util.List<DescribeRenderingInstanceConfigurationRequestConfiguration> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<DescribeRenderingInstanceConfigurationRequestConfiguration> getConfiguration() {
        return this.configuration;
    }

    public DescribeRenderingInstanceConfigurationRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static class DescribeRenderingInstanceConfigurationRequestConfiguration extends TeaModel {
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

        public static DescribeRenderingInstanceConfigurationRequestConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceConfigurationRequestConfiguration self = new DescribeRenderingInstanceConfigurationRequestConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceConfigurationRequestConfiguration setAttributeNames(java.util.List<String> attributeNames) {
            this.attributeNames = attributeNames;
            return this;
        }
        public java.util.List<String> getAttributeNames() {
            return this.attributeNames;
        }

        public DescribeRenderingInstanceConfigurationRequestConfiguration setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
