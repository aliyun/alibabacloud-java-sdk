// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoResponseBody extends TeaModel {
    @NameInMap("Total")
    public Integer total;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppInfoList")
    public java.util.List<ListAppInfoResponseBodyAppInfoList> appInfoList;

    public static ListAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoResponseBody self = new ListAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInfoResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInfoResponseBody setAppInfoList(java.util.List<ListAppInfoResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<ListAppInfoResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public static class ListAppInfoResponseBodyAppInfoList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ModificationTime")
        public String modificationTime;

        public static ListAppInfoResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListAppInfoResponseBodyAppInfoList self = new ListAppInfoResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public ListAppInfoResponseBodyAppInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppInfoResponseBodyAppInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppInfoResponseBodyAppInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAppInfoResponseBodyAppInfoList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppInfoResponseBodyAppInfoList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppInfoResponseBodyAppInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppInfoResponseBodyAppInfoList setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

    }

}
