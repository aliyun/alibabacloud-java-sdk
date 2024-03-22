// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeExecutePlaybooksResponseBody extends TeaModel {
    /**
     * <p>The playbook.</p>
     */
    @NameInMap("PlaybookMetrics")
    public java.util.List<DescribeExecutePlaybooksResponseBodyPlaybookMetrics> playbookMetrics;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExecutePlaybooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutePlaybooksResponseBody self = new DescribeExecutePlaybooksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExecutePlaybooksResponseBody setPlaybookMetrics(java.util.List<DescribeExecutePlaybooksResponseBodyPlaybookMetrics> playbookMetrics) {
        this.playbookMetrics = playbookMetrics;
        return this;
    }
    public java.util.List<DescribeExecutePlaybooksResponseBodyPlaybookMetrics> getPlaybookMetrics() {
        return this.playbookMetrics;
    }

    public DescribeExecutePlaybooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExecutePlaybooksResponseBodyPlaybookMetrics extends TeaModel {
        /**
         * <p>The playbook description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The playbook name.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The configuration of the input parameter. The value is a JSON array.</p>
         * <br>
         * <p>>  For more information, see [DescribePlaybookInputOutput](~~DescribePlaybookInputOutput~~).</p>
         */
        @NameInMap("ParamConfig")
        public String paramConfig;

        /**
         * <p>The input parameter type of the playbook.</p>
         * <br>
         * <p>*   **template-ip**</p>
         * <p>*   **template-file**</p>
         * <p>*   **template-process**</p>
         * <p>*   **custom**</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>The playbook UUID.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExecutePlaybooksResponseBodyPlaybookMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeExecutePlaybooksResponseBodyPlaybookMetrics self = new DescribeExecutePlaybooksResponseBodyPlaybookMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeExecutePlaybooksResponseBodyPlaybookMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExecutePlaybooksResponseBodyPlaybookMetrics setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeExecutePlaybooksResponseBodyPlaybookMetrics setParamConfig(String paramConfig) {
            this.paramConfig = paramConfig;
            return this;
        }
        public String getParamConfig() {
            return this.paramConfig;
        }

        public DescribeExecutePlaybooksResponseBodyPlaybookMetrics setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public DescribeExecutePlaybooksResponseBodyPlaybookMetrics setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
