// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAccelerationOfWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E****************05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListAccelerationOfWorkspaceResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAccelerationOfWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerationOfWorkspaceResponseBody self = new ListAccelerationOfWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccelerationOfWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccelerationOfWorkspaceResponseBody setResult(ListAccelerationOfWorkspaceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAccelerationOfWorkspaceResponseBodyResult getResult() {
        return this.result;
    }

    public ListAccelerationOfWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAccelerationOfWorkspaceResponseBodyResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>d14e*********fef8de29fd</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        @NameInMap("CubeName")
        public String cubeName;

        /**
         * <strong>example:</strong>
         * <p>20250911 00:00:00</p>
         */
        @NameInMap("EnableQuickindexTime")
        public String enableQuickindexTime;

        /**
         * <strong>example:</strong>
         * <p>QWDAASG*******8SAD</p>
         */
        @NameInMap("JobHistoryId")
        public String jobHistoryId;

        /**
         * <strong>example:</strong>
         * <p>b30b74**********b3b</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JobStatus")
        public Integer jobStatus;

        /**
         * <strong>example:</strong>
         * <p>20250911 00:00:00</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <strong>example:</strong>
         * <p>47045632</p>
         */
        @NameInMap("Size")
        public String size;

        public static ListAccelerationOfWorkspaceResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListAccelerationOfWorkspaceResponseBodyResultData self = new ListAccelerationOfWorkspaceResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setCubeName(String cubeName) {
            this.cubeName = cubeName;
            return this;
        }
        public String getCubeName() {
            return this.cubeName;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setEnableQuickindexTime(String enableQuickindexTime) {
            this.enableQuickindexTime = enableQuickindexTime;
            return this;
        }
        public String getEnableQuickindexTime() {
            return this.enableQuickindexTime;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setJobHistoryId(String jobHistoryId) {
            this.jobHistoryId = jobHistoryId;
            return this;
        }
        public String getJobHistoryId() {
            return this.jobHistoryId;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListAccelerationOfWorkspaceResponseBodyResultData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class ListAccelerationOfWorkspaceResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListAccelerationOfWorkspaceResponseBodyResultData> data;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Next")
        public Integer next;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Pre")
        public Integer pre;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListAccelerationOfWorkspaceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAccelerationOfWorkspaceResponseBodyResult self = new ListAccelerationOfWorkspaceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setData(java.util.List<ListAccelerationOfWorkspaceResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAccelerationOfWorkspaceResponseBodyResultData> getData() {
            return this.data;
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setNext(Integer next) {
            this.next = next;
            return this;
        }
        public Integer getNext() {
            return this.next;
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setPre(Integer pre) {
            this.pre = pre;
            return this;
        }
        public Integer getPre() {
            return this.pre;
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListAccelerationOfWorkspaceResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
