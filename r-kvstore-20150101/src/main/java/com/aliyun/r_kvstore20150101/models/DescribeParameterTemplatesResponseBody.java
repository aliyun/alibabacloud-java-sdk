// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    /**
     * <p>The database engine that is run on the instance. The value <strong>Redis</strong> is returned for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The major version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The number of parameters that are supported by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("ParameterCount")
    public String parameterCount;

    /**
     * <p>An array that consists of the details about the parameters returned.</p>
     */
    @NameInMap("Parameters")
    public DescribeParameterTemplatesResponseBodyParameters parameters;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9DA28D8E-514D-4F12-ADED-70A9C818****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponseBody self = new DescribeParameterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParameterTemplatesResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterTemplatesResponseBody setParameterCount(String parameterCount) {
        this.parameterCount = parameterCount;
        return this;
    }
    public String getParameterCount() {
        return this.parameterCount;
    }

    public DescribeParameterTemplatesResponseBody setParameters(DescribeParameterTemplatesResponseBodyParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeParameterTemplatesResponseBodyParameters getParameters() {
        return this.parameters;
    }

    public DescribeParameterTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterTemplatesResponseBodyParametersTemplateRecord extends TeaModel {
        /**
         * <p>The valid values of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[yes|no]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the parameter can be reconfigured. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The parameter can be reconfigured.</li>
         * <li><strong>false</strong>: The parameter cannot be reconfigured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceModify")
        public Boolean forceModify;

        /**
         * <p>Indicates whether a restart of the instance is required after the parameter is reconfigured. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: After the parameter is reconfigured, you must restart the instance to make the new value of the parameter take effect.</li>
         * <li><strong>false</strong>: After the parameter is reconfigured, the new value of the parameter immediately takes effect. You do not need to restart the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceRestart")
        public Boolean forceRestart;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter. For more information about the parameters and the parameter settings, see <a href="https://help.aliyun.com/document_detail/259681.html">Parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>appendonly</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static DescribeParameterTemplatesResponseBodyParametersTemplateRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseBodyParametersTemplateRecord self = new DescribeParameterTemplatesResponseBodyParametersTemplateRecord();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setForceModify(Boolean forceModify) {
            this.forceModify = forceModify;
            return this;
        }
        public Boolean getForceModify() {
            return this.forceModify;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setForceRestart(Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class DescribeParameterTemplatesResponseBodyParameters extends TeaModel {
        @NameInMap("TemplateRecord")
        public java.util.List<DescribeParameterTemplatesResponseBodyParametersTemplateRecord> templateRecord;

        public static DescribeParameterTemplatesResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseBodyParameters self = new DescribeParameterTemplatesResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseBodyParameters setTemplateRecord(java.util.List<DescribeParameterTemplatesResponseBodyParametersTemplateRecord> templateRecord) {
            this.templateRecord = templateRecord;
            return this;
        }
        public java.util.List<DescribeParameterTemplatesResponseBodyParametersTemplateRecord> getTemplateRecord() {
            return this.templateRecord;
        }

    }

}
