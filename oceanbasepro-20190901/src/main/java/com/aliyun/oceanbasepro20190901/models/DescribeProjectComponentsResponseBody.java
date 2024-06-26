// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectComponentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Contact the administrator.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <strong>example:</strong>
     * <p>INNER_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>48</p>
     */
    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public DescribeProjectComponentsResponseBodyData data;

    @NameInMap("ErrorDetail")
    public DescribeProjectComponentsResponseBodyErrorDetail errorDetail;

    /**
     * <strong>example:</strong>
     * <p>A system error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProjectComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectComponentsResponseBody self = new DescribeProjectComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectComponentsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeProjectComponentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectComponentsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeProjectComponentsResponseBody setData(DescribeProjectComponentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProjectComponentsResponseBodyData getData() {
        return this.data;
    }

    public DescribeProjectComponentsResponseBody setErrorDetail(DescribeProjectComponentsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeProjectComponentsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeProjectComponentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectComponentsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectComponentsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectComponentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectComponentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails self = new DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataFullImportComponents extends TeaModel {
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>p_4w8v****</p>
         */
        @NameInMap("Identity")
        public String identity;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1-9000:connector_v2:np_4w8v****c-full_trans-1-0:0000000276</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeProjectComponentsResponseBodyDataFullImportComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataFullImportComponents self = new DescribeProjectComponentsResponseBodyDataFullImportComponents();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setErrorDetails(java.util.List<DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullImportComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectComponentsResponseBodyDataFullImportComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails self = new DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataFullVerifyComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConsistentQuantity")
        public Long consistentQuantity;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InconsistentQuantity")
        public Long inconsistentQuantity;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1-9000:90247:0000000033</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RecordProgress")
        public Integer recordProgress;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1345***</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static DescribeProjectComponentsResponseBodyDataFullVerifyComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataFullVerifyComponents self = new DescribeProjectComponentsResponseBodyDataFullVerifyComponents();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setConsistentQuantity(Long consistentQuantity) {
            this.consistentQuantity = consistentQuantity;
            return this;
        }
        public Long getConsistentQuantity() {
            return this.consistentQuantity;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setErrorDetails(java.util.List<DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullVerifyComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setInconsistentQuantity(Long inconsistentQuantity) {
            this.inconsistentQuantity = inconsistentQuantity;
            return this;
        }
        public Long getInconsistentQuantity() {
            return this.inconsistentQuantity;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setRecordProgress(Integer recordProgress) {
            this.recordProgress = recordProgress;
            return this;
        }
        public Integer getRecordProgress() {
            return this.recordProgress;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectComponentsResponseBodyDataFullVerifyComponents setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails self = new DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataIncrSyncComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-13T09:19:53</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <strong>example:</strong>
         * <p>1689250071</p>
         */
        @NameInMap("CheckpointSampleTimestamp")
        public Long checkpointSampleTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Long delay;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>np_4w***</p>
         */
        @NameInMap("Identity")
        public String identity;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1-9000:connector_v2:np_4w****jxc-incr_trans-1-0:0000000277</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Subtopics")
        public java.util.List<String> subtopics;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Tps")
        public Long tps;

        public static DescribeProjectComponentsResponseBodyDataIncrSyncComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataIncrSyncComponents self = new DescribeProjectComponentsResponseBodyDataIncrSyncComponents();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setCheckpointSampleTimestamp(Long checkpointSampleTimestamp) {
            this.checkpointSampleTimestamp = checkpointSampleTimestamp;
            return this;
        }
        public Long getCheckpointSampleTimestamp() {
            return this.checkpointSampleTimestamp;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setErrorDetails(java.util.List<DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataIncrSyncComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setSubtopics(java.util.List<String> subtopics) {
            this.subtopics = subtopics;
            return this;
        }
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        public DescribeProjectComponentsResponseBodyDataIncrSyncComponents setTps(Long tps) {
            this.tps = tps;
            return this;
        }
        public Long getTps() {
            return this.tps;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails self = new DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-13T09:19:53</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <strong>example:</strong>
         * <p>1689250049</p>
         */
        @NameInMap("CheckpointSampleTimestamp")
        public Long checkpointSampleTimestamp;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Long delay;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <strong>example:</strong>
         * <p>np_4w8****</p>
         */
        @NameInMap("Identity")
        public String identity;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1-9000:connector_v2:np_4w8****9jxc-incr_trans-1-0:0000000277</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Subtopics")
        public java.util.List<String> subtopics;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Tps")
        public Long tps;

        public static DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents self = new DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setCheckpointSampleTimestamp(Long checkpointSampleTimestamp) {
            this.checkpointSampleTimestamp = checkpointSampleTimestamp;
            return this;
        }
        public Long getCheckpointSampleTimestamp() {
            return this.checkpointSampleTimestamp;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setErrorDetails(java.util.List<DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponentsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setIdentity(String identity) {
            this.identity = identity;
            return this;
        }
        public String getIdentity() {
            return this.identity;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setSubtopics(java.util.List<String> subtopics) {
            this.subtopics = subtopics;
            return this;
        }
        public java.util.List<String> getSubtopics() {
            return this.subtopics;
        }

        public DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents setTps(Long tps) {
            this.tps = tps;
            return this;
        }
        public Long getTps() {
            return this.tps;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails self = new DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataReverseStoreList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-13T09:19:53</p>
         */
        @NameInMap("BeginCheckpoint")
        public String beginCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Conn")
        public Long conn;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T09:19:53</p>
         */
        @NameInMap("EndCheckpoint")
        public String endCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>1689250071</p>
         */
        @NameInMap("Gmt")
        public Long gmt;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T18:04:36</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>1689250071</p>
         */
        @NameInMap("LatelyHeartbeatTimeSec")
        public Long latelyHeartbeatTimeSec;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1-9000:connector_v2:np_4w****9jxc-incr_trans-1-0:0000000277</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2883</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>EXCEPTION</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2882</p>
         */
        @NameInMap("StorePort")
        public Integer storePort;

        /**
         * <p>SubTopic。</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Subtopic")
        public String subtopic;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ToSwitch")
        public Boolean toSwitch;

        /**
         * <p>Topic。</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Tps")
        public Long tps;

        public static DescribeProjectComponentsResponseBodyDataReverseStoreList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataReverseStoreList self = new DescribeProjectComponentsResponseBodyDataReverseStoreList();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setBeginCheckpoint(String beginCheckpoint) {
            this.beginCheckpoint = beginCheckpoint;
            return this;
        }
        public String getBeginCheckpoint() {
            return this.beginCheckpoint;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setConn(Long conn) {
            this.conn = conn;
            return this;
        }
        public Long getConn() {
            return this.conn;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setEndCheckpoint(String endCheckpoint) {
            this.endCheckpoint = endCheckpoint;
            return this;
        }
        public String getEndCheckpoint() {
            return this.endCheckpoint;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setErrorDetails(java.util.List<DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseStoreListErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setLatelyHeartbeatTimeSec(Long latelyHeartbeatTimeSec) {
            this.latelyHeartbeatTimeSec = latelyHeartbeatTimeSec;
            return this;
        }
        public Long getLatelyHeartbeatTimeSec() {
            return this.latelyHeartbeatTimeSec;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setStorePort(Integer storePort) {
            this.storePort = storePort;
            return this;
        }
        public Integer getStorePort() {
            return this.storePort;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setSubtopic(String subtopic) {
            this.subtopic = subtopic;
            return this;
        }
        public String getSubtopic() {
            return this.subtopic;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setToSwitch(Boolean toSwitch) {
            this.toSwitch = toSwitch;
            return this;
        }
        public Boolean getToSwitch() {
            return this.toSwitch;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeProjectComponentsResponseBodyDataReverseStoreList setTps(Long tps) {
            this.tps = tps;
            return this;
        }
        public Long getTps() {
            return this.tps;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataStoreListErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyDataStoreListErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataStoreListErrorDetails self = new DescribeProjectComponentsResponseBodyDataStoreListErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyDataStoreListErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectComponentsResponseBodyDataStoreList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-13T09:19:53</p>
         */
        @NameInMap("BeginCheckpoint")
        public String beginCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Conn")
        public Long conn;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("Delay")
        public Long delay;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T09:19:53</p>
         */
        @NameInMap("EndCheckpoint")
        public String endCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectComponentsResponseBodyDataStoreListErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>1689250049</p>
         */
        @NameInMap("Gmt")
        public Long gmt;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T17:29:54</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-07-13T17:29:54</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>1689250071</p>
         */
        @NameInMap("LatelyHeartbeatTimeSec")
        public Long latelyHeartbeatTimeSec;

        /**
         * <strong>example:</strong>
         * <p>xxx.xxx.xxx.1-7145:OB_ORACLE_np_4w3r***_4w:0000***97</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2883</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>EXCEPTION</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2882</p>
         */
        @NameInMap("StorePort")
        public Integer storePort;

        /**
         * <p>SubTopic。</p>
         * 
         * <strong>example:</strong>
         * <p>OB_ORACLE_np_4w3*<strong>c_4w3</strong>-0</p>
         */
        @NameInMap("Subtopic")
        public String subtopic;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ToSwitch")
        public Boolean toSwitch;

        /**
         * <p>Topic。</p>
         * 
         * <strong>example:</strong>
         * <p>OB_ORACLE_np_4w3r29c_4w3****</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Tps")
        public Long tps;

        public static DescribeProjectComponentsResponseBodyDataStoreList build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyDataStoreList self = new DescribeProjectComponentsResponseBodyDataStoreList();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setBeginCheckpoint(String beginCheckpoint) {
            this.beginCheckpoint = beginCheckpoint;
            return this;
        }
        public String getBeginCheckpoint() {
            return this.beginCheckpoint;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setConn(Long conn) {
            this.conn = conn;
            return this;
        }
        public Long getConn() {
            return this.conn;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setDelay(Long delay) {
            this.delay = delay;
            return this;
        }
        public Long getDelay() {
            return this.delay;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setEndCheckpoint(String endCheckpoint) {
            this.endCheckpoint = endCheckpoint;
            return this;
        }
        public String getEndCheckpoint() {
            return this.endCheckpoint;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setErrorDetails(java.util.List<DescribeProjectComponentsResponseBodyDataStoreListErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataStoreListErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setLatelyHeartbeatTimeSec(Long latelyHeartbeatTimeSec) {
            this.latelyHeartbeatTimeSec = latelyHeartbeatTimeSec;
            return this;
        }
        public Long getLatelyHeartbeatTimeSec() {
            return this.latelyHeartbeatTimeSec;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setStorePort(Integer storePort) {
            this.storePort = storePort;
            return this;
        }
        public Integer getStorePort() {
            return this.storePort;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setSubtopic(String subtopic) {
            this.subtopic = subtopic;
            return this;
        }
        public String getSubtopic() {
            return this.subtopic;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setToSwitch(Boolean toSwitch) {
            this.toSwitch = toSwitch;
            return this;
        }
        public Boolean getToSwitch() {
            return this.toSwitch;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public DescribeProjectComponentsResponseBodyDataStoreList setTps(Long tps) {
            this.tps = tps;
            return this;
        }
        public Long getTps() {
            return this.tps;
        }

    }

    public static class DescribeProjectComponentsResponseBodyData extends TeaModel {
        @NameInMap("FullImportComponents")
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullImportComponents> fullImportComponents;

        @NameInMap("FullVerifyComponents")
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullVerifyComponents> fullVerifyComponents;

        @NameInMap("IncrSyncComponents")
        public java.util.List<DescribeProjectComponentsResponseBodyDataIncrSyncComponents> incrSyncComponents;

        @NameInMap("ReverseIncrSyncComponents")
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents> reverseIncrSyncComponents;

        @NameInMap("ReverseStoreList")
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseStoreList> reverseStoreList;

        @NameInMap("StoreList")
        public java.util.List<DescribeProjectComponentsResponseBodyDataStoreList> storeList;

        public static DescribeProjectComponentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyData self = new DescribeProjectComponentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyData setFullImportComponents(java.util.List<DescribeProjectComponentsResponseBodyDataFullImportComponents> fullImportComponents) {
            this.fullImportComponents = fullImportComponents;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullImportComponents> getFullImportComponents() {
            return this.fullImportComponents;
        }

        public DescribeProjectComponentsResponseBodyData setFullVerifyComponents(java.util.List<DescribeProjectComponentsResponseBodyDataFullVerifyComponents> fullVerifyComponents) {
            this.fullVerifyComponents = fullVerifyComponents;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataFullVerifyComponents> getFullVerifyComponents() {
            return this.fullVerifyComponents;
        }

        public DescribeProjectComponentsResponseBodyData setIncrSyncComponents(java.util.List<DescribeProjectComponentsResponseBodyDataIncrSyncComponents> incrSyncComponents) {
            this.incrSyncComponents = incrSyncComponents;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataIncrSyncComponents> getIncrSyncComponents() {
            return this.incrSyncComponents;
        }

        public DescribeProjectComponentsResponseBodyData setReverseIncrSyncComponents(java.util.List<DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents> reverseIncrSyncComponents) {
            this.reverseIncrSyncComponents = reverseIncrSyncComponents;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseIncrSyncComponents> getReverseIncrSyncComponents() {
            return this.reverseIncrSyncComponents;
        }

        public DescribeProjectComponentsResponseBodyData setReverseStoreList(java.util.List<DescribeProjectComponentsResponseBodyDataReverseStoreList> reverseStoreList) {
            this.reverseStoreList = reverseStoreList;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataReverseStoreList> getReverseStoreList() {
            return this.reverseStoreList;
        }

        public DescribeProjectComponentsResponseBodyData setStoreList(java.util.List<DescribeProjectComponentsResponseBodyDataStoreList> storeList) {
            this.storeList = storeList;
            return this;
        }
        public java.util.List<DescribeProjectComponentsResponseBodyDataStoreList> getStoreList() {
            return this.storeList;
        }

    }

    public static class DescribeProjectComponentsResponseBodyErrorDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectComponentsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectComponentsResponseBodyErrorDetail self = new DescribeProjectComponentsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectComponentsResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
