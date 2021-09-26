// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigList")
    public java.util.List<DescribeConfigsResponseBodyConfigList> configList;

    public static DescribeConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigsResponseBody self = new DescribeConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigsResponseBody setConfigList(java.util.List<DescribeConfigsResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeConfigsResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public static class DescribeConfigsResponseBodyConfigList extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("Value")
        public Long value;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        public static DescribeConfigsResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigsResponseBodyConfigList self = new DescribeConfigsResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeConfigsResponseBodyConfigList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeConfigsResponseBodyConfigList setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
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

    }

}
