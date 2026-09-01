// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentPlaybookResponseBody extends TeaModel {
    /**
     * <p>The list of component playbooks.</p>
     */
    @NameInMap("Playbooks")
    public java.util.List<DescribeComponentPlaybookResponseBodyPlaybooks> playbooks;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C5F5D6C9-DF1A-5381-92B1-39676F777D20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPlaybookResponseBody self = new DescribeComponentPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPlaybookResponseBody setPlaybooks(java.util.List<DescribeComponentPlaybookResponseBodyPlaybooks> playbooks) {
        this.playbooks = playbooks;
        return this;
    }
    public java.util.List<DescribeComponentPlaybookResponseBodyPlaybooks> getPlaybooks() {
        return this.playbooks;
    }

    public DescribeComponentPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComponentPlaybookResponseBodyPlaybooks extends TeaModel {
        /**
         * <p>The description of the component playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_kill_process</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the component playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>AegisKillQuara</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The input parameter configurations of the component playbook. The value is a JSON array.</p>
         * <blockquote>
         * <p>For more information about the format, see <a href="~~DescribePlaybookInputOutput~~">DescribePlaybookInputOutput</a>.</p>
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
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The input parameter type of the component playbook.</p>
         * <p>template-ip: IP request template.
         * template-file: file request template.
         * template-process: process request template.
         * custom: custom parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>template-alert</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        public static DescribeComponentPlaybookResponseBodyPlaybooks build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentPlaybookResponseBodyPlaybooks self = new DescribeComponentPlaybookResponseBodyPlaybooks();
            return TeaModel.build(map, self);
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public DescribeComponentPlaybookResponseBodyPlaybooks setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

    }

}
