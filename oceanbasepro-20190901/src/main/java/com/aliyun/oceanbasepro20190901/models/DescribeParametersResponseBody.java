// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    /**
     * <p>The information of parameters.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<DescribeParametersResponseBodyParameters> parameters;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The valid value range of the parameter.  It is an array with two string elements, which represents a range. The first element represents the minimum value and the second element represents the maximum value.</p>
         */
        @NameInMap("AcceptableValue")
        public java.util.List<String> acceptableValue;

        /**
         * <p>The current value of the parameter.</p>
         */
        @NameInMap("CurrentValue")
        public String currentValue;

        /**
         * <p>The default value of the parameter.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether a restart is required for changes to the parameter to take effect. Valid values:   </p>
         * <p>- true: A restart is required.   </p>
         * <p>- false: A restart is not required.</p>
         */
        @NameInMap("NeedReboot")
        public Boolean needReboot;

        /**
         * <p>The invalid value range of the parameter.    </p>
         * <p>It is an array with two string elements, which represents a range. The first element represents the minimum value and the second element represents the maximum value.</p>
         */
        @NameInMap("RejectedValue")
        public java.util.List<String> rejectedValue;

        /**
         * <p>The type of the parameter value.    Valid values:   </p>
         * <p>- ENUM: an enumeration value.   </p>
         * <p>- RANGE: a value range.   </p>
         * <p>- TIME: a time value.   </p>
         * <p>- CAPACITY: a storage capacity, in KB, MB, or GB.</p>
         */
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
