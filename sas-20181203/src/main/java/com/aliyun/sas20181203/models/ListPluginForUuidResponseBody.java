// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the plug-ins.</p>
     */
    @NameInMap("AegisUuidTargetPluginConfigList")
    public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList;

    /**
     * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
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
         * <p>Indicates whether the plug-in is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Config")
        public Boolean config;

        /**
         * <p>The message that indicates whether you are authorized to install the plug-in on your server or whether the plug-in is installed on your server. Valid values:</p>
         * <ul>
         * <li><strong>authorized</strong>: authorized</li>
         * <li><strong>unauthorized</strong>: unauthorized</li>
         * <li><strong>unbind</strong>: not installed</li>
         * <li><strong>nonsupport</strong>: not supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authorized</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Indicates whether the plug-in is globally configured. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OverallConfig")
        public Boolean overallConfig;

        /**
         * <p>The name of the plug-in. Valid values:</p>
         * <ul>
         * <li><strong>alihips</strong>: trojan-specific prevention</li>
         * <li><strong>alisecguard</strong>: attack-specific prevention</li>
         * <li><strong>alinet</strong>: defense against attacks on servers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alisecguard</p>
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
         * <p>An array that consists of the configurations of plug-ins.</p>
         */
        @NameInMap("AegisSuspiciousConfigList")
        public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList> aegisSuspiciousConfigList;

        /**
         * <p>The installation code of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>k5O5nd</p>
         */
        @NameInMap("PluginInstallCode")
        public String pluginInstallCode;

        /**
         * <p>The name of the plug-in. Valid values:</p>
         * <ul>
         * <li><strong>alihips</strong>: trojan-specific prevention</li>
         * <li><strong>alisecguard</strong>: attack-specific prevention</li>
         * <li><strong>alinet</strong>: defense against attacks on servers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alisecguard</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>Indicates whether the plug-in is installed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PluginOnlineInstalled")
        public Boolean pluginOnlineInstalled;

        /**
         * <p>Indicates whether the plug-in is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PluginOnlineStatus")
        public Boolean pluginOnlineStatus;

        /**
         * <p>The version of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>00_10</p>
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
