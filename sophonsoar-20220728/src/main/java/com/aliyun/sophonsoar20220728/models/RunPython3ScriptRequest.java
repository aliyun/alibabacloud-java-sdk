// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunPython3ScriptRequest extends TeaModel {
    /**
     * <p>The name of the node in the playbook.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The input parameters of the Python3 script.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the UUIDs of playbooks.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The Python3 script.</p>
     */
    @NameInMap("PythonScript")
    public String pythonScript;

    public static RunPython3ScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        RunPython3ScriptRequest self = new RunPython3ScriptRequest();
        return TeaModel.build(map, self);
    }

    public RunPython3ScriptRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public RunPython3ScriptRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public RunPython3ScriptRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public RunPython3ScriptRequest setPythonScript(String pythonScript) {
        this.pythonScript = pythonScript;
        return this;
    }
    public String getPythonScript() {
        return this.pythonScript;
    }

}
