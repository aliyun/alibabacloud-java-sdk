// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListCorpsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListCorpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsResponseBody self = new ListCorpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpsResponseBody setData(ListCorpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCorpsResponseBodyData getData() {
        return this.data;
    }

    public ListCorpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListCorpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("ParentCorpId")
        public String parentCorpId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("Description")
        public String description;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("AcuUsed")
        public Integer acuUsed;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("IconPath")
        public String iconPath;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        public static ListCorpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseBodyDataRecords self = new ListCorpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseBodyDataRecords setParentCorpId(String parentCorpId) {
            this.parentCorpId = parentCorpId;
            return this;
        }
        public String getParentCorpId() {
            return this.parentCorpId;
        }

        public ListCorpsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCorpsResponseBodyDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListCorpsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCorpsResponseBodyDataRecords setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListCorpsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpsResponseBodyDataRecords setAcuUsed(Integer acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Integer getAcuUsed() {
            return this.acuUsed;
        }

        public ListCorpsResponseBodyDataRecords setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListCorpsResponseBodyDataRecords setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

        public ListCorpsResponseBodyDataRecords setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

    }

    public static class ListCorpsResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<ListCorpsResponseBodyDataRecords> records;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCorpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseBodyData self = new ListCorpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseBodyData setRecords(java.util.List<ListCorpsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListCorpsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListCorpsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListCorpsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCorpsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCorpsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
