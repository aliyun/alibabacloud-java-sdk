// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    // 参数列表信息
    @NameInMap("Parameters")
    public java.util.List<DescribeParametersResponseBodyParameters> parameters;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponseBody self = new DescribeParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParametersResponseBody setParameters(java.util.List<DescribeParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<DescribeParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public DescribeParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParametersResponseBodyParameters extends TeaModel {
        // 参数的可接受取值范围。 其格式为具备两个字符串元素的数组类型，表示一个范围值，第一个元素为最小值，第二个元素为最大值。
        @NameInMap("AcceptableValue")
        public java.util.List<String> acceptableValue;

        // 参数的当前取值。
        @NameInMap("CurrentValue")
        public String currentValue;

        // 参数的默认取值。
        @NameInMap("DefaultValue")
        public String defaultValue;

        // 参数的描述信息。
        @NameInMap("Description")
        public String description;

        // 参数名称。
        @NameInMap("Name")
        public String name;

        // 修改此参数是否需要重启 - true：需要重启 - false：不需要重启
        @NameInMap("NeedReboot")
        public Boolean needReboot;

        // 参数的不允许取值范围。 其格式为具备两个字符串元素的数组类型，表示一个范围值，第一个元素为最小值，第二个元素为最大值。
        @NameInMap("RejectedValue")
        public java.util.List<String> rejectedValue;

        // 参数取值的类型。 其支持： - ENUM: 数值枚举 - RANGE: 数值范围 - TIME: 时间 - CAPACITY：存储容量值（K，M，G）
        @NameInMap("ValueType")
        public String valueType;

        public static DescribeParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseBodyParameters self = new DescribeParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParametersResponseBodyParameters setAcceptableValue(java.util.List<String> acceptableValue) {
            this.acceptableValue = acceptableValue;
            return this;
        }
        public java.util.List<String> getAcceptableValue() {
            return this.acceptableValue;
        }

        public DescribeParametersResponseBodyParameters setCurrentValue(String currentValue) {
            this.currentValue = currentValue;
            return this;
        }
        public String getCurrentValue() {
            return this.currentValue;
        }

        public DescribeParametersResponseBodyParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeParametersResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeParametersResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParametersResponseBodyParameters setNeedReboot(Boolean needReboot) {
            this.needReboot = needReboot;
            return this;
        }
        public Boolean getNeedReboot() {
            return this.needReboot;
        }

        public DescribeParametersResponseBodyParameters setRejectedValue(java.util.List<String> rejectedValue) {
            this.rejectedValue = rejectedValue;
            return this;
        }
        public java.util.List<String> getRejectedValue() {
            return this.rejectedValue;
        }

        public DescribeParametersResponseBodyParameters setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

}
