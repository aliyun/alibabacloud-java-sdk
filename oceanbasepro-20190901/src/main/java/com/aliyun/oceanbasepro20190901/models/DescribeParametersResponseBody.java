// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<DescribeParametersResponseBodyParameters> parameters;

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
        @NameInMap("AcceptableValue")
        public java.util.List<String> acceptableValue;

        @NameInMap("CurrentValue")
        public String currentValue;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedReboot")
        public Boolean needReboot;

        @NameInMap("RejectedValue")
        public java.util.List<String> rejectedValue;

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
