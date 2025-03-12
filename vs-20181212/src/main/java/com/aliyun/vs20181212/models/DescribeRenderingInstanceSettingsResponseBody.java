// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceSettingsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Settings")
    public java.util.List<DescribeRenderingInstanceSettingsResponseBodySettings> settings;

    public static DescribeRenderingInstanceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceSettingsResponseBody self = new DescribeRenderingInstanceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenderingInstanceSettingsResponseBody setSettings(java.util.List<DescribeRenderingInstanceSettingsResponseBodySettings> settings) {
        this.settings = settings;
        return this;
    }
    public java.util.List<DescribeRenderingInstanceSettingsResponseBodySettings> getSettings() {
        return this.settings;
    }

    public static class DescribeRenderingInstanceSettingsResponseBodySettings extends TeaModel {
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

        public static DescribeRenderingInstanceSettingsResponseBodySettings build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenderingInstanceSettingsResponseBodySettings self = new DescribeRenderingInstanceSettingsResponseBodySettings();
            return TeaModel.build(map, self);
        }

        public DescribeRenderingInstanceSettingsResponseBodySettings setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeRenderingInstanceSettingsResponseBodySettings setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

}
