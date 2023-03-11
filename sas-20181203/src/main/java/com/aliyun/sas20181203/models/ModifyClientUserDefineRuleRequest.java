// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientUserDefineRuleRequest extends TeaModel {
    /**
     * <p>The action of the rule. Valid values:</p>
     * <br>
     * <p>*   **0**: allow</p>
     * <p>*   **1**: block</p>
     */
    @NameInMap("ActionType")
    public Integer actionType;

    /**
     * <p>The command line.</p>
     */
    @NameInMap("Cmdline")
    public String cmdline;

    /**
     * <p>The file path.</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The IP address.</p>
     */
    @NameInMap("IP")
    public String IP;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>>  You can call the [ListClientUserDefineRules](~~ListClientUserDefineRules~~) operation to query the IDs of rules.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The hash values of processes.</p>
     */
    @NameInMap("Md5List")
    public String md5List;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The new file path after the file is renamed.</p>
     */
    @NameInMap("NewFilePath")
    public String newFilePath;

    /**
     * <p>The parent command line.</p>
     */
    @NameInMap("ParentCmdline")
    public String parentCmdline;

    /**
     * <p>The path to the parent process.</p>
     */
    @NameInMap("ParentProcPath")
    public String parentProcPath;

    /**
     * <p>The type of the operating system. Valid values:</p>
     * <br>
     * <p>*   **windows**: Windows</p>
     * <p>*   **linux**: Linux</p>
     * <p>*   **all**: all types</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The port number. This parameter is deprecated.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The port number. Valid values: 1 to 65535.</p>
     */
    @NameInMap("PortStr")
    public String portStr;

    /**
     * <p>The path to the process.</p>
     */
    @NameInMap("ProcPath")
    public String procPath;

    /**
     * <p>The registry value.</p>
     */
    @NameInMap("RegistryContent")
    public String registryContent;

    /**
     * <p>The registry key.</p>
     */
    @NameInMap("RegistryKey")
    public String registryKey;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <br>
     * <p>*   **1**: Process hash</p>
     * <p>*   **2**: Command line</p>
     * <p>*   **3**: Process Network</p>
     * <p>*   **4**: File Read and Write</p>
     * <p>*   **5**: Operation on Registry</p>
     * <p>*   **6**: Dynamic-link Library Loading</p>
     * <p>*   **7**: File Renaming</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static ModifyClientUserDefineRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDefineRuleRequest self = new ModifyClientUserDefineRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDefineRuleRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public ModifyClientUserDefineRuleRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
    }

    public ModifyClientUserDefineRuleRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ModifyClientUserDefineRuleRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public ModifyClientUserDefineRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyClientUserDefineRuleRequest setMd5List(String md5List) {
        this.md5List = md5List;
        return this;
    }
    public String getMd5List() {
        return this.md5List;
    }

    public ModifyClientUserDefineRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyClientUserDefineRuleRequest setNewFilePath(String newFilePath) {
        this.newFilePath = newFilePath;
        return this;
    }
    public String getNewFilePath() {
        return this.newFilePath;
    }

    public ModifyClientUserDefineRuleRequest setParentCmdline(String parentCmdline) {
        this.parentCmdline = parentCmdline;
        return this;
    }
    public String getParentCmdline() {
        return this.parentCmdline;
    }

    public ModifyClientUserDefineRuleRequest setParentProcPath(String parentProcPath) {
        this.parentProcPath = parentProcPath;
        return this;
    }
    public String getParentProcPath() {
        return this.parentProcPath;
    }

    public ModifyClientUserDefineRuleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ModifyClientUserDefineRuleRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyClientUserDefineRuleRequest setPortStr(String portStr) {
        this.portStr = portStr;
        return this;
    }
    public String getPortStr() {
        return this.portStr;
    }

    public ModifyClientUserDefineRuleRequest setProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }
    public String getProcPath() {
        return this.procPath;
    }

    public ModifyClientUserDefineRuleRequest setRegistryContent(String registryContent) {
        this.registryContent = registryContent;
        return this;
    }
    public String getRegistryContent() {
        return this.registryContent;
    }

    public ModifyClientUserDefineRuleRequest setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
        return this;
    }
    public String getRegistryKey() {
        return this.registryKey;
    }

    public ModifyClientUserDefineRuleRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
