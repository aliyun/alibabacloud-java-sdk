// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPlaybookResponseBody extends TeaModel {
    /**
     * <p>The verification results.</p>
     */
    @NameInMap("CheckTaskInfos")
    public java.util.List<VerifyPlaybookResponseBodyCheckTaskInfos> checkTaskInfos;

    /**
     * <p>The prerequisite check information for the playbook.</p>
     */
    @NameInMap("Prerequisites")
    public java.util.List<VerifyPlaybookResponseBodyPrerequisites> prerequisites;

    /**
     * <p>The ID of the request. Alibaba Cloud generates this unique identifier for the request. Use this ID to troubleshoot and locate issues.</p>
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
         * <p>The specific error message that is returned if the verification fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Node [python3_3] doesn\&quot;t have the asset information</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The name of the playbook node.</p>
         * 
         * <strong>example:</strong>
         * <p>python3_3</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The severity level of the verification message. Valid values:</p>
         * <ul>
         * <li><p><strong>warn</strong>: A warning message. An issue may occur when the playbook runs.</p>
         * </li>
         * <li><p><strong>error</strong>: An error message. The playbook fails to be compiled.</p>
         * </li>
         * <li><p><strong>remind</strong>: A suggestion. This does not affect publishing or running the playbook. Optimize the playbook format.</p>
         * </li>
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
        /**
         * <p>The check type. Valid values:</p>
         * <ul>
         * <li><p><strong>role</strong>: The name of the custom RAM role.</p>
         * </li>
         * <li><p><strong>policies</strong>: The list of RAM system policies.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>role</p>
         */
        @NameInMap("PrerequisiteType")
        public String prerequisiteType;

        /**
         * <p>The check content. The value is determined as follows:</p>
         * <ul>
         * <li><p>If PrerequisiteType is <strong>role</strong>, the value is the static field AliyunSiemSoarExecutionDefaultRole.</p>
         * </li>
         * <li><p>If PrerequisiteType is <strong>policies</strong>, the value is a collection of policy names.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunSiemSoarExecutionDefaultRole</p>
         */
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
