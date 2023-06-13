// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    /**
     * <p>The content of the command. Take note of the following items:</p>
     * <br>
     * <p>*   When `EnableParameter` is set to true, the custom parameter feature is enabled and you can configure custom parameters based on the following rules:</p>
     * <p>*   Define custom parameters in the {{}} format. Within `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>*   The number of custom parameters cannot be greater than 20.</p>
     * <p>*   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is case-insensitive.</p>
     * <p>*   Each custom parameter name cannot exceed 64 bytes in length.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>Specifies whether to include custom parameters in the command.</p>
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
     * <p>The custom parameters in the key-value pair format that are to be passed in when the command includes custom parameters. For example, if the command content is `echo {{name}}`, you can set the `Parameters` parameter to the `{"name":"Jack"}` key-value pair. The `name` key of the custom parameter is automatically replaced with the paired Jack value to generate a new command. As a result, the `echo Jack` command is actually run.</p>
     * <br>
     * <p>Number of custom parameters ranges from 0 to 20. Take note of the following items:</p>
     * <br>
     * <p>*   The key cannot be an empty string and can be up to 64 characters in length.</p>
     * <p>*   The value can be an empty string.</p>
     * <p>*   After custom parameters and original command content are encoded in Base64, the command cannot exceed 16 KB in size.</p>
     * <p>*   The value of Parameters must be included in the custom parameters specified when you created the command. You can use empty strings to represent the parameters that are not passed in.</p>
     * <br>
     * <p>This parameter is empty by default. You can leave this parameter empty to disable the custom parameter feature.</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies the timeout period of the command on the server.</p>
     * <br>
     * <p>If a task that runs the command times out, Command Assistant forcefully terminates the task process. Valid values: 10 to 86400. Unit: seconds. The period of 86400 seconds is equal to 24 hours.</p>
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
     * <p>If you want to use a username other than the default "system" username to run the command on a Windows server, you must specify both the WindowsPasswordName and WorkingUser parameters. The password is hosted in plaintext in the parameter repository of Operation Orchestration Service (OOS) to reduce the risk of password leaks. Only the name of the password is passed in by using the WindowsPasswordName parameter.</p>
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
     * <p>A user of the server who runs the command. We recommend that you run the command as a regular user to reduce security risks.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   For Linux servers, the default value is root.</p>
     * <p>*   For Windows servers, the default value is system.</p>
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
