// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDimensionResponseBody extends TeaModel {
    @NameInMap("CompSubTaskCount")
    public Integer compSubTaskCount;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ReviewStatus")
    public Integer reviewStatus;

    @NameInMap("DataSize")
    public Integer dataSize;

    @NameInMap("Data")
    public GetRuleDimensionResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalSubTaskCount")
    public Integer totalSubTaskCount;

    public static GetRuleDimensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDimensionResponseBody self = new GetRuleDimensionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleDimensionResponseBody setCompSubTaskCount(Integer compSubTaskCount) {
        this.compSubTaskCount = compSubTaskCount;
        return this;
    }
    public Integer getCompSubTaskCount() {
        return this.compSubTaskCount;
    }

    public GetRuleDimensionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetRuleDimensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleDimensionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleDimensionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRuleDimensionResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetRuleDimensionResponseBody setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }
    public Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public GetRuleDimensionResponseBody setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }
    public Integer getDataSize() {
        return this.dataSize;
    }

    public GetRuleDimensionResponseBody setData(GetRuleDimensionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleDimensionResponseBodyData getData() {
        return this.data;
    }

    public GetRuleDimensionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleDimensionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRuleDimensionResponseBody setTotalSubTaskCount(Integer totalSubTaskCount) {
        this.totalSubTaskCount = totalSubTaskCount;
        return this;
    }
    public Integer getTotalSubTaskCount() {
        return this.totalSubTaskCount;
    }

    public static class GetRuleDimensionResponseBodyDataRuleCountInfo extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("PreReviewNumber")
        public Integer preReviewNumber;

        @NameInMap("HitNumber")
        public Integer hitNumber;

        @NameInMap("Select")
        public Boolean select;

        @NameInMap("CreateEmpid")
        public String createEmpid;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LastUpdateEmpid")
        public String lastUpdateEmpid;

        @NameInMap("RealViolationNumber")
        public Integer realViolationNumber;

        @NameInMap("IsDelete")
        public Integer isDelete;

        @NameInMap("HitRate")
        public Float hitRate;

        @NameInMap("Rid")
        public String rid;

        @NameInMap("CheckNumber")
        public Integer checkNumber;

        @NameInMap("TypeName")
        public String typeName;

        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("HitRealViolationRate")
        public Float hitRealViolationRate;

        @NameInMap("ReviewNumber")
        public Integer reviewNumber;

        public static GetRuleDimensionResponseBodyDataRuleCountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDimensionResponseBodyDataRuleCountInfo self = new GetRuleDimensionResponseBodyDataRuleCountInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setPreReviewNumber(Integer preReviewNumber) {
            this.preReviewNumber = preReviewNumber;
            return this;
        }
        public Integer getPreReviewNumber() {
            return this.preReviewNumber;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setHitNumber(Integer hitNumber) {
            this.hitNumber = hitNumber;
            return this;
        }
        public Integer getHitNumber() {
            return this.hitNumber;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setCreateEmpid(String createEmpid) {
            this.createEmpid = createEmpid;
            return this;
        }
        public String getCreateEmpid() {
            return this.createEmpid;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setLastUpdateEmpid(String lastUpdateEmpid) {
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }
        public String getLastUpdateEmpid() {
            return this.lastUpdateEmpid;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setRealViolationNumber(Integer realViolationNumber) {
            this.realViolationNumber = realViolationNumber;
            return this;
        }
        public Integer getRealViolationNumber() {
            return this.realViolationNumber;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setHitRate(Float hitRate) {
            this.hitRate = hitRate;
            return this;
        }
        public Float getHitRate() {
            return this.hitRate;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setCheckNumber(Integer checkNumber) {
            this.checkNumber = checkNumber;
            return this;
        }
        public Integer getCheckNumber() {
            return this.checkNumber;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setHitRealViolationRate(Float hitRealViolationRate) {
            this.hitRealViolationRate = hitRealViolationRate;
            return this;
        }
        public Float getHitRealViolationRate() {
            return this.hitRealViolationRate;
        }

        public GetRuleDimensionResponseBodyDataRuleCountInfo setReviewNumber(Integer reviewNumber) {
            this.reviewNumber = reviewNumber;
            return this;
        }
        public Integer getReviewNumber() {
            return this.reviewNumber;
        }

    }

    public static class GetRuleDimensionResponseBodyData extends TeaModel {
        @NameInMap("RuleCountInfo")
        public java.util.List<GetRuleDimensionResponseBodyDataRuleCountInfo> ruleCountInfo;

        public static GetRuleDimensionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDimensionResponseBodyData self = new GetRuleDimensionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleDimensionResponseBodyData setRuleCountInfo(java.util.List<GetRuleDimensionResponseBodyDataRuleCountInfo> ruleCountInfo) {
            this.ruleCountInfo = ruleCountInfo;
            return this;
        }
        public java.util.List<GetRuleDimensionResponseBodyDataRuleCountInfo> getRuleCountInfo() {
            return this.ruleCountInfo;
        }

    }

}
