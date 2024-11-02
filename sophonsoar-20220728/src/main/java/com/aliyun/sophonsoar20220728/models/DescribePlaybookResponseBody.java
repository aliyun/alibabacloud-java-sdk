// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookResponseBody extends TeaModel {
    /**
     * <p>The configuration of the playbook.</p>
     */
    @NameInMap("Playbook")
    public DescribePlaybookResponseBodyPlaybook playbook;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2989BC59-E9F0-5C83-B453-B368857649C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookResponseBody self = new DescribePlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookResponseBody setPlaybook(DescribePlaybookResponseBodyPlaybook playbook) {
        this.playbook = playbook;
        return this;
    }
    public DescribePlaybookResponseBodyPlaybook getPlaybook() {
        return this.playbook;
    }

    public DescribePlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookResponseBodyPlaybook extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>124xxxxx3435</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The description of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>demo playbook</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The number of times that the playbook failed to be run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailExeNum")
        public Integer failExeNum;

        /**
         * <p>The creation time of the playbook. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1665288858000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time of the playbook. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677482519000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The input parameter configuration of the playbook. The value is a JSON array.</p>
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
        @NameInMap("InputParams")
        public String inputParams;

        /**
         * <p>The time when the playbook was last run. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1665288858000</p>
         */
        @NameInMap("LastExeTime")
        public Long lastExeTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to modify the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>124xxxxx3435</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The status of the playbook. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnlineActive")
        public Boolean onlineActive;

        /**
         * <p>The MD5 hash value in the latest published version of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfsdfe232-e2b2-44fd-b2cc-xxxxx</p>
         */
        @NameInMap("OnlineReleaseTaskflowMd5")
        public String onlineReleaseTaskflowMd5;

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <ul>
         * <li><strong>preset</strong>: predefined playbook</li>
         * <li><strong>user</strong>: custom playbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("OwnType")
        public String ownType;

        /**
         * <p>The UUID of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>8db257d3-e2b2-44fd-b2cc-xxxxx</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The number of times that the playbook was successfully run.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SuccessExeNum")
        public Integer successExeNum;

        /**
         * <p>The XML configuration of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0" encoding="UTF-8"?><p>&lt;bpmn:definitions xmlns:xsi=&quot;<a href="http://www.w3.org/2001/XMLSchema-instance">http://www.w3.org/2001/XMLSchema-instance</a>&quot; xmlns:bpmn=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/MODEL">http://www.omg.org/spec/BPMN/20100524/MODEL</a>&quot; xmlns:bpmndi=&quot;<a href="http://www.omg.org/spec/BPMN/20100524/DI">http://www.omg.org/spec/BPMN/20100524/DI</a>&quot; xmlns:dc=&quot;<a href="http://www.omg.org/spec/DD/20100524/DC">http://www.omg.org/spec/DD/20100524/DC</a>&quot; targetNamespace=&quot;<a href="http://bpmn.io/schema/bpmn">http://bpmn.io/schema/bpmn</a>&quot; id=&quot;Definitions_1&quot;&gt;&lt;bpmn:process id=&quot;Process_1&quot; isExecutable=&quot;false&quot;&gt;&lt;bpmn:startEvent id=&quot;StartEvent_1&quot;/&gt;</bpmn:process>&lt;bpmndi:BPMNDiagram id=&quot;BPMNDiagram_1&quot;&gt;&lt;bpmndi:BPMNPlane id=&quot;BPMNPlane_1&quot; bpmnElement=&quot;Process_1&quot;&gt;&lt;bpmndi:BPMNShape id=&quot;_BPMNShape_StartEvent_2&quot; bpmnElement=&quot;StartEvent_1&quot;&gt;&lt;dc:Bounds height=&quot;36.0&quot; width=&quot;36.0&quot; x=&quot;173.0&quot; y=&quot;102.0&quot;/&gt;</bpmndi:BPMNShape></bpmndi:BPMNPlane></bpmndi:BPMNDiagram></bpmn:definitions></p>
         */
        @NameInMap("Taskflow")
        public String taskflow;

        /**
         * <p>The playbook configuration type.</p>
         * <ul>
         * <li><strong>xml</strong>: XML format.</li>
         * <li><strong>x6</strong>: JSON format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>xml</p>
         */
        @NameInMap("TaskflowType")
        public String taskflowType;

        public static DescribePlaybookResponseBodyPlaybook build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookResponseBodyPlaybook self = new DescribePlaybookResponseBodyPlaybook();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookResponseBodyPlaybook setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribePlaybookResponseBodyPlaybook setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePlaybookResponseBodyPlaybook setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePlaybookResponseBodyPlaybook setFailExeNum(Integer failExeNum) {
            this.failExeNum = failExeNum;
            return this;
        }
        public Integer getFailExeNum() {
            return this.failExeNum;
        }

        public DescribePlaybookResponseBodyPlaybook setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePlaybookResponseBodyPlaybook setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribePlaybookResponseBodyPlaybook setInputParams(String inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public String getInputParams() {
            return this.inputParams;
        }

        public DescribePlaybookResponseBodyPlaybook setLastExeTime(Long lastExeTime) {
            this.lastExeTime = lastExeTime;
            return this;
        }
        public Long getLastExeTime() {
            return this.lastExeTime;
        }

        public DescribePlaybookResponseBodyPlaybook setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribePlaybookResponseBodyPlaybook setOnlineActive(Boolean onlineActive) {
            this.onlineActive = onlineActive;
            return this;
        }
        public Boolean getOnlineActive() {
            return this.onlineActive;
        }

        public DescribePlaybookResponseBodyPlaybook setOnlineReleaseTaskflowMd5(String onlineReleaseTaskflowMd5) {
            this.onlineReleaseTaskflowMd5 = onlineReleaseTaskflowMd5;
            return this;
        }
        public String getOnlineReleaseTaskflowMd5() {
            return this.onlineReleaseTaskflowMd5;
        }

        public DescribePlaybookResponseBodyPlaybook setOwnType(String ownType) {
            this.ownType = ownType;
            return this;
        }
        public String getOwnType() {
            return this.ownType;
        }

        public DescribePlaybookResponseBodyPlaybook setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public DescribePlaybookResponseBodyPlaybook setSuccessExeNum(Integer successExeNum) {
            this.successExeNum = successExeNum;
            return this;
        }
        public Integer getSuccessExeNum() {
            return this.successExeNum;
        }

        public DescribePlaybookResponseBodyPlaybook setTaskflow(String taskflow) {
            this.taskflow = taskflow;
            return this;
        }
        public String getTaskflow() {
            return this.taskflow;
        }

        public DescribePlaybookResponseBodyPlaybook setTaskflowType(String taskflowType) {
            this.taskflowType = taskflowType;
            return this;
        }
        public String getTaskflowType() {
            return this.taskflowType;
        }

    }

}
