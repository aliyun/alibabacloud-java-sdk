// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceConfigurationResponseBody extends TeaModel {
    @NameInMap("Configuration")
    public java.util.List<DescribeRenderingInstanceConfigurationResponseBodyConfiguration> configuration;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRenderingInstanceConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceConfigurationResponseBody self = new DescribeRenderingInstanceConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceConfigurationResponseBody setConfiguration(java.util.List<DescribeRenderingInstanceConfigurationResponseBodyConfiguration> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.List<DescribeRenderingInstanceConfigurationResponseBodyConfiguration> getConfiguration() {
        return this.configuration;
    }

    public DescribeRenderingInstanceConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lon</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes self = new DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeRenderingInstanceConfigurationResponseBodyConfiguration extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes> attributes;

        /**
         * <strong>example:</strong>
         * <p>location</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        public static DescribeRenderingInstanceConfigurationResponseBodyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceConfigurationResponseBodyConfiguration self = new DescribeRenderingInstanceConfigurationResponseBodyConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceConfigurationResponseBodyConfiguration setAttributes(java.util.List<DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<DescribeRenderingInstanceConfigurationResponseBodyConfigurationAttributes> getAttributes() {
            return this.attributes;
        }

        public DescribeRenderingInstanceConfigurationResponseBodyConfiguration setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
