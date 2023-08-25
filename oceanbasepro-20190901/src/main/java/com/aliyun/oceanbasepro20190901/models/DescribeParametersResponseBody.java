// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a restart is required for changes to the parameter to take effect. Valid values:   </p>
     * <p>- true: A restart is required.   </p>
     * <p>- false: A restart is not required.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<DescribeParametersResponseBodyParameters> parameters;

    /**
     * <p>The return result of the request.</p>
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
         * <p>DescribeParameters</p>
         */
        @NameInMap("AcceptableValue")
        public java.util.List<String> acceptableValue;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("CurrentValue")
        public String currentValue;

        /**
         * <p>```</p>
         * <p>http(s)://[Endpoint]/?Action=DescribeParameters</p>
         * <p>&InstanceId=ob317v4uif****</p>
         * <p>&Dimension=TENANT</p>
         * <p>&DimensionValue=ob2mr3oae0****</p>
         * <p>&Common request parameters</p>
         * <p>```</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("NeedReboot")
        public Boolean needReboot;

        /**
         * <p>参数是否只读</p>
         */
        @NameInMap("Readonly")
        public Boolean readonly;

        /**
         * <p>{</p>
         * <p>    "RequestId": "EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C",</p>
         * <p>    "Parameters": [</p>
         * <p>        {</p>
         * <p>            "Description": "The maximum delay allowed in weak-consistency reads.",</p>
         * <p>            "ValueType": "CAPACITY",</p>
         * <p>            "CurrentValue": "600",</p>
         * <p>            "NeedReboot": false,</p>
         * <p>            "Name": "connect_timeout",</p>
         * <p>            "DefaultValue": "600s",</p>
         * <p>            "RejectedValue": [</p>
         * <p>                "1s"</p>
         * <p>            ],</p>
         * <p>            "AcceptableValue": [</p>
         * <p>                "1s"</p>
         * <p>            ]</p>
         * <p>        }</p>
         * <p>    ]</p>
         * <p>}</p>
         */
        @NameInMap("RejectedValue")
        public java.util.List<String> rejectedValue;

        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The invalid value range of the parameter.    </p>
         * <p>It is an array with two string elements, which represents a range. The first element represents the minimum value and the second element represents the maximum value.</p>
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

        public DescribeParametersResponseBodyParameters setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public DescribeParametersResponseBodyParameters setRejectedValue(java.util.List<String> rejectedValue) {
            this.rejectedValue = rejectedValue;
            return this;
        }
        public java.util.List<String> getRejectedValue() {
            return this.rejectedValue;
        }

        public DescribeParametersResponseBodyParameters setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
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
