// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidResponseBody extends TeaModel {
    /**
     * <p>The type of the plug-in. Valid values:</p>
     * <br>
     * <p>*   **auto_breaking**: antivirus</p>
     * <p>*   **ransomware_breaking**: anti-ransomware (bait capture)</p>
     * <p>*   **webshell_cloud_breaking**: webshell prevention</p>
     * <p>*   **alisecguard**: client protection</p>
     * <p>*   **alinet**: malicious behavior defense</p>
     */
    @NameInMap("AegisUuidTargetPluginConfigList")
    public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPluginForUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginForUuidResponseBody self = new ListPluginForUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginForUuidResponseBody setAegisUuidTargetPluginConfigList(java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList) {
        this.aegisUuidTargetPluginConfigList = aegisUuidTargetPluginConfigList;
        return this;
    }
    public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList> getAegisUuidTargetPluginConfigList() {
        return this.aegisUuidTargetPluginConfigList;
    }

    public ListPluginForUuidResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPluginForUuidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginForUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList extends TeaModel {
        /**
         * <p>The name of the plug-in. Valid values:</p>
         * <br>
         * <p>*   **alihips**: trojan-specific prevention</p>
         * <p>*   **alisecguard**: attack-specific prevention</p>
         * <p>*   **alinet**: defense against attacks on servers</p>
         */
        @NameInMap("Config")
        public Boolean config;

        /**
         * <p>Queries the information about plug-ins on a server.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>ListPluginForUuid</p>
         */
        @NameInMap("OverallConfig")
        public Boolean overallConfig;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList self = new ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList();
            return TeaModel.build(map, self);
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList setConfig(Boolean config) {
            this.config = config;
            return this;
        }
        public Boolean getConfig() {
            return this.config;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList setOverallConfig(Boolean overallConfig) {
            this.overallConfig = overallConfig;
            return this;
        }
        public Boolean getOverallConfig() {
            return this.overallConfig;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList extends TeaModel {
        /**
         * <p>The information about the plug-in.</p>
         */
        @NameInMap("AegisSuspiciousConfigList")
        public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList> aegisSuspiciousConfigList;

        /**
         * <p>The installation code of the plug-in.</p>
         */
        @NameInMap("PluginInstallCode")
        public String pluginInstallCode;

        /**
         * <p>The UUID of the server.</p>
         * <br>
         * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The version of the plug-in.</p>
         */
        @NameInMap("PluginOnlineInstalled")
        public Boolean pluginOnlineInstalled;

        /**
         * <p>An array that consists of the configurations of plug-ins.</p>
         */
        @NameInMap("PluginOnlineStatus")
        public Boolean pluginOnlineStatus;

        /**
         * <p>Indicates whether the plug-in is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("PluginVersion")
        public String pluginVersion;

        public static ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList self = new ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList();
            return TeaModel.build(map, self);
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList setAegisSuspiciousConfigList(java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList> aegisSuspiciousConfigList) {
            this.aegisSuspiciousConfigList = aegisSuspiciousConfigList;
            return this;
        }
        public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList> getAegisSuspiciousConfigList() {
            return this.aegisSuspiciousConfigList;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList setPluginInstallCode(String pluginInstallCode) {
            this.pluginInstallCode = pluginInstallCode;
            return this;
        }
        public String getPluginInstallCode() {
            return this.pluginInstallCode;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList setPluginOnlineInstalled(Boolean pluginOnlineInstalled) {
            this.pluginOnlineInstalled = pluginOnlineInstalled;
            return this;
        }
        public Boolean getPluginOnlineInstalled() {
            return this.pluginOnlineInstalled;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList setPluginOnlineStatus(Boolean pluginOnlineStatus) {
            this.pluginOnlineStatus = pluginOnlineStatus;
            return this;
        }
        public Boolean getPluginOnlineStatus() {
            return this.pluginOnlineStatus;
        }

        public ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

    }

}
