// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookInputOutputResponseBody extends TeaModel {
    /**
     * <p>The configurations.</p>
     */
    @NameInMap("Config")
    public DescribePlaybookInputOutputResponseBodyConfig config;

    /**
     * <p>The request ID.</p>
     */
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
        @NameInMap("ExeConfig")
        public String exeConfig;

        /**
         * <p>The input parameter configuration of the playbook. The value is a JSON array.</p>
         */
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The output parameter configuration. This parameter is unavailable and is always left empty.</p>
         */
        @NameInMap("OutputParams")
        public String outputParams;

        /**
         * <p>The input parameter type of the playbook. Valid values:</p>
         * <br>
         * <p>*   **template-ip**</p>
         * <p>*   **template-file**</p>
         * <p>*   **template-process**</p>
         * <p>*   **custom**</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>The UUID of the playbook.</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        public static DescribePlaybookInputOutputResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookInputOutputResponseBodyConfig self = new DescribePlaybookInputOutputResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookInputOutputResponseBodyConfig setExeConfig(String exeConfig) {
            this.exeConfig = exeConfig;
            return this;
        }
        public String getExeConfig() {
            return this.exeConfig;
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
