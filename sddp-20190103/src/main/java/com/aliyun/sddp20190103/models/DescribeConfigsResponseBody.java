// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeConfigsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of common configuration items for alerts.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeConfigsResponseBodyConfigList> configList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigsResponseBody self = new DescribeConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigsResponseBody setConfigList(java.util.List<DescribeConfigsResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeConfigsResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeConfigsResponseBodyConfigList extends TeaModel {
        /**
         * <p>The code of the common configuration item.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the default value for the common configuration item.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the common configuration item.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the common configuration item.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The value of the common configuration item.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeConfigsResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigsResponseBodyConfigList self = new DescribeConfigsResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeConfigsResponseBodyConfigList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeConfigsResponseBodyConfigList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeConfigsResponseBodyConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeConfigsResponseBodyConfigList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeConfigsResponseBodyConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
