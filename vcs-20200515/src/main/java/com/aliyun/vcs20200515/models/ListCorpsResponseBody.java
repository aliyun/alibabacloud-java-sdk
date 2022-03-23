// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCorpsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCorpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsResponseBody self = new ListCorpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCorpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpsResponseBody setData(ListCorpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCorpsResponseBodyData getData() {
        return this.data;
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

    public static class ListCorpsResponseBodyDataRecords extends TeaModel {
        @NameInMap("AcuUsed")
        public Integer acuUsed;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("CorpName")
        public String corpName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("IconPath")
        public String iconPath;

        @NameInMap("IsvSubId")
        public String isvSubId;

        @NameInMap("ParentCorpId")
        public String parentCorpId;

        @NameInMap("YOfflineAcuUsed")
        public Integer YOfflineAcuUsed;

        public static ListCorpsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseBodyDataRecords self = new ListCorpsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseBodyDataRecords setAcuUsed(Integer acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Integer getAcuUsed() {
            return this.acuUsed;
        }

        public ListCorpsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCorpsResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpsResponseBodyDataRecords setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListCorpsResponseBodyDataRecords setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListCorpsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCorpsResponseBodyDataRecords setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public ListCorpsResponseBodyDataRecords setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

        public ListCorpsResponseBodyDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListCorpsResponseBodyDataRecords setParentCorpId(String parentCorpId) {
            this.parentCorpId = parentCorpId;
            return this;
        }
        public String getParentCorpId() {
            return this.parentCorpId;
        }

        public ListCorpsResponseBodyDataRecords setYOfflineAcuUsed(Integer YOfflineAcuUsed) {
            this.YOfflineAcuUsed = YOfflineAcuUsed;
            return this;
        }
        public Integer getYOfflineAcuUsed() {
            return this.YOfflineAcuUsed;
        }

    }

    public static class ListCorpsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<ListCorpsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListCorpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseBodyData self = new ListCorpsResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListCorpsResponseBodyData setRecords(java.util.List<ListCorpsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListCorpsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListCorpsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListCorpsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
