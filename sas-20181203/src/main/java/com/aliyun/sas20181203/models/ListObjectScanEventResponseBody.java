// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListObjectScanEventResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListObjectScanEventResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListObjectScanEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListObjectScanEventResponseBody self = new ListObjectScanEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListObjectScanEventResponseBody setData(java.util.List<ListObjectScanEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListObjectScanEventResponseBodyData> getData() {
        return this.data;
    }

    public ListObjectScanEventResponseBody setPageInfo(ListObjectScanEventResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListObjectScanEventResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListObjectScanEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListObjectScanEventResponseBodyDataDetails extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static ListObjectScanEventResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            ListObjectScanEventResponseBodyDataDetails self = new ListObjectScanEventResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public ListObjectScanEventResponseBodyDataDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListObjectScanEventResponseBodyDataDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public ListObjectScanEventResponseBodyDataDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListObjectScanEventResponseBodyDataDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListObjectScanEventResponseBodyDataDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class ListObjectScanEventResponseBodyData extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Details")
        public java.util.List<ListObjectScanEventResponseBodyDataDetails> details;

        @NameInMap("DisplaySandboxResult")
        public String displaySandboxResult;

        @NameInMap("EventId")
        public Long eventId;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Sha1")
        public String sha1;

        @NameInMap("Sha256")
        public String sha256;

        @NameInMap("Source")
        public String source;

        public static ListObjectScanEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListObjectScanEventResponseBodyData self = new ListObjectScanEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListObjectScanEventResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListObjectScanEventResponseBodyData setDetails(java.util.List<ListObjectScanEventResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListObjectScanEventResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public ListObjectScanEventResponseBodyData setDisplaySandboxResult(String displaySandboxResult) {
            this.displaySandboxResult = displaySandboxResult;
            return this;
        }
        public String getDisplaySandboxResult() {
            return this.displaySandboxResult;
        }

        public ListObjectScanEventResponseBodyData setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public ListObjectScanEventResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListObjectScanEventResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListObjectScanEventResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListObjectScanEventResponseBodyData setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListObjectScanEventResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListObjectScanEventResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListObjectScanEventResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListObjectScanEventResponseBodyData setSha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }
        public String getSha1() {
            return this.sha1;
        }

        public ListObjectScanEventResponseBodyData setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

        public ListObjectScanEventResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ListObjectScanEventResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListObjectScanEventResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListObjectScanEventResponseBodyPageInfo self = new ListObjectScanEventResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListObjectScanEventResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListObjectScanEventResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListObjectScanEventResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
