// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponseBody extends TeaModel {
    @NameInMap("ParameterCount")
    public String parameterCount;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("Parameters")
    public DescribeParameterTemplatesResponseBodyParameters parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("Engine")
    public String engine;

    public static DescribeParameterTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponseBody self = new DescribeParameterTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponseBody setParameterCount(String parameterCount) {
        this.parameterCount = parameterCount;
        return this;
    }
    public String getParameterCount() {
        return this.parameterCount;
    }

    public DescribeParameterTemplatesResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
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

    public DescribeParameterTemplatesResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeParameterTemplatesResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public static class DescribeParameterTemplatesResponseBodyParametersTemplateRecord extends TeaModel {
        @NameInMap("CheckingCode")
        public String checkingCode;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValue")
        public String parameterValue;

        @NameInMap("ForceModify")
        public String forceModify;

        @NameInMap("ForceRestart")
        public String forceRestart;

        @NameInMap("ParameterDescription")
        public String parameterDescription;

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
