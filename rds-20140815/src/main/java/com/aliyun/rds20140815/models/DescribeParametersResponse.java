// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParametersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("ConfigParameters")
    @Validation(required = true)
    public DescribeParametersResponseConfigParameters configParameters;

    @NameInMap("RunningParameters")
    @Validation(required = true)
    public DescribeParametersResponseRunningParameters runningParameters;

    public static DescribeParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersResponse self = new DescribeParametersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeParametersResponseConfigParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        public static DescribeParametersResponseConfigParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseConfigParametersDBInstanceParameter self = new DescribeParametersResponseConfigParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeParametersResponseConfigParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        @Validation(required = true)
        public java.util.List<DescribeParametersResponseConfigParametersDBInstanceParameter> DBInstanceParameter;

        public static DescribeParametersResponseConfigParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseConfigParameters self = new DescribeParametersResponseConfigParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeParametersResponseRunningParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        public static DescribeParametersResponseRunningParametersDBInstanceParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseRunningParametersDBInstanceParameter self = new DescribeParametersResponseRunningParametersDBInstanceParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeParametersResponseRunningParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        @Validation(required = true)
        public java.util.List<DescribeParametersResponseRunningParametersDBInstanceParameter> DBInstanceParameter;

        public static DescribeParametersResponseRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParametersResponseRunningParameters self = new DescribeParametersResponseRunningParameters();
            return TeaModel.build(map, self);
        }

    }

}
