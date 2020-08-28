// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DBType")
    @Validation(required = true)
    public String DBType;

    @NameInMap("DBVersion")
    @Validation(required = true)
    public String DBVersion;

    @NameInMap("RunningParameters")
    @Validation(required = true)
    public DescribeDBClusterParametersResponseRunningParameters runningParameters;

    public static DescribeDBClusterParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterParametersResponse self = new DescribeDBClusterParametersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterParametersResponseRunningParametersParameter extends TeaModel {
        @NameInMap("ParameterName")
        @Validation(required = true)
        public String parameterName;

        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("DefaultParameterValue")
        @Validation(required = true)
        public String defaultParameterValue;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("IsModifiable")
        @Validation(required = true)
        public Boolean isModifiable;

        @NameInMap("ForceRestart")
        @Validation(required = true)
        public Boolean forceRestart;

        @NameInMap("ParameterStatus")
        @Validation(required = true)
        public String parameterStatus;

        @NameInMap("CheckingCode")
        @Validation(required = true)
        public String checkingCode;

        @NameInMap("ParameterDescription")
        @Validation(required = true)
        public String parameterDescription;

        public static DescribeDBClusterParametersResponseRunningParametersParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterParametersResponseRunningParametersParameter self = new DescribeDBClusterParametersResponseRunningParametersParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterParametersResponseRunningParameters extends TeaModel {
        @NameInMap("Parameter")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterParametersResponseRunningParametersParameter> parameter;

        public static DescribeDBClusterParametersResponseRunningParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterParametersResponseRunningParameters self = new DescribeDBClusterParametersResponseRunningParameters();
            return TeaModel.build(map, self);
        }

    }

}
