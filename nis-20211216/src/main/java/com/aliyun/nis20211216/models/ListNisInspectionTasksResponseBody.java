// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionTasksResponseBody extends TeaModel {
    /**
     * <p>The list of network inspection tasks.</p>
     */
    @NameInMap("InspectionTaskList")
    public java.util.List<ListNisInspectionTasksResponseBodyInspectionTaskList> inspectionTaskList;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If the value of this parameter is not empty, it indicates that there are more results to retrieve. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml194Cz/lMNdmr+DEh0th6dVlNEo/F148UPCh2itDku7Qj</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNisInspectionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionTasksResponseBody self = new ListNisInspectionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionTasksResponseBody setInspectionTaskList(java.util.List<ListNisInspectionTasksResponseBodyInspectionTaskList> inspectionTaskList) {
        this.inspectionTaskList = inspectionTaskList;
        return this;
    }
    public java.util.List<ListNisInspectionTasksResponseBodyInspectionTaskList> getInspectionTaskList() {
        return this.inspectionTaskList;
    }

    public ListNisInspectionTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNisInspectionTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNisInspectionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNisInspectionTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNisInspectionTasksResponseBodyInspectionTaskList extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-18 00:14:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the network inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>NIS inspection</p>
         */
        @NameInMap("InspectionName")
        public String inspectionName;

        /**
         * <p>The type of inspection solution that the network inspection task uses. Valid values: basic and customized.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("InspectionProject")
        public String inspectionProject;

        /**
         * <p>The ID of the network inspection task.</p>
         * 
         * <strong>example:</strong>
         * <p>ni-8svm******hzr7fh79</p>
         */
        @NameInMap("InspectionTaskId")
        public String inspectionTaskId;

        /**
         * <p>The ID of the latest report.</p>
         * 
         * <strong>example:</strong>
         * <p>nir-b4c4c9******8a25e</p>
         */
        @NameInMap("LastUpdateReportId")
        public String lastUpdateReportId;

        /**
         * <p>The running status of the task. Valid values:</p>
         * <p>Creating: The task is being created.</p>
         * <ul>
         * <li><p>Active</p>
         * </li>
         * <li><p>Running</p>
         * </li>
         * <li><p>Inactive</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListNisInspectionTasksResponseBodyInspectionTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListNisInspectionTasksResponseBodyInspectionTaskList self = new ListNisInspectionTasksResponseBodyInspectionTaskList();
            return TeaModel.build(map, self);
        }

        public ListNisInspectionTasksResponseBodyInspectionTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNisInspectionTasksResponseBodyInspectionTaskList setInspectionName(String inspectionName) {
            this.inspectionName = inspectionName;
            return this;
        }
        public String getInspectionName() {
            return this.inspectionName;
        }

        public ListNisInspectionTasksResponseBodyInspectionTaskList setInspectionProject(String inspectionProject) {
            this.inspectionProject = inspectionProject;
            return this;
        }
        public String getInspectionProject() {
            return this.inspectionProject;
        }

        public ListNisInspectionTasksResponseBodyInspectionTaskList setInspectionTaskId(String inspectionTaskId) {
            this.inspectionTaskId = inspectionTaskId;
            return this;
        }
        public String getInspectionTaskId() {
            return this.inspectionTaskId;
        }

        public ListNisInspectionTasksResponseBodyInspectionTaskList setLastUpdateReportId(String lastUpdateReportId) {
            this.lastUpdateReportId = lastUpdateReportId;
            return this;
        }
        public String getLastUpdateReportId() {
            return this.lastUpdateReportId;
        }

        public ListNisInspectionTasksResponseBodyInspectionTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
