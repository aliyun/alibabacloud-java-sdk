// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientUserDefineRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserDefineRuleDetail")
    public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail userDefineRuleDetail;

    public static GetClientUserDefineRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientUserDefineRuleResponseBody self = new GetClientUserDefineRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientUserDefineRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClientUserDefineRuleResponseBody setUserDefineRuleDetail(GetClientUserDefineRuleResponseBodyUserDefineRuleDetail userDefineRuleDetail) {
        this.userDefineRuleDetail = userDefineRuleDetail;
        return this;
    }
    public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail getUserDefineRuleDetail() {
        return this.userDefineRuleDetail;
    }

    public static class GetClientUserDefineRuleResponseBodyUserDefineRuleDetail extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("Cmdline")
        public String cmdline;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Id")
        public Long id;

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

        public static GetClientUserDefineRuleResponseBodyUserDefineRuleDetail build(java.util.Map<String, ?> map) throws Exception {
            GetClientUserDefineRuleResponseBodyUserDefineRuleDetail self = new GetClientUserDefineRuleResponseBodyUserDefineRuleDetail();
            return TeaModel.build(map, self);
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setMd5List(String md5List) {
            this.md5List = md5List;
            return this;
        }
        public String getMd5List() {
            return this.md5List;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setNewFilePath(String newFilePath) {
            this.newFilePath = newFilePath;
            return this;
        }
        public String getNewFilePath() {
            return this.newFilePath;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setParentCmdline(String parentCmdline) {
            this.parentCmdline = parentCmdline;
            return this;
        }
        public String getParentCmdline() {
            return this.parentCmdline;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setParentProcPath(String parentProcPath) {
            this.parentProcPath = parentProcPath;
            return this;
        }
        public String getParentProcPath() {
            return this.parentProcPath;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setPortStr(String portStr) {
            this.portStr = portStr;
            return this;
        }
        public String getPortStr() {
            return this.portStr;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setProcPath(String procPath) {
            this.procPath = procPath;
            return this;
        }
        public String getProcPath() {
            return this.procPath;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setRegistryContent(String registryContent) {
            this.registryContent = registryContent;
            return this;
        }
        public String getRegistryContent() {
            return this.registryContent;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setRegistryKey(String registryKey) {
            this.registryKey = registryKey;
            return this;
        }
        public String getRegistryKey() {
            return this.registryKey;
        }

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
