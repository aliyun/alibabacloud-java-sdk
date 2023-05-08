// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddClientUserDefineRuleRequest extends TeaModel {
    @NameInMap("ActionType")
    public Integer actionType;

    @NameInMap("Cmdline")
    public String cmdline;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("IP")
    public String IP;

    @NameInMap("Md5List")
    public String md5List;

    @NameInMap("Name")
    public String name;

    @NameInMap("NewFilePath")
    public String newFilePath;

    @NameInMap("ParentCmdline")
    public String parentCmdline;

    @NameInMap("ParentProcPath")
    public String parentProcPath;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("PortStr")
    public String portStr;

    @NameInMap("ProcPath")
    public String procPath;

    @NameInMap("RegistryContent")
    public String registryContent;

    @NameInMap("RegistryKey")
    public String registryKey;

    @NameInMap("Type")
    public Integer type;

    public static AddClientUserDefineRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClientUserDefineRuleRequest self = new AddClientUserDefineRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddClientUserDefineRuleRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public AddClientUserDefineRuleRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
    }

    public AddClientUserDefineRuleRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public AddClientUserDefineRuleRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public AddClientUserDefineRuleRequest setMd5List(String md5List) {
        this.md5List = md5List;
        return this;
    }
    public String getMd5List() {
        return this.md5List;
    }

    public AddClientUserDefineRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddClientUserDefineRuleRequest setNewFilePath(String newFilePath) {
        this.newFilePath = newFilePath;
        return this;
    }
    public String getNewFilePath() {
        return this.newFilePath;
    }

    public AddClientUserDefineRuleRequest setParentCmdline(String parentCmdline) {
        this.parentCmdline = parentCmdline;
        return this;
    }
    public String getParentCmdline() {
        return this.parentCmdline;
    }

    public AddClientUserDefineRuleRequest setParentProcPath(String parentProcPath) {
        this.parentProcPath = parentProcPath;
        return this;
    }
    public String getParentProcPath() {
        return this.parentProcPath;
    }

    public AddClientUserDefineRuleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public AddClientUserDefineRuleRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public AddClientUserDefineRuleRequest setPortStr(String portStr) {
        this.portStr = portStr;
        return this;
    }
    public String getPortStr() {
        return this.portStr;
    }

    public AddClientUserDefineRuleRequest setProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }
    public String getProcPath() {
        return this.procPath;
    }

    public AddClientUserDefineRuleRequest setRegistryContent(String registryContent) {
        this.registryContent = registryContent;
        return this;
    }
    public String getRegistryContent() {
        return this.registryContent;
    }

    public AddClientUserDefineRuleRequest setRegistryKey(String registryKey) {
        this.registryKey = registryKey;
        return this;
    }
    public String getRegistryKey() {
        return this.registryKey;
    }

    public AddClientUserDefineRuleRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
