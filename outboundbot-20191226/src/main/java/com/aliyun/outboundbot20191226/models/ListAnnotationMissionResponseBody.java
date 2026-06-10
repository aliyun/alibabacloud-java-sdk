// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAnnotationMissionResponseBody extends TeaModel {
    /**
     * <p>Response code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data</p>
     */
    @NameInMap("Data")
    public ListAnnotationMissionResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Additional information. Returns success for normal requests. Returns a specific error code for abnormal requests.</p>
     * 
     * <strong>example:</strong>
     * <p>CDR \&quot;job-c7b8a817-b8e8-40f3-b7ad-f28dcea218ff\&quot; doesn\&quot;t exists.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded. true: succeeded. false: failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAnnotationMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationMissionResponseBody self = new ListAnnotationMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnnotationMissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnnotationMissionResponseBody setData(ListAnnotationMissionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAnnotationMissionResponseBodyData getData() {
        return this.data;
    }

    public ListAnnotationMissionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAnnotationMissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnnotationMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnnotationMissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAnnotationMissionResponseBodyDataAnnotationMissionList extends TeaModel {
        /**
         * <p>Annotation data source type. 1: Outbound call. 2: Navigation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationMissionDataSourceType")
        public Integer annotationMissionDataSourceType;

        /**
         * <p>Annotation debug data source list</p>
         * <blockquote>
         * <p>The response includes an extra 0. Valid responses are [0,1], [0,2], or [0,1,2].</p>
         * </blockquote>
         */
        @NameInMap("AnnotationMissionDebugDataSourceList")
        public java.util.List<Integer> annotationMissionDebugDataSourceList;

        /**
         * <p>Mission ID</p>
         * 
         * <strong>example:</strong>
         * <p>ddce607f-f537-4ebd-9914-cf45671defb9</p>
         */
        @NameInMap("AnnotationMissionId")
        public String annotationMissionId;

        /**
         * <p>Mission name</p>
         * 
         * <strong>example:</strong>
         * <p>体验场景--移车-标注任务-20230220-141347</p>
         */
        @NameInMap("AnnotationMissionName")
        public String annotationMissionName;

        /**
         * <p>Annotation status</p>
         * <ul>
         * <li><p>1: In progress</p>
         * </li>
         * <li><p>2: Completed</p>
         * </li>
         * <li><p>3: Closed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnotationStatus")
        public Integer annotationStatus;

        /**
         * <p>End time of the conversation time query condition for the annotation mission</p>
         * 
         * <strong>example:</strong>
         * <p>1684511999000</p>
         */
        @NameInMap("ConversationTimeEndFilter")
        public Long conversationTimeEndFilter;

        /**
         * <p>Start time of the conversation time query condition for the annotation mission</p>
         * 
         * <strong>example:</strong>
         * <p>1683216000000</p>
         */
        @NameInMap("ConversationTimeStartFilter")
        public Long conversationTimeStartFilter;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1676170339515</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether to exclude call records already annotated in other missions</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ExcludeOtherMissionSession")
        public Boolean excludeOtherMissionSession;

        /**
         * <p>Completion time of the annotation mission</p>
         * 
         * <strong>example:</strong>
         * <p>1683443903785</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>32be9d94-1346-4c4a-a4d0-ccd379f87013</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Maximum sampling count limit</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SamplingCount")
        public Integer samplingCount;

        /**
         * <p>Sampling description</p>
         * 
         * <strong>example:</strong>
         * <p>标注</p>
         */
        @NameInMap("SamplingDescription")
        public String samplingDescription;

        /**
         * <p>Sampling rate</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SamplingRate")
        public Integer samplingRate;

        /**
         * <p>Sampling type</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SamplingType")
        public Integer samplingType;

        /**
         * <p>List of session end reason types used when creating the mission</p>
         * <ul>
         * <li><p>1: Normal completion</p>
         * </li>
         * <li><p>2: Bot hangup after rejection</p>
         * </li>
         * <li><p>3: Hangup due to silence timeout</p>
         * </li>
         * <li><p>4: User hangup after rejection</p>
         * </li>
         * <li><p>5: User hangup without reason</p>
         * </li>
         * <li><p>6: Transfer to agent after intent match</p>
         * </li>
         * <li><p>7: Transfer to agent after rejection</p>
         * </li>
         * <li><p>8: No interaction from user side</p>
         * </li>
         * <li><p>9: System exception interruption</p>
         * </li>
         * <li><p>10: Transfer to IVR after intent match</p>
         * </li>
         * <li><p>11: Transfer to IVR after rejection</p>
         * </li>
         * </ul>
         */
        @NameInMap("SessionEndReasonFilterList")
        public java.util.List<Integer> sessionEndReasonFilterList;

        /**
         * <p>Number of completed sessions in the annotation mission</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SessionFinishCount")
        public Integer sessionFinishCount;

        /**
         * <p>Total number of sessions in the annotation mission</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SessionTotalCount")
        public Integer sessionTotalCount;

        public static ListAnnotationMissionResponseBodyDataAnnotationMissionList build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionResponseBodyDataAnnotationMissionList self = new ListAnnotationMissionResponseBodyDataAnnotationMissionList();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setAnnotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
            this.annotationMissionDataSourceType = annotationMissionDataSourceType;
            return this;
        }
        public Integer getAnnotationMissionDataSourceType() {
            return this.annotationMissionDataSourceType;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setAnnotationMissionDebugDataSourceList(java.util.List<Integer> annotationMissionDebugDataSourceList) {
            this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
            return this;
        }
        public java.util.List<Integer> getAnnotationMissionDebugDataSourceList() {
            return this.annotationMissionDebugDataSourceList;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setAnnotationMissionId(String annotationMissionId) {
            this.annotationMissionId = annotationMissionId;
            return this;
        }
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setAnnotationMissionName(String annotationMissionName) {
            this.annotationMissionName = annotationMissionName;
            return this;
        }
        public String getAnnotationMissionName() {
            return this.annotationMissionName;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setAnnotationStatus(Integer annotationStatus) {
            this.annotationStatus = annotationStatus;
            return this;
        }
        public Integer getAnnotationStatus() {
            return this.annotationStatus;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setConversationTimeEndFilter(Long conversationTimeEndFilter) {
            this.conversationTimeEndFilter = conversationTimeEndFilter;
            return this;
        }
        public Long getConversationTimeEndFilter() {
            return this.conversationTimeEndFilter;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setConversationTimeStartFilter(Long conversationTimeStartFilter) {
            this.conversationTimeStartFilter = conversationTimeStartFilter;
            return this;
        }
        public Long getConversationTimeStartFilter() {
            return this.conversationTimeStartFilter;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setExcludeOtherMissionSession(Boolean excludeOtherMissionSession) {
            this.excludeOtherMissionSession = excludeOtherMissionSession;
            return this;
        }
        public Boolean getExcludeOtherMissionSession() {
            return this.excludeOtherMissionSession;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSamplingCount(Integer samplingCount) {
            this.samplingCount = samplingCount;
            return this;
        }
        public Integer getSamplingCount() {
            return this.samplingCount;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSamplingDescription(String samplingDescription) {
            this.samplingDescription = samplingDescription;
            return this;
        }
        public String getSamplingDescription() {
            return this.samplingDescription;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSamplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Integer getSamplingRate() {
            return this.samplingRate;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSamplingType(Integer samplingType) {
            this.samplingType = samplingType;
            return this;
        }
        public Integer getSamplingType() {
            return this.samplingType;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
            this.sessionEndReasonFilterList = sessionEndReasonFilterList;
            return this;
        }
        public java.util.List<Integer> getSessionEndReasonFilterList() {
            return this.sessionEndReasonFilterList;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSessionFinishCount(Integer sessionFinishCount) {
            this.sessionFinishCount = sessionFinishCount;
            return this;
        }
        public Integer getSessionFinishCount() {
            return this.sessionFinishCount;
        }

        public ListAnnotationMissionResponseBodyDataAnnotationMissionList setSessionTotalCount(Integer sessionTotalCount) {
            this.sessionTotalCount = sessionTotalCount;
            return this;
        }
        public Integer getSessionTotalCount() {
            return this.sessionTotalCount;
        }

    }

    public static class ListAnnotationMissionResponseBodyData extends TeaModel {
        /**
         * <p>Annotation mission list</p>
         */
        @NameInMap("AnnotationMissionList")
        public java.util.List<ListAnnotationMissionResponseBodyDataAnnotationMissionList> annotationMissionList;

        /**
         * <p>Additional information. Returns success for normal requests. Returns a specific error code for abnormal requests.</p>
         * 
         * <strong>example:</strong>
         * <p>CDR \&quot;job-c7b8a817-b8e8-40f3-b7ad-f28dcea218ff\&quot; doesn\&quot;t exists.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <p>Number of entries per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>Indicates whether the call succeeded. true: succeeded. false: failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalPageCount")
        public Long totalPageCount;

        public static ListAnnotationMissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnnotationMissionResponseBodyData self = new ListAnnotationMissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnnotationMissionResponseBodyData setAnnotationMissionList(java.util.List<ListAnnotationMissionResponseBodyDataAnnotationMissionList> annotationMissionList) {
            this.annotationMissionList = annotationMissionList;
            return this;
        }
        public java.util.List<ListAnnotationMissionResponseBodyDataAnnotationMissionList> getAnnotationMissionList() {
            return this.annotationMissionList;
        }

        public ListAnnotationMissionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAnnotationMissionResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public ListAnnotationMissionResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAnnotationMissionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListAnnotationMissionResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListAnnotationMissionResponseBodyData setTotalPageCount(Long totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

    }

}
