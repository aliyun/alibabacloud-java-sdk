// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookInputOutputResponseBody extends TeaModel {
    @NameInMap("Config")
    public DescribePlaybookInputOutputResponseBodyConfig config;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookInputOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookInputOutputResponseBody self = new DescribePlaybookInputOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookInputOutputResponseBody setConfig(DescribePlaybookInputOutputResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribePlaybookInputOutputResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribePlaybookInputOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookInputOutputResponseBodyConfig extends TeaModel {
        @NameInMap("InputParams")
        public String inputParams;

        @NameInMap("OutputParams")
        public String outputParams;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        public static DescribePlaybookInputOutputResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookInputOutputResponseBodyConfig self = new DescribePlaybookInputOutputResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookInputOutputResponseBodyConfig setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public DescribePlaybookInputOutputResponseBodyConfig setOutputParams(String outputParams) {
            this.outputParams = outputParams;
            return this;
        }
        public String getOutputParams() {
            return this.outputParams;
        }

        public DescribePlaybookInputOutputResponseBodyConfig setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public DescribePlaybookInputOutputResponseBodyConfig setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

    }

}
