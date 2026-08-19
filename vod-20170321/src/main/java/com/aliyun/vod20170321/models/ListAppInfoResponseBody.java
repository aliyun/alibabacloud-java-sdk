// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoResponseBody extends TeaModel {
    /**
     * <p>The list of application information.</p>
     */
    @NameInMap("AppInfoList")
    public java.util.List<ListAppInfoResponseBodyAppInfoList> appInfoList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-4D5C-D7393642****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoResponseBody self = new ListAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInfoResponseBody setAppInfoList(java.util.List<ListAppInfoResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<ListAppInfoResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public ListAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInfoResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAppInfoResponseBodyAppInfoList extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the application was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-01T08:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>my first app.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the application was last modified. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-01T09:00:00Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzko7fsuj****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The application status. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Disable</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li><strong>System</strong>: system default.</li>
         * <li><strong>Custom</strong>: user-created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListAppInfoResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfoResponseBodyAppInfoList self = new ListAppInfoResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public ListAppInfoResponseBodyAppInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppInfoResponseBodyAppInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppInfoResponseBodyAppInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAppInfoResponseBodyAppInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppInfoResponseBodyAppInfoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public ListAppInfoResponseBodyAppInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAppInfoResponseBodyAppInfoList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListAppInfoResponseBodyAppInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppInfoResponseBodyAppInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
