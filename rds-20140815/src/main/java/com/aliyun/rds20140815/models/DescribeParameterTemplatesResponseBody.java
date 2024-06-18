// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    /**
     * <p>The database engine of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The number of parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ParameterCount")
    public String parameterCount;

    /**
     * <p>The details of the parameters.</p>
     */
    @NameInMap("Parameters")
    public DescribeParameterTemplatesResponseBodyParameters parameters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0F9B7410-EC73-510C-B385-8339455C12C6</p>
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
         * <p>[0-1024]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the parameter can be modified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ForceModify")
        public String forceModify;

        /**
         * <p>Indicates whether you must restart the instance for the modifications to take effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceRestart")
        public String forceRestart;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Page numbers of multi blocks reading once in some ddl query.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>loose_multi_blocks_ddl_count</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setForceModify(String forceModify) {
            this.forceModify = forceModify;
            return this;
        }
        public String getForceModify() {
            return this.forceModify;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
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
