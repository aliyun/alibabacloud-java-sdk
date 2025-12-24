// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPlaybookResponseBody extends TeaModel {
    /**
     * <p>The result of the verification.</p>
     */
    @NameInMap("CheckTaskInfos")
    public java.util.List<VerifyPlaybookResponseBodyCheckTaskInfos> checkTaskInfos;

    @NameInMap("Prerequisites")
    public java.util.List<VerifyPlaybookResponseBodyPrerequisites> prerequisites;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0DFC9403-54EB-5672-B690-9AA93C9EBB54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyPlaybookResponseBody self = new VerifyPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyPlaybookResponseBody setCheckTaskInfos(java.util.List<VerifyPlaybookResponseBodyCheckTaskInfos> checkTaskInfos) {
        this.checkTaskInfos = checkTaskInfos;
        return this;
    }
    public java.util.List<VerifyPlaybookResponseBodyCheckTaskInfos> getCheckTaskInfos() {
        return this.checkTaskInfos;
    }

    public VerifyPlaybookResponseBody setPrerequisites(java.util.List<VerifyPlaybookResponseBodyPrerequisites> prerequisites) {
        this.prerequisites = prerequisites;
        return this;
    }
    public java.util.List<VerifyPlaybookResponseBodyPrerequisites> getPrerequisites() {
        return this.prerequisites;
    }

    public VerifyPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyPlaybookResponseBodyCheckTaskInfos extends TeaModel {
        /**
         * <p>The error message returned when the playbook does not pass the check.</p>
         * 
         * <strong>example:</strong>
         * <p>Node [python3_3] doesn\&quot;t have the asset information</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The name of the node in the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>python3_3</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The severity level of the verification information. Valid values:</p>
         * <ul>
         * <li>warn: An issue may occur during playbook running.</li>
         * <li>error: The playbook cannot be compiled.</li>
         * <li>remind: The publishing and running of the playbook are not affected. We recommend that you optimize the playbook format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static VerifyPlaybookResponseBodyCheckTaskInfos build(java.util.Map<String, ?> map) throws Exception {
            VerifyPlaybookResponseBodyCheckTaskInfos self = new VerifyPlaybookResponseBodyCheckTaskInfos();
            return TeaModel.build(map, self);
        }

        public VerifyPlaybookResponseBodyCheckTaskInfos setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public VerifyPlaybookResponseBodyCheckTaskInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public VerifyPlaybookResponseBodyCheckTaskInfos setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class VerifyPlaybookResponseBodyPrerequisites extends TeaModel {
        @NameInMap("PrerequisiteType")
        public String prerequisiteType;

        @NameInMap("PrerequisiteValue")
        public String prerequisiteValue;

        public static VerifyPlaybookResponseBodyPrerequisites build(java.util.Map<String, ?> map) throws Exception {
            VerifyPlaybookResponseBodyPrerequisites self = new VerifyPlaybookResponseBodyPrerequisites();
            return TeaModel.build(map, self);
        }

        public VerifyPlaybookResponseBodyPrerequisites setPrerequisiteType(String prerequisiteType) {
            this.prerequisiteType = prerequisiteType;
            return this;
        }
        public String getPrerequisiteType() {
            return this.prerequisiteType;
        }

        public VerifyPlaybookResponseBodyPrerequisites setPrerequisiteValue(String prerequisiteValue) {
            this.prerequisiteValue = prerequisiteValue;
            return this;
        }
        public String getPrerequisiteValue() {
            return this.prerequisiteValue;
        }

    }

}
