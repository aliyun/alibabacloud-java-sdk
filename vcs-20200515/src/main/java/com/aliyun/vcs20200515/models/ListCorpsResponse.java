// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListCorpsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListCorpsResponseData data;

    public static ListCorpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCorpsResponse self = new ListCorpsResponse();
        return TeaModel.build(map, self);
    }

    public ListCorpsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCorpsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCorpsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCorpsResponse setData(ListCorpsResponseData data) {
        this.data = data;
        return this;
    }
    public ListCorpsResponseData getData() {
        return this.data;
    }

    public static class ListCorpsResponseDataRecords extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("CorpName")
        @Validation(required = true)
        public String corpName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("ParentCorpId")
        @Validation(required = true)
        public String parentCorpId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("DeviceCount")
        @Validation(required = true)
        public Integer deviceCount;

        @NameInMap("IsvSubId")
        @Validation(required = true)
        public String isvSubId;

        @NameInMap("AcuUsed")
        @Validation(required = true)
        public Integer acuUsed;

        @NameInMap("IconPath")
        @Validation(required = true)
        public String iconPath;

        public static ListCorpsResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseDataRecords self = new ListCorpsResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCorpsResponseDataRecords setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ListCorpsResponseDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCorpsResponseDataRecords setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListCorpsResponseDataRecords setParentCorpId(String parentCorpId) {
            this.parentCorpId = parentCorpId;
            return this;
        }
        public String getParentCorpId() {
            return this.parentCorpId;
        }

        public ListCorpsResponseDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListCorpsResponseDataRecords setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public ListCorpsResponseDataRecords setIsvSubId(String isvSubId) {
            this.isvSubId = isvSubId;
            return this;
        }
        public String getIsvSubId() {
            return this.isvSubId;
        }

        public ListCorpsResponseDataRecords setAcuUsed(Integer acuUsed) {
            this.acuUsed = acuUsed;
            return this;
        }
        public Integer getAcuUsed() {
            return this.acuUsed;
        }

        public ListCorpsResponseDataRecords setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

    }

    public static class ListCorpsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<ListCorpsResponseDataRecords> records;

        public static ListCorpsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCorpsResponseData self = new ListCorpsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCorpsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCorpsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCorpsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListCorpsResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListCorpsResponseData setRecords(java.util.List<ListCorpsResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListCorpsResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
