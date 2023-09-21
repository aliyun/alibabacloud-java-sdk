// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectPluginStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListFileProtectPluginStatusResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListFileProtectPluginStatusResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectPluginStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectPluginStatusResponseBody self = new ListFileProtectPluginStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectPluginStatusResponseBody setData(java.util.List<ListFileProtectPluginStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFileProtectPluginStatusResponseBodyData> getData() {
        return this.data;
    }

    public ListFileProtectPluginStatusResponseBody setPageInfo(ListFileProtectPluginStatusResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListFileProtectPluginStatusResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListFileProtectPluginStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileProtectPluginStatusResponseBodyData extends TeaModel {
        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("InstallCode")
        public String installCode;

        @NameInMap("InstallMessage")
        public String installMessage;

        @NameInMap("Installed")
        public Boolean installed;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("SupportFile")
        public Boolean supportFile;

        @NameInMap("Uuid")
        public String uuid;

        public static ListFileProtectPluginStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectPluginStatusResponseBodyData self = new ListFileProtectPluginStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFileProtectPluginStatusResponseBodyData setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public ListFileProtectPluginStatusResponseBodyData setInstallCode(String installCode) {
            this.installCode = installCode;
            return this;
        }
        public String getInstallCode() {
            return this.installCode;
        }

        public ListFileProtectPluginStatusResponseBodyData setInstallMessage(String installMessage) {
            this.installMessage = installMessage;
            return this;
        }
        public String getInstallMessage() {
            return this.installMessage;
        }

        public ListFileProtectPluginStatusResponseBodyData setInstalled(Boolean installed) {
            this.installed = installed;
            return this;
        }
        public Boolean getInstalled() {
            return this.installed;
        }

        public ListFileProtectPluginStatusResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListFileProtectPluginStatusResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListFileProtectPluginStatusResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListFileProtectPluginStatusResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListFileProtectPluginStatusResponseBodyData setSupportFile(Boolean supportFile) {
            this.supportFile = supportFile;
            return this;
        }
        public Boolean getSupportFile() {
            return this.supportFile;
        }

        public ListFileProtectPluginStatusResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListFileProtectPluginStatusResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileProtectPluginStatusResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectPluginStatusResponseBodyPageInfo self = new ListFileProtectPluginStatusResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListFileProtectPluginStatusResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListFileProtectPluginStatusResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileProtectPluginStatusResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
