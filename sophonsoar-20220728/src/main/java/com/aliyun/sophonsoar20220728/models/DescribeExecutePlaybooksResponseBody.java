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
     * 
     * <strong>example:</strong>
     * <p>88A39217-2802-5B1E-BA2B-CF1BBC43C1F5</p>
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
         * 
         * <strong>example:</strong>
         * <p>a demo playbook</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The playbook name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_playbook</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The configuration of the input parameter. The value is a JSON array.</p>
         * <blockquote>
         * <p> For more information, see <a href="~~DescribePlaybookInputOutput~~">DescribePlaybookInputOutput</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;typeName&quot;: &quot;String&quot;,
         *         &quot;dataClass&quot;: &quot;normal&quot;,
         *         &quot;dataType&quot;: &quot;String&quot;,
         *         &quot;description&quot;: &quot;period&quot;,
         *         &quot;example&quot;: &quot;&quot;,
         *         &quot;name&quot;: &quot;period&quot;,
         *         &quot;required&quot;: false
         *     }
         * ]</p>
         */
        @NameInMap("ParamConfig")
        public String paramConfig;

        /**
         * <p>The input parameter type of the playbook.</p>
         * <ul>
         * <li><strong>template-ip</strong></li>
         * <li><strong>template-file</strong></li>
         * <li><strong>template-process</strong></li>
         * <li><strong>custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <p>The playbook UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c88b5e-97ca-435d-8c20-2xxxxx</p>
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
