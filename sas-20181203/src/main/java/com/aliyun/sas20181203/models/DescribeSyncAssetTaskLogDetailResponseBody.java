// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskLogDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeSyncAssetTaskLogDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the tasks.</p>
     */
    @NameInMap("TaskRecordDetails")
    public java.util.List<DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails> taskRecordDetails;

    public static DescribeSyncAssetTaskLogDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAssetTaskLogDetailResponseBody self = new DescribeSyncAssetTaskLogDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAssetTaskLogDetailResponseBody setPageInfo(DescribeSyncAssetTaskLogDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSyncAssetTaskLogDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSyncAssetTaskLogDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncAssetTaskLogDetailResponseBody setTaskRecordDetails(java.util.List<DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails> taskRecordDetails) {
        this.taskRecordDetails = taskRecordDetails;
        return this;
    }
    public java.util.List<DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails> getTaskRecordDetails() {
        return this.taskRecordDetails;
    }

    public static class DescribeSyncAssetTaskLogDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSyncAssetTaskLogDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncAssetTaskLogDetailResponseBodyPageInfo self = new DescribeSyncAssetTaskLogDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails extends TeaModel {
        /**
         * <p>The total number of assets.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AssetCount")
        public Integer assetCount;

        /**
         * <p>The region of the server in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("IdcRegion")
        public String idcRegion;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>6c4e4c36ffc3e5919120b405c2b3****</p>
         */
        @NameInMap("LeafTaskId")
        public String leafTaskId;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is not started.</li>
         * <li><strong>START</strong>: The task is started.</li>
         * <li><strong>MESSAGE_SEND</strong>: The command is sent.</li>
         * <li><strong>SUCCESS</strong>: The task is complete.</li>
         * <li><strong>FAIL</strong>: The task failed.</li>
         * <li><strong>TIMEOUT</strong>: The task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("LeafTaskStatus")
        public String leafTaskStatus;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown reason</p>
         */
        @NameInMap("TaskMsg")
        public String taskMsg;

        /**
         * <p>The timestamp when the task results were reported.</p>
         * 
         * <strong>example:</strong>
         * <p>1671614217000</p>
         */
        @NameInMap("TaskReportTime")
        public Long taskReportTime;

        /**
         * <p>The number of unprotected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UnprotectedAssetCount")
        public Integer unprotectedAssetCount;

        public static DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails self = new DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setAssetCount(Integer assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Integer getAssetCount() {
            return this.assetCount;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setIdcRegion(String idcRegion) {
            this.idcRegion = idcRegion;
            return this;
        }
        public String getIdcRegion() {
            return this.idcRegion;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setLeafTaskId(String leafTaskId) {
            this.leafTaskId = leafTaskId;
            return this;
        }
        public String getLeafTaskId() {
            return this.leafTaskId;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setLeafTaskStatus(String leafTaskStatus) {
            this.leafTaskStatus = leafTaskStatus;
            return this;
        }
        public String getLeafTaskStatus() {
            return this.leafTaskStatus;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setTaskMsg(String taskMsg) {
            this.taskMsg = taskMsg;
            return this;
        }
        public String getTaskMsg() {
            return this.taskMsg;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setTaskReportTime(Long taskReportTime) {
            this.taskReportTime = taskReportTime;
            return this;
        }
        public Long getTaskReportTime() {
            return this.taskReportTime;
        }

        public DescribeSyncAssetTaskLogDetailResponseBodyTaskRecordDetails setUnprotectedAssetCount(Integer unprotectedAssetCount) {
            this.unprotectedAssetCount = unprotectedAssetCount;
            return this;
        }
        public Integer getUnprotectedAssetCount() {
            return this.unprotectedAssetCount;
        }

    }

}
