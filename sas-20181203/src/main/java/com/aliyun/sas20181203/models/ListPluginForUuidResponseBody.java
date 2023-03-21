// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPluginForUuidResponseBody extends TeaModel {
    @NameInMap("AegisUuidTargetPluginConfigList")
    public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigList> aegisUuidTargetPluginConfigList;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Config")
        public Boolean config;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("OverallConfig")
        public Boolean overallConfig;

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
        @NameInMap("AegisSuspiciousConfigList")
        public java.util.List<ListPluginForUuidResponseBodyAegisUuidTargetPluginConfigListAegisSuspiciousConfigList> aegisSuspiciousConfigList;

        @NameInMap("PluginInstallCode")
        public String pluginInstallCode;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("PluginOnlineInstalled")
        public Boolean pluginOnlineInstalled;

        @NameInMap("PluginOnlineStatus")
        public Boolean pluginOnlineStatus;

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
