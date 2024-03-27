// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientUserDefineRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the custom defense rule.</p>
     */
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
        /**
         * <p>The action of the custom defense rule. Valid values:</p>
         * <br>
         * <p>*   **0**: allow</p>
         * <p>*   **1**: block</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The command line.</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The file path.</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The time when the custom defense rule was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the custom defense rule was last modified.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the custom defense rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The hash values of processes.</p>
         */
        @NameInMap("Md5List")
        public String md5List;

        /**
         * <p>The name of the custom defense rule.</p>
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
         * <p>*   **linux**</p>
         * <p>*   **windows**</p>
         * <p>*   **all**</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The port number.</p>
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
         * <p>The type of the custom defense rule. Valid values:</p>
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

        public GetClientUserDefineRuleResponseBodyUserDefineRuleDetail setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
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
