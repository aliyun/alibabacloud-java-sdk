// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunPython3ScriptRequest extends TeaModel {
    /**
     * <p>The name of the node in the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>python3_3</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The input parameters of the Python3 script.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
     *     &quot;input2&quot;: &quot;7d&quot;
     * }</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the UUIDs of playbooks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-xxxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The Python3 script.</p>
     * 
     * <strong>example:</strong>
     * <p>import logging
     * def execute (params):
     *   #ip = params[\&quot;ip\&quot;]
     *   #logging.info(&quot;enter execute,ip is &quot;+ip)
     *   success=True
     *   message=\&quot;OK\&quot;
     *   data=[]
     *   return (success,message,data)</p>
     */
    @NameInMap("PythonScript")
    public String pythonScript;

    /**
     * <strong>example:</strong>
     * <p>python2.0</p>
     */
    @NameInMap("PythonVersion")
    public String pythonVersion;

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

    public RunPython3ScriptRequest setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
        return this;
    }
    public String getPythonVersion() {
        return this.pythonVersion;
    }

}
