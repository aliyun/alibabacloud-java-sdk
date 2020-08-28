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

    }

    public static class DescribeParameterTemplatesResponseParameters extends TeaModel {
        @NameInMap("TemplateRecord")
        @Validation(required = true)
        public java.util.List<DescribeParameterTemplatesResponseParametersTemplateRecord> templateRecord;

        public static DescribeParameterTemplatesResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTemplatesResponseParameters self = new DescribeParameterTemplatesResponseParameters();
            return TeaModel.build(map, self);
        }

    }

}
