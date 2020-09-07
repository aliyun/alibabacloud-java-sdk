// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterTemplatesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("ParameterCount")
    @Validation(required = true)
    public String parameterCount;

    @NameInMap("Parameters")
    @Validation(required = true)
    public DescribeParameterTemplatesResponseParameters parameters;

    public static DescribeParameterTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTemplatesResponse self = new DescribeParameterTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterTemplatesResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeParameterTemplatesResponse setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeParameterTemplatesResponse setParameterCount(String parameterCount) {
        this.parameterCount = parameterCount;
        return this;
    }
    public String getParameterCount() {
        return this.parameterCount;
    }

    public DescribeParameterTemplatesResponse setParameters(DescribeParameterTemplatesResponseParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public DescribeParameterTemplatesResponseParameters getParameters() {
        return this.parameters;
    }

    public static class DescribeParameterTemplatesResponseParametersTemplateRecord extends TeaModel {
        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ForceModify")
        @Validation(required = true)
        public String forceModify;

        @NameInMap("ForceRestart")
        @Validation(required = true)
        public String forceRestart;

        @NameInMap("CheckingCode")
        @Validation(required = true)
        public String checkingCode;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        public static DescribeParameterTemplatesResponseParametersTemplateRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseParametersTemplateRecord self = new DescribeParameterTemplatesResponseParametersTemplateRecord();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseParametersTemplateRecord setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParameterTemplatesResponseParametersTemplateRecord setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

        public DescribeParameterTemplatesResponseParametersTemplateRecord setForceModify(String forceModify) {
            this.forceModify = forceModify;
            return this;
        }
        public String getForceModify() {
            return this.forceModify;
        }

        public DescribeParameterTemplatesResponseParametersTemplateRecord setForceRestart(String forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }
        public String getForceRestart() {
            return this.forceRestart;
        }

        public DescribeParameterTemplatesResponseParametersTemplateRecord setCheckingCode(String checkingCode) {
            this.checkingCode = checkingCode;
            return this;
        }
        public String getCheckingCode() {
            return this.checkingCode;
        }

        public DescribeParameterTemplatesResponseParametersTemplateRecord setParameterDescription(String parameterDescription) {
            this.parameterDescription = parameterDescription;
            return this;
        }
        public String getParameterDescription() {
            return this.parameterDescription;
        }

    }

    public static class DescribeParameterTemplatesResponseParameters extends TeaModel {
        @NameInMap("TemplateRecord")
        @Validation(required = true)
        public java.util.List<DescribeParameterTemplatesResponseParametersTemplateRecord> templateRecord;

        public static DescribeParameterTemplatesResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseParameters self = new DescribeParameterTemplatesResponseParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTemplatesResponseParameters setTemplateRecord(java.util.List<DescribeParameterTemplatesResponseParametersTemplateRecord> templateRecord) {
            this.templateRecord = templateRecord;
            return this;
        }
        public java.util.List<DescribeParameterTemplatesResponseParametersTemplateRecord> getTemplateRecord() {
            return this.templateRecord;
        }

    }

}
