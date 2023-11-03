// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectPluginStatusResponseBody extends TeaModel {
    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFileProtectPluginStatusResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListFileProtectPluginStatusResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The version of the Security Center agent.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The returned code after you install the Security Center agent. Valid values:</p>
         * <br>
         * <p>1.  0: The installation is successful.</p>
         * <p>2.  \-2: The kernel does not support the installation.</p>
         */
        @NameInMap("InstallCode")
        public String installCode;

        /**
         * <p>The returned message after you install the Security Center agent.</p>
         */
        @NameInMap("InstallMessage")
        public String installMessage;

        /**
         * <p>Indicates whether the Security Center agent is installed.</p>
         */
        @NameInMap("Installed")
        public Boolean installed;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address that is associated with the instance.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address that is associated with the instance.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Indicates whether the Security Center agent is online. Valid value:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>Indicates whether the core file monitoring file is supported.</p>
         */
        @NameInMap("SupportFile")
        public Boolean supportFile;

        /**
         * <p>The UUID of the asset.</p>
         */
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
        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
