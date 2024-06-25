// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    /**
     * <p>The type of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The database engine of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>POLARDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The number of parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>183</p>
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
     * <p>D963934D-8605-4473-8EAC-54C719******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponseBody self = new DescribeParameterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeParameterTemplatesResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeParameterTemplatesResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
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
         * <p>[ROW|STATEMENT|MIXED]</p>
         */
        @NameInMap("CheckingCode")
        public String checkingCode;

        /**
         * <p>Indicates whether the parameter setting can be modified. Valid values:</p>
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
         * <p>Indicates whether a cluster restart is required to make the parameter modification take effect. Valid values:</p>
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
         * <p>Indicates whether the parameter is a global parameter. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: yes. The modified parameter value is synchronized to other nodes by default.</li>
         * <li><strong>1</strong>: no. You can customize the nodes to which the modified parameter value can be synchronized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsNodeAvailable")
        public String isNodeAvailable;

        /**
         * <p>The parameter dependencies.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("ParamRelyRule")
        public String paramRelyRule;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>What form of binary logging the master will use.</p>
         */
        @NameInMap("ParameterDescription")
        public String parameterDescription;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>binlog_format</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ROW</p>
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

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setIsNodeAvailable(String isNodeAvailable) {
            this.isNodeAvailable = isNodeAvailable;
            return this;
        }
        public String getIsNodeAvailable() {
            return this.isNodeAvailable;
        }

        public DescribeParameterTemplatesResponseBodyParametersTemplateRecord setParamRelyRule(String paramRelyRule) {
            this.paramRelyRule = paramRelyRule;
            return this;
        }
        public String getParamRelyRule() {
            return this.paramRelyRule;
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
