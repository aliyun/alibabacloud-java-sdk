// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    /**
     * <p>The content of the command. Take note of the following items:</p>
     * <ul>
     * <li>If you set <code>EnableParameter</code> to true, the custom parameter feature is enabled in the command content and you can configure custom parameters based on the following rules:</li>
     * <li>Define custom parameters in the {{}} format. Within <code>{{}}</code>, the spaces and line feeds before and after the parameter names are ignored.</li>
     * <li>The number of custom parameters cannot be greater than 20.</li>
     * <li>A custom parameter name can contain only letters, digits, underscores (_), and hyphens (-). The name is case-insensitive.</li>
     * <li>Each custom parameter name cannot exceed 64 bytes in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ifconfig -s</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>Specifies whether to enable the custom parameter feature.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the command.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom parameters in the key-value pair format that are to be passed in when the command includes custom parameters. For example, if the command content is <code>echo {{name}}</code>, you can use <code>Parameters</code> to pass in the <code>{&quot;name&quot;:&quot;Jack&quot;}</code> key-value pair. The <code>name</code> key of the custom parameter is automatically replaced with the paired Jack value to generate a new command. As a result, the <code>echo Jack</code> command is executed.</p>
     * <p>Number of custom parameters ranges from 0 to 20. Take note of the following items:</p>
     * <ul>
     * <li>The key cannot be an empty string. It can be up to 64 characters in length.</li>
     * <li>The value can be an empty string.</li>
     * <li>After custom parameters and original command content are encoded in Base64, the command cannot exceed 16 KB in size.</li>
     * <li>The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates to disable the custom parameter feature.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;Jack&quot;, &quot;accessKey&quot;:&quot;LTAIdyvdIqaRY****&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period of the command on the server.</p>
     * <p>If a command execution task times out, Command Assistant forcibly terminates the task process. Valid values: 10 to 86400. Unit: seconds. The period of 86400 seconds is equal to 24 hours.</p>
     * <p>Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The language type of the command. Valid values:</p>
     * <ul>
     * <li>RunBatScript: batch commands (applicable to Windows servers).</li>
     * <li>RunPowerShellScript: PowerShell commands (applicable to Windows servers).</li>
     * <li>RunShellScript: shell commands (applicable to Linux servers).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the password used to run the command on a Windows simple application server.</p>
     * <p>If you want to use a username other than the default &quot;system&quot; username to run the command on a Windows server, you must specify both the WindowsPasswordName and WorkingUser parameters. The password is hosted in plaintext in the parameter repository of CloudOps Orchestration Service (OOS) to mitigate the risk of password leaks. Only the name of the password is passed in by using WindowsPasswordName.</p>
     * 
     * <strong>example:</strong>
     * <p>axtSecretPassword</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The execution path of the command. Custom paths are supported. Default execution paths vary based on the operating systems of the servers.</p>
     * <ul>
     * <li>For Linux servers, the default path is /root of the root user.</li>
     * <li>For Windows servers, the default path is C:\Windows\system32.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/home/</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    /**
     * <p>A user of the server who runs the command. We recommend that you run the command as a regular user to reduce security risks. Default values:</p>
     * <ul>
     * <li>For Linux servers, the default value is root.</li>
     * <li>For Windows servers, the default value is system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("WorkingUser")
    public String workingUser;

    public static RunCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandShrinkRequest self = new RunCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandShrinkRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandShrinkRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public RunCommandShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunCommandShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public RunCommandShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunCommandShrinkRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RunCommandShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RunCommandShrinkRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public RunCommandShrinkRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public RunCommandShrinkRequest setWorkingUser(String workingUser) {
        this.workingUser = workingUser;
        return this;
    }
    public String getWorkingUser() {
        return this.workingUser;
    }

}
