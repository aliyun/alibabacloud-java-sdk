// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListPromotionOfferRecordsForPartnerResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether a retry is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name. The application with this name is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>watermark</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the %s variable in the ErrMessage response parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListPromotionOfferRecordsForPartnerResponseBodyModule module;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListPromotionOfferRecordsForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPromotionOfferRecordsForPartnerResponseBody self = new ListPromotionOfferRecordsForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setModule(ListPromotionOfferRecordsForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListPromotionOfferRecordsForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListPromotionOfferRecordsForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords extends TeaModel {
        /**
         * <p>The activity code.</p>
         * 
         * <strong>example:</strong>
         * <p>acwfradoj5u</p>
         */
        @NameInMap("ActivityCode")
        public String activityCode;

        /**
         * <p>The activity name.</p>
         * 
         * <strong>example:</strong>
         * <p>IP网段过滤统计</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The employee code.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("EmployeeCode")
        public String employeeCode;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The issuance time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-01</p>
         */
        @NameInMap("IssuanceTime")
        public String issuanceTime;

        /**
         * <p>The benefit snapshot in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OfferSnapshot")
        public String offerSnapshot;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5094</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>The operation remark.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The issuance status.</p>
         * 
         * <strong>example:</strong>
         * <p>FE_RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123241414</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords build(java.util.Map<String, ?> map) throws Exception {
            ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords self = new ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords();
            return TeaModel.build(map, self);
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setActivityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }
        public String getActivityCode() {
            return this.activityCode;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setEmployeeCode(String employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }
        public String getEmployeeCode() {
            return this.employeeCode;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setIssuanceTime(String issuanceTime) {
            this.issuanceTime = issuanceTime;
            return this;
        }
        public String getIssuanceTime() {
            return this.issuanceTime;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setOfferSnapshot(String offerSnapshot) {
            this.offerSnapshot = offerSnapshot;
            return this;
        }
        public String getOfferSnapshot() {
            return this.offerSnapshot;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListPromotionOfferRecordsForPartnerResponseBodyModule extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of issuance records.</p>
         */
        @NameInMap("Records")
        public java.util.List<ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords> records;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPromotionOfferRecordsForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListPromotionOfferRecordsForPartnerResponseBodyModule self = new ListPromotionOfferRecordsForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModule setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModule setRecords(java.util.List<ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListPromotionOfferRecordsForPartnerResponseBodyModuleRecords> getRecords() {
            return this.records;
        }

        public ListPromotionOfferRecordsForPartnerResponseBodyModule setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
