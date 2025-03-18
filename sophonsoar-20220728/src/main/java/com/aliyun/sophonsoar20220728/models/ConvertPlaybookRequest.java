// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ConvertPlaybookRequest extends TeaModel {
    /**
     * <p>Language type for request and response messages. Values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User ID for the administrator to switch to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>View type. Values:</p>
     * <ul>
     * <li>0: Current Alibaba Cloud account view.</li>
     * <li>1: View for all accounts under the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    /**
     * <p>XML configuration information for playbook orchestration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <?xml version=\\"1.0\\" encoding=\\"UTF-8\\"?>
     * <p>&lt;bpmn:definitions xmlns:xsi=\&quot;<a href="http://www.w3.org/2001/XMLSchema-instance%5C%5C">http://www.w3.org/2001/XMLSchema-instance\\</a>&quot; xmlns:bpmn=\&quot;<a href="http://www.omg.org/spec/BPMN/20100524/MODEL%5C%5C">http://www.omg.org/spec/BPMN/20100524/MODEL\\</a>&quot; xmlns:bpmndi=\&quot;<a href="http://www.omg.org/spec/BPMN/20100524/DI%5C%5C">http://www.omg.org/spec/BPMN/20100524/DI\\</a>&quot; xmlns:dc=\&quot;<a href="http://www.omg.org/spec/DD/20100524/DC%5C%5C">http://www.omg.org/spec/DD/20100524/DC\\</a>&quot; id=\&quot;Definitions_1\&quot; targetNamespace=\&quot;<a href="http://bpmn.io/schema/bpmn%5C%5C%22%3E">http://bpmn.io/schema/bpmn\\&quot;&gt;</a>
     *   &lt;bpmn:process id=\&quot;Process_1\&quot; isExecutable=\&quot;false\&quot;&gt;
     *     &lt;bpmn:startEvent id=\&quot;StartEvent_1\&quot; /&gt;
     *   </bpmn:process>
     *   &lt;bpmndi:BPMNDiagram id=\&quot;BPMNDiagram_1\&quot;&gt;
     *      &lt;bpmndi:BPMNPlane id=\&quot;BPMNPlane_1\&quot; bpmnElement=\&quot;Process_1\&quot;&gt;
     *            &lt;bpmndi:BPMNShape id=\&quot;_BPMNShape_StartEvent_2\&quot; bpmnElement=\&quot;StartEvent_1\&quot;&gt;
     *                    &lt;dc:Bounds x=\&quot;173\&quot; y=\&quot;102\&quot; width=\&quot;36\&quot; height=\&quot;36\&quot; /&gt;
     *             </bpmndi:BPMNShape>
     *      </bpmndi:BPMNPlane>
     *   </bpmndi:BPMNDiagram>
     * </bpmn:definitions></p>
     */
    @NameInMap("Taskflow")
    public String taskflow;

    public static ConvertPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertPlaybookRequest self = new ConvertPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public ConvertPlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ConvertPlaybookRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ConvertPlaybookRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public ConvertPlaybookRequest setTaskflow(String taskflow) {
        this.taskflow = taskflow;
        return this;
    }
    public String getTaskflow() {
        return this.taskflow;
    }

}
