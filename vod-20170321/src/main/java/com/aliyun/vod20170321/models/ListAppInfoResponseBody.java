// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoResponseBody extends TeaModel {
    /**
     * <p>The details of each application.</p>
     */
    @NameInMap("AppInfoList")
    public java.util.List<ListAppInfoResponseBodyAppInfoList> appInfoList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the application was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The last time when the application was modified. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The status of the application. Valid values:</p>
         * <br>
         * <p>*   **Normal**</p>
         * <p>*   **Disable**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   **System**</p>
         * <p>*   **Custom**</p>
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
