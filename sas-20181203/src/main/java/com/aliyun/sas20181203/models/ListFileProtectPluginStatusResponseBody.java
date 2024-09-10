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
     * 
     * <strong>example:</strong>
     * <p>60F289EC-BAA3-5DF1-8476-B3F05A14EBC2</p>
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
         * 
         * <strong>example:</strong>
         * <p>00_41</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The returned code after you install the Security Center agent. Valid values:</p>
         * <ol>
         * <li>0: The installation is successful.</li>
         * <li>\-2: The kernel does not support the installation.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>-2</p>
         */
        @NameInMap("InstallCode")
        public String installCode;

        /**
         * <p>The returned message after you install the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>driver file not exist</p>
         */
        @NameInMap("InstallMessage")
        public String installMessage;

        /**
         * <p>Indicates whether the Security Center agent is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Installed")
        public Boolean installed;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92q7m5hsbgfhdss***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address that is associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address that is associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Indicates whether the Security Center agent is online. Valid value:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>Indicates whether the core file monitoring file is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportFile")
        public Boolean supportFile;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
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

        public ListFileProtectPluginStatusResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
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
