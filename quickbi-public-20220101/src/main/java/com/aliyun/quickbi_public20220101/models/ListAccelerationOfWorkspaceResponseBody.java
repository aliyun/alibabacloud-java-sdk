// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAccelerationOfWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E****************05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The acceleration task model.</p>
     */
    @NameInMap("Result")
    public ListAccelerationOfWorkspaceResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d14e*********fef8de29fd</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CubeName")
        public String cubeName;

        /**
         * <p>The time when acceleration was enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>20250911 00:00:00</p>
         */
        @NameInMap("EnableQuickindexTime")
        public String enableQuickindexTime;

        /**
         * <p>The task history ID.</p>
         * 
         * <strong>example:</strong>
         * <p>QWDAASG*******8SAD</p>
         */
        @NameInMap("JobHistoryId")
        public String jobHistoryId;

        /**
         * <p>The acceleration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b30b74**********b3b</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p>0: Pending</p>
         * </li>
         * <li><p>1: Running</p>
         * </li>
         * <li><p>2: Succeeded</p>
         * </li>
         * <li><p>3: Failed</p>
         * </li>
         * <li><p>4: Canceled</p>
         * </li>
         * <li><p>5: Warning</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JobStatus")
        public Integer jobStatus;

        /**
         * <p>The time when the task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>20250911 00:00:00</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The size.</p>
         * 
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
        /**
         * <p>An array of acceleration task information.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAccelerationOfWorkspaceResponseBodyResultData> data;

        /**
         * <p>The next page. A value of NULL or 0 indicates that there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Next")
        public Integer next;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of rows per page that you set when you call the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The previous page. A value of NULL or 0 indicates that there is no previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Pre")
        public Integer pre;

        /**
         * <p>The total number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
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
