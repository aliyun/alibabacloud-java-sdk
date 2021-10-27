// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeParameterTemplatesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponseBody self = new DescribeParameterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponseBody setData(DescribeParameterTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeParameterTemplatesResponseBodyData getData() {
        return this.data;
    }

    public DescribeParameterTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterTemplatesResponseBodyDataParameters extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("Dynamic")
        public Integer dynamic;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("Revisable")
        public Integer revisable;

        public static DescribeParameterTemplatesResponseBodyDataParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseBodyDataParameters self = new DescribeParameterTemplatesResponseBodyDataParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseBodyDataParameters setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParameterTemplatesResponseBodyDataParameters setDynamic(Integer dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Integer getDynamic() {
            return this.dynamic;
        }

        public DescribeParameterTemplatesResponseBodyDataParameters setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParameterTemplatesResponseBodyDataParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParameterTemplatesResponseBodyDataParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public DescribeParameterTemplatesResponseBodyDataParameters setRevisable(Integer revisable) {
            this.revisable = revisable;
            return this;
        }
        public Integer getRevisable() {
            return this.revisable;
        }

    }

    public static class DescribeParameterTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ParameterCount")
        public Integer parameterCount;

        @NameInMap("Parameters")
        public java.util.List<DescribeParameterTemplatesResponseBodyDataParameters> parameters;

        public static DescribeParameterTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseBodyData self = new DescribeParameterTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeParameterTemplatesResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeParameterTemplatesResponseBodyData setParameterCount(Integer parameterCount) {
            this.parameterCount = parameterCount;
            return this;
        }
        public Integer getParameterCount() {
            return this.parameterCount;
        }

        public DescribeParameterTemplatesResponseBodyData setParameters(java.util.List<DescribeParameterTemplatesResponseBodyDataParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<DescribeParameterTemplatesResponseBodyDataParameters> getParameters() {
            return this.parameters;
        }

    }

}
