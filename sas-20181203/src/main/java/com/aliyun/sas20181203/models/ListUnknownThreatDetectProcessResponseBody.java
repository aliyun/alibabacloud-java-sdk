// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectProcessResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUnknownThreatDetectProcessResponseBodyData> data;

    @NameInMap("PageInfo")
    public ListUnknownThreatDetectProcessResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUnknownThreatDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectProcessResponseBody self = new ListUnknownThreatDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectProcessResponseBody setData(java.util.List<ListUnknownThreatDetectProcessResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUnknownThreatDetectProcessResponseBodyData> getData() {
        return this.data;
    }

    public ListUnknownThreatDetectProcessResponseBody setPageInfo(ListUnknownThreatDetectProcessResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListUnknownThreatDetectProcessResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListUnknownThreatDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUnknownThreatDetectProcessResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AnalyzeResult")
        public String analyzeResult;

        /**
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>5b394b54ca632fe51c4ab4a6dbaf****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>2025031506350619216822625103151158982</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <strong>example:</strong>
         * <p>/usr/bin/tar</p>
         */
        @NameInMap("ProcessPath")
        public String processPath;

        /**
         * <strong>example:</strong>
         * <p>safe process</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>3a6fed5fc11392b3ee9f81caf017b48640d7458766a8eb0382899a605b41****</p>
         */
        @NameInMap("Sha256")
        public String sha256;

        public static ListUnknownThreatDetectProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectProcessResponseBodyData self = new ListUnknownThreatDetectProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectProcessResponseBodyData setAnalyzeResult(String analyzeResult) {
            this.analyzeResult = analyzeResult;
            return this;
        }
        public String getAnalyzeResult() {
            return this.analyzeResult;
        }

        public ListUnknownThreatDetectProcessResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListUnknownThreatDetectProcessResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListUnknownThreatDetectProcessResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListUnknownThreatDetectProcessResponseBodyData setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

        public ListUnknownThreatDetectProcessResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListUnknownThreatDetectProcessResponseBodyData setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

    public static class ListUnknownThreatDetectProcessResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public String count;

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
         * <p>83</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnknownThreatDetectProcessResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectProcessResponseBodyPageInfo self = new ListUnknownThreatDetectProcessResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectProcessResponseBodyPageInfo setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListUnknownThreatDetectProcessResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListUnknownThreatDetectProcessResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnknownThreatDetectProcessResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
