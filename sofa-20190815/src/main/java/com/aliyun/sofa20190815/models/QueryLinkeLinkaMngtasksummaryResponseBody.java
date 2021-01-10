// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaMngtasksummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ClassesFileId")
    public String classesFileId;

    @NameInMap("CoverageFileId")
    public String coverageFileId;

    @NameInMap("CreatedAt")
    public Long createdAt;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Group")
    public String group;

    @NameInMap("Id")
    public String id;

    @NameInMap("OnlySummary")
    public Boolean onlySummary;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UpdatedAt")
    public Long updatedAt;

    @NameInMap("SubCoverages")
    public java.util.List<QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages> subCoverages;

    @NameInMap("Summary")
    public QueryLinkeLinkaMngtasksummaryResponseBodySummary summary;

    public static QueryLinkeLinkaMngtasksummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaMngtasksummaryResponseBody self = new QueryLinkeLinkaMngtasksummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setClassesFileId(String classesFileId) {
        this.classesFileId = classesFileId;
        return this;
    }
    public String getClassesFileId() {
        return this.classesFileId;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setCoverageFileId(String coverageFileId) {
        this.coverageFileId = coverageFileId;
        return this;
    }
    public String getCoverageFileId() {
        return this.coverageFileId;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setOnlySummary(Boolean onlySummary) {
        this.onlySummary = onlySummary;
        return this;
    }
    public Boolean getOnlySummary() {
        return this.onlySummary;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setSubCoverages(java.util.List<QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages> subCoverages) {
        this.subCoverages = subCoverages;
        return this;
    }
    public java.util.List<QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages> getSubCoverages() {
        return this.subCoverages;
    }

    public QueryLinkeLinkaMngtasksummaryResponseBody setSummary(QueryLinkeLinkaMngtasksummaryResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public QueryLinkeLinkaMngtasksummaryResponseBodySummary getSummary() {
        return this.summary;
    }

    public static class QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages extends TeaModel {
        @NameInMap("ClassesFileId")
        public String classesFileId;

        @NameInMap("CoverageFileId")
        public String coverageFileId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public String id;

        @NameInMap("OnlySummary")
        public Boolean onlySummary;

        @NameInMap("Reset")
        public Boolean reset;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceKind")
        public String sourceKind;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages self = new QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setClassesFileId(String classesFileId) {
            this.classesFileId = classesFileId;
            return this;
        }
        public String getClassesFileId() {
            return this.classesFileId;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setCoverageFileId(String coverageFileId) {
            this.coverageFileId = coverageFileId;
            return this;
        }
        public String getCoverageFileId() {
            return this.coverageFileId;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setOnlySummary(Boolean onlySummary) {
            this.onlySummary = onlySummary;
            return this;
        }
        public Boolean getOnlySummary() {
            return this.onlySummary;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setReset(Boolean reset) {
            this.reset = reset;
            return this;
        }
        public Boolean getReset() {
            return this.reset;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setSourceKind(String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }
        public String getSourceKind() {
            return this.sourceKind;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySubCoverages setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class QueryLinkeLinkaMngtasksummaryResponseBodySummary extends TeaModel {
        @NameInMap("BranchCovered")
        public Long branchCovered;

        @NameInMap("BranchTotal")
        public Long branchTotal;

        @NameInMap("ClassCovered")
        public Long classCovered;

        @NameInMap("ClassTotal")
        public Long classTotal;

        @NameInMap("CoverageId")
        public String coverageId;

        @NameInMap("CxtyCovered")
        public Long cxtyCovered;

        @NameInMap("CxtyTotal")
        public Long cxtyTotal;

        @NameInMap("Fullname")
        public String fullname;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstrCovered")
        public Long instrCovered;

        @NameInMap("InstrTotal")
        public Long instrTotal;

        @NameInMap("LineCovered")
        public Long lineCovered;

        @NameInMap("LineTotal")
        public Long lineTotal;

        @NameInMap("MethodCovered")
        public Long methodCovered;

        @NameInMap("MethodTotal")
        public Long methodTotal;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Type")
        public String type;

        public static QueryLinkeLinkaMngtasksummaryResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaMngtasksummaryResponseBodySummary self = new QueryLinkeLinkaMngtasksummaryResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setBranchCovered(Long branchCovered) {
            this.branchCovered = branchCovered;
            return this;
        }
        public Long getBranchCovered() {
            return this.branchCovered;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setBranchTotal(Long branchTotal) {
            this.branchTotal = branchTotal;
            return this;
        }
        public Long getBranchTotal() {
            return this.branchTotal;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setClassCovered(Long classCovered) {
            this.classCovered = classCovered;
            return this;
        }
        public Long getClassCovered() {
            return this.classCovered;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setClassTotal(Long classTotal) {
            this.classTotal = classTotal;
            return this;
        }
        public Long getClassTotal() {
            return this.classTotal;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setCoverageId(String coverageId) {
            this.coverageId = coverageId;
            return this;
        }
        public String getCoverageId() {
            return this.coverageId;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setCxtyCovered(Long cxtyCovered) {
            this.cxtyCovered = cxtyCovered;
            return this;
        }
        public Long getCxtyCovered() {
            return this.cxtyCovered;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setCxtyTotal(Long cxtyTotal) {
            this.cxtyTotal = cxtyTotal;
            return this;
        }
        public Long getCxtyTotal() {
            return this.cxtyTotal;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setFullname(String fullname) {
            this.fullname = fullname;
            return this;
        }
        public String getFullname() {
            return this.fullname;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setInstrCovered(Long instrCovered) {
            this.instrCovered = instrCovered;
            return this;
        }
        public Long getInstrCovered() {
            return this.instrCovered;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setInstrTotal(Long instrTotal) {
            this.instrTotal = instrTotal;
            return this;
        }
        public Long getInstrTotal() {
            return this.instrTotal;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setLineCovered(Long lineCovered) {
            this.lineCovered = lineCovered;
            return this;
        }
        public Long getLineCovered() {
            return this.lineCovered;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setLineTotal(Long lineTotal) {
            this.lineTotal = lineTotal;
            return this;
        }
        public Long getLineTotal() {
            return this.lineTotal;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setMethodCovered(Long methodCovered) {
            this.methodCovered = methodCovered;
            return this;
        }
        public Long getMethodCovered() {
            return this.methodCovered;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setMethodTotal(Long methodTotal) {
            this.methodTotal = methodTotal;
            return this;
        }
        public Long getMethodTotal() {
            return this.methodTotal;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryLinkeLinkaMngtasksummaryResponseBodySummary setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
