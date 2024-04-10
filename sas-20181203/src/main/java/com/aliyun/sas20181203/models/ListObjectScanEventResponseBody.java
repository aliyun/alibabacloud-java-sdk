// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListObjectScanEventResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListObjectScanEventResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The name of the parameter in the file details.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the alert.</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>The value type of the parameter in the file details.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The value of the parameter.</p>
         */
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
        /**
         * <p>The name of the OSS bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The details of the file.</p>
         */
        @NameInMap("Details")
        public java.util.List<ListObjectScanEventResponseBodyDataDetails> details;

        /**
         * <p>Indicates whether the file can be detected by cloud sandbox. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("DisplaySandboxResult")
        public String displaySandboxResult;

        /**
         * <p>The ID of the alert.</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        /**
         * <p>The name of the alert.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The path to the file.</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The timestamp at which the alert was first detected.</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("HasSubEvent")
        public Boolean hasSubEvent;

        /**
         * <p>The timestamp at which the alert was last detected.</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The MD5 hash value of the file.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The key of the file that is stored in the OSS bucket.</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <p>The risk level of the alert. Valid values:</p>
         * <br>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The SHA-1 hash value of the file.</p>
         */
        @NameInMap("Sha1")
        public String sha1;

        /**
         * <p>The SHA-256 hash value of the file.</p>
         */
        @NameInMap("Sha256")
        public String sha256;

        /**
         * <p>The method that is used to detect the malicious file. Valid values:</p>
         * <br>
         * <p>*   **API**: uses API operations.</p>
         * <p>*   **OSS**: uses OSS file check.</p>
         */
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

        public ListObjectScanEventResponseBodyData setHasSubEvent(Boolean hasSubEvent) {
            this.hasSubEvent = hasSubEvent;
            return this;
        }
        public Boolean getHasSubEvent() {
            return this.hasSubEvent;
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
