// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class ListObjectScanEventResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListObjectScanEventResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListObjectScanEventResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>E99D386F-5546-5BCD-BADD-F4EF4B******</p>
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
         * <strong>example:</strong>
         * <p>DownloadUrl</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>DownloadUrl</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <strong>example:</strong>
         * <p>html</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="http://gcx.cn-hangzhou.aliyuncs.com/">http://gcx.cn-hangzhou.aliyuncs.com/</a>****</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <strong>example:</strong>
         * <p><a href="http://gcx.cn-hangzhou.aliyuncs.com/">http://gcx.cn-hangzhou.aliyuncs.com/</a>****</p>
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
         * <strong>example:</strong>
         * <p>testBucket******</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("Details")
        public java.util.List<ListObjectScanEventResponseBodyDataDetails> details;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisplaySandboxResult")
        public String displaySandboxResult;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventId")
        public Long eventId;

        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>/usr/local****</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasSubEvent")
        public Boolean hasSubEvent;

        /**
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <strong>example:</strong>
         * <p>e991e62f484bb6accd676e57a9******</p>
         */
        @NameInMap("Md5")
        public String md5;

        @NameInMap("OperateResult")
        public String operateResult;

        /**
         * <strong>example:</strong>
         * <p>1/2022/06/23/15/41/16559701077444693a0c6-33b2-4cc2-a99f-9f38b8b8****</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>3c01bdbb26f358bab27f267924aa2c9a03fc****</p>
         */
        @NameInMap("Sha1")
        public String sha1;

        /**
         * <strong>example:</strong>
         * <p>3a6fed5fc11392b3ee9f81caf017b48640d7458766a8eb0382899a605b41****</p>
         */
        @NameInMap("Sha256")
        public String sha256;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

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

        public ListObjectScanEventResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
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

        public ListObjectScanEventResponseBodyData setOperateResult(String operateResult) {
            this.operateResult = operateResult;
            return this;
        }
        public String getOperateResult() {
            return this.operateResult;
        }

        public ListObjectScanEventResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListObjectScanEventResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
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

        public ListObjectScanEventResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListObjectScanEventResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>187</p>
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
