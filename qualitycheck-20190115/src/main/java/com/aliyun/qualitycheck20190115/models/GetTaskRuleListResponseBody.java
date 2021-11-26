// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetTaskRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CompSubTaskCount")
    public Integer compSubTaskCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public GetTaskRuleListResponseBodyData data;

    @NameInMap("DataSize")
    public Integer dataSize;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReviewStatus")
    public Integer reviewStatus;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalSubTaskCount")
    public Integer totalSubTaskCount;

    public static GetTaskRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRuleListResponseBody self = new GetTaskRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskRuleListResponseBody setCompSubTaskCount(Integer compSubTaskCount) {
        this.compSubTaskCount = compSubTaskCount;
        return this;
    }
    public Integer getCompSubTaskCount() {
        return this.compSubTaskCount;
    }

    public GetTaskRuleListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetTaskRuleListResponseBody setData(GetTaskRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskRuleListResponseBodyData getData() {
        return this.data;
    }

    public GetTaskRuleListResponseBody setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Integer getDataSize() {
        return this.dataSize;
    }

    public GetTaskRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskRuleListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTaskRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskRuleListResponseBody setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }
    public Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public GetTaskRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskRuleListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetTaskRuleListResponseBody setTotalSubTaskCount(Integer totalSubTaskCount) {
        this.totalSubTaskCount = totalSubTaskCount;
        return this;
    }
    public Integer getTotalSubTaskCount() {
        return this.totalSubTaskCount;
    }

    public static class GetTaskRuleListResponseBodyDataRuleCountInfo extends TeaModel {
        @NameInMap("CheckNumber")
        public Integer checkNumber;

        @NameInMap("CreateEmpid")
        public String createEmpid;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("HitNumber")
        public Integer hitNumber;

        @NameInMap("HitRate")
        public Float hitRate;

        @NameInMap("HitRealViolationRate")
        public Float hitRealViolationRate;

        @NameInMap("IsDelete")
        public Integer isDelete;

        @NameInMap("LastUpdateEmpid")
        public String lastUpdateEmpid;

        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("PreReviewNumber")
        public Integer preReviewNumber;

        @NameInMap("RealViolationNumber")
        public Integer realViolationNumber;

        @NameInMap("ReviewNumber")
        public Integer reviewNumber;

        @NameInMap("Rid")
        public String rid;

        @NameInMap("Select")
        public Boolean select;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("TypeName")
        public String typeName;

        public static GetTaskRuleListResponseBodyDataRuleCountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTaskRuleListResponseBodyDataRuleCountInfo self = new GetTaskRuleListResponseBodyDataRuleCountInfo();
            return TeaModel.build(map, self);
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setCheckNumber(Integer checkNumber) {
            this.checkNumber = checkNumber;
            return this;
        }
        public Integer getCheckNumber() {
            return this.checkNumber;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setCreateEmpid(String createEmpid) {
            this.createEmpid = createEmpid;
            return this;
        }
        public String getCreateEmpid() {
            return this.createEmpid;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setHitNumber(Integer hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }
        public Integer getHitNumber() {
            return this.hitNumber;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setHitRate(Float hitRate) {
            this.hitRate = hitRate;
            return this;
        }
        public Float getHitRate() {
            return this.hitRate;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setHitRealViolationRate(Float hitRealViolationRate) {
            this.hitRealViolationRate = hitRealViolationRate;
            return this;
        }
        public Float getHitRealViolationRate() {
            return this.hitRealViolationRate;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setLastUpdateEmpid(String lastUpdateEmpid) {
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }
        public String getLastUpdateEmpid() {
            return this.lastUpdateEmpid;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setPreReviewNumber(Integer preReviewNumber) {
            this.preReviewNumber = preReviewNumber;
            return this;
        }
        public Integer getPreReviewNumber() {
            return this.preReviewNumber;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setRealViolationNumber(Integer realViolationNumber) {
            this.realViolationNumber = realViolationNumber;
            return this;
        }
        public Integer getRealViolationNumber() {
            return this.realViolationNumber;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setReviewNumber(Integer reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }
        public Integer getReviewNumber() {
            return this.reviewNumber;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetTaskRuleListResponseBodyDataRuleCountInfo setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class GetTaskRuleListResponseBodyData extends TeaModel {
        @NameInMap("RuleCountInfo")
        public java.util.List<GetTaskRuleListResponseBodyDataRuleCountInfo> ruleCountInfo;

        public static GetTaskRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskRuleListResponseBodyData self = new GetTaskRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskRuleListResponseBodyData setRuleCountInfo(java.util.List<GetTaskRuleListResponseBodyDataRuleCountInfo> ruleCountInfo) {
            this.ruleCountInfo = ruleCountInfo;
            return this;
        }
        public java.util.List<GetTaskRuleListResponseBodyDataRuleCountInfo> getRuleCountInfo() {
            return this.ruleCountInfo;
        }

    }

}
