// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RunCommandRequest extends TeaModel {
    /**
     * <p>The content of the command. Take note of the following items:</p>
     * <br>
     * <p>*   If you set `EnableParameter` to true, the custom parameter feature is enabled in the command content and you can configure custom parameters based on the following rules:</p>
     * <p>*   Define custom parameters in the {{}} format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>*   The number of custom parameters cannot be greater than 20.</p>
     * <p>*   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive.</p>
     * <p>*   Each custom parameter name cannot exceed 64 bytes in length.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>Specifies whether to enable the custom parameter feature.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the command.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom parameters in the key-value pair format that are to be passed in when the command includes custom parameters. For example, if the command content is `echo {{name}}`, you can use `Parameters` to pass in the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced with the paired Jack value to generate a new command. As a result, the `echo Jack` command is executed.</p>
     * <br>
     * <p>Number of custom parameters ranges from 0 to 20. Take note of the following items:</p>
     * <br>
     * <p>*   The key cannot be an empty string. It can be up to 64 characters in length.</p>
     * <p>*   The value can be an empty string.</p>
     * <p>*   After custom parameters and original command content are encoded in Base64, the command cannot exceed 16 KB in size.</p>
     * <p>*   The custom parameter names that are specified by Parameters must be included in the custom parameter names that you specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates to disable the custom parameter feature.</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The timeout period of the command on the server.</p>
     * <br>
     * <p>If a command execution task times out, Command Assistant forcibly terminates the task process. Valid values: 10 to 86400. Unit: seconds. The period of 86400 seconds is equal to 24 hours.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The language type of the command. Valid values:</p>
     * <br>
     * <p>*   RunBatScript: batch commands (applicable to Windows servers).</p>
     * <p>*   RunPowerShellScript: PowerShell commands (applicable to Windows servers).</p>
     * <p>*   RunShellScript: shell commands (applicable to Linux servers).</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the password to be used to run the command on a Windows server.</p>
     * <br>
     * <p>If you want to use a username other than the default "system" username to run the command on a Windows server, you must specify both the WindowsPasswordName and WorkingUser parameters. To mitigate the risk of password leaks, the password is stored in plaintext in Operation Orchestration Service (OOS) Parameter Store, and only the name of the password is passed in by using WindowsPasswordName.</p>
     */
    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    /**
     * <p>The execution path of the command. You can specify a value for the parameter. Default execution paths vary based on the operating systems of the servers.</p>
     * <br>
     * <p>*   For Linux servers, the default execution path is the /home directory of the root user.</p>
     * <p>*   For Windows servers, the default execution path is C:\Windows\system32.</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    /**
     * <p>A user of the server who runs the command. We recommend that you run the command as a regular user to reduce security risks. Default values:</p>
     * <br>
     * <p>*   For Linux servers, the default value is root.</p>
     * <p>*   For Windows servers, the default value is system.</p>
     */
    @NameInMap("WorkingUser")
    public String workingUser;

    public static RunCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandRequest self = new RunCommandRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public RunCommandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunCommandRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public RunCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunCommandRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RunCommandRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RunCommandRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public RunCommandRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public RunCommandRequest setWorkingUser(String workingUser) {
        this.workingUser = workingUser;
        return this;
    }
    public String getWorkingUser() {
        return this.workingUser;
    }

}
