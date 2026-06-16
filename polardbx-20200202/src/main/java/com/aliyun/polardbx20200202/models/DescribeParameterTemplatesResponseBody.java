// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeParameterTemplatesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
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
        /**
         * <p>The validation constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>[0|1]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the parameter is dynamic. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dynamic")
        public Integer dynamic;

        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx hatp addition param</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>loose_enable_gts</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        /**
         * <p>Indicates whether the parameter can be modified. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The parameter cannot be modified.</li>
         * <li><strong>1</strong>: The parameter can be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Revisable")
        public Integer revisable;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UserChangable")
        public Integer userChangable;

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

        public DescribeParameterTemplatesResponseBodyDataParameters setUserChangable(Integer userChangable) {
            this.userChangable = userChangable;
            return this;
        }
        public Integer getUserChangable() {
            return this.userChangable;
        }

    }

    public static class DescribeParameterTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The engine. Default value: polarx.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The DPI engine version. Default value: 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The number of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>218</p>
         */
        @NameInMap("ParameterCount")
        public Integer parameterCount;

        /**
         * <p>The parameter list.</p>
         */
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
