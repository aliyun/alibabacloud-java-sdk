// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktSearchworkitemRequest extends TeaModel {
    @NameInMap("AssignedToId")
    public String assignedToId;

    @NameInMap("Begin")
    public Long begin;

    @NameInMap("CcsOption")
    public String ccsOption;

    @NameInMap("CreatedAtAfter")
    public Long createdAtAfter;

    @NameInMap("CreatedAtBefore")
    public Long createdAtBefore;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CustomFieldsSearchFormMap")
    public String customFieldsSearchFormMap;

    @NameInMap("ExpectedAtAfter")
    public Long expectedAtAfter;

    @NameInMap("ExpectedAtBefore")
    public Long expectedAtBefore;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Length")
    public Long length;

    @NameInMap("ModuleIdsOption")
    public String moduleIdsOption;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParentProjectSign")
    public String parentProjectSign;

    @NameInMap("ParentSign")
    public String parentSign;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("RelatedProjectSign")
    public String relatedProjectSign;

    @NameInMap("RelevantProjectSign")
    public String relevantProjectSign;

    @NameInMap("RelevantUid")
    public String relevantUid;

    @NameInMap("RootBegin")
    public Long rootBegin;

    @NameInMap("RootLength")
    public Long rootLength;

    @NameInMap("ShowMode")
    public String showMode;

    @NameInMap("SignPathNotLike")
    public String signPathNotLike;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("StatusId")
    public Long statusId;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("TagsOption")
    public String tagsOption;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateLabel")
    public String templateLabel;

    @NameInMap("UpdatedAtAfter")
    public Long updatedAtAfter;

    @NameInMap("UpdatedAtBefore")
    public Long updatedAtBefore;

    @NameInMap("AssignedToIdsRepeatList")
    public java.util.List<String> assignedToIdsRepeatList;

    @NameInMap("CcsRepeatList")
    public java.util.List<String> ccsRepeatList;

    @NameInMap("CreatorsRepeatList")
    public java.util.List<String> creatorsRepeatList;

    @NameInMap("ModuleIdsRepeatList")
    public java.util.List<Integer> moduleIdsRepeatList;

    @NameInMap("PriorityIdsRepeatList")
    public java.util.List<Integer> priorityIdsRepeatList;

    @NameInMap("ProjectSignsRepeatList")
    public java.util.List<String> projectSignsRepeatList;

    @NameInMap("SignListRepeatList")
    public java.util.List<String> signListRepeatList;

    @NameInMap("SignNotInRepeatList")
    public java.util.List<String> signNotInRepeatList;

    @NameInMap("StageListRepeatList")
    public java.util.List<Integer> stageListRepeatList;

    @NameInMap("StampsRepeatList")
    public java.util.List<String> stampsRepeatList;

    @NameInMap("StatusIdsRepeatList")
    public java.util.List<Integer> statusIdsRepeatList;

    @NameInMap("TagsRepeatList")
    public java.util.List<Integer> tagsRepeatList;

    @NameInMap("TemplateIdsRepeatList")
    public java.util.List<Integer> templateIdsRepeatList;

    @NameInMap("TemplateLabelsRepeatList")
    public java.util.List<String> templateLabelsRepeatList;

    public static ExecLinkeLinktSearchworkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktSearchworkitemRequest self = new ExecLinkeLinktSearchworkitemRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktSearchworkitemRequest setAssignedToId(String assignedToId) {
        this.assignedToId = assignedToId;
        return this;
    }
    public String getAssignedToId() {
        return this.assignedToId;
    }

    public ExecLinkeLinktSearchworkitemRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public ExecLinkeLinktSearchworkitemRequest setCcsOption(String ccsOption) {
        this.ccsOption = ccsOption;
        return this;
    }
    public String getCcsOption() {
        return this.ccsOption;
    }

    public ExecLinkeLinktSearchworkitemRequest setCreatedAtAfter(Long createdAtAfter) {
        this.createdAtAfter = createdAtAfter;
        return this;
    }
    public Long getCreatedAtAfter() {
        return this.createdAtAfter;
    }

    public ExecLinkeLinktSearchworkitemRequest setCreatedAtBefore(Long createdAtBefore) {
        this.createdAtBefore = createdAtBefore;
        return this;
    }
    public Long getCreatedAtBefore() {
        return this.createdAtBefore;
    }

    public ExecLinkeLinktSearchworkitemRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ExecLinkeLinktSearchworkitemRequest setCustomFieldsSearchFormMap(String customFieldsSearchFormMap) {
        this.customFieldsSearchFormMap = customFieldsSearchFormMap;
        return this;
    }
    public String getCustomFieldsSearchFormMap() {
        return this.customFieldsSearchFormMap;
    }

    public ExecLinkeLinktSearchworkitemRequest setExpectedAtAfter(Long expectedAtAfter) {
        this.expectedAtAfter = expectedAtAfter;
        return this;
    }
    public Long getExpectedAtAfter() {
        return this.expectedAtAfter;
    }

    public ExecLinkeLinktSearchworkitemRequest setExpectedAtBefore(Long expectedAtBefore) {
        this.expectedAtBefore = expectedAtBefore;
        return this;
    }
    public Long getExpectedAtBefore() {
        return this.expectedAtBefore;
    }

    public ExecLinkeLinktSearchworkitemRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ExecLinkeLinktSearchworkitemRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public ExecLinkeLinktSearchworkitemRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ExecLinkeLinktSearchworkitemRequest setLength(Long length) {
        this.length = length;
        return this;
    }
    public Long getLength() {
        return this.length;
    }

    public ExecLinkeLinktSearchworkitemRequest setModuleIdsOption(String moduleIdsOption) {
        this.moduleIdsOption = moduleIdsOption;
        return this;
    }
    public String getModuleIdsOption() {
        return this.moduleIdsOption;
    }

    public ExecLinkeLinktSearchworkitemRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ExecLinkeLinktSearchworkitemRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ExecLinkeLinktSearchworkitemRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ExecLinkeLinktSearchworkitemRequest setParentProjectSign(String parentProjectSign) {
        this.parentProjectSign = parentProjectSign;
        return this;
    }
    public String getParentProjectSign() {
        return this.parentProjectSign;
    }

    public ExecLinkeLinktSearchworkitemRequest setParentSign(String parentSign) {
        this.parentSign = parentSign;
        return this;
    }
    public String getParentSign() {
        return this.parentSign;
    }

    public ExecLinkeLinktSearchworkitemRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public ExecLinkeLinktSearchworkitemRequest setRelatedProjectSign(String relatedProjectSign) {
        this.relatedProjectSign = relatedProjectSign;
        return this;
    }
    public String getRelatedProjectSign() {
        return this.relatedProjectSign;
    }

    public ExecLinkeLinktSearchworkitemRequest setRelevantProjectSign(String relevantProjectSign) {
        this.relevantProjectSign = relevantProjectSign;
        return this;
    }
    public String getRelevantProjectSign() {
        return this.relevantProjectSign;
    }

    public ExecLinkeLinktSearchworkitemRequest setRelevantUid(String relevantUid) {
        this.relevantUid = relevantUid;
        return this;
    }
    public String getRelevantUid() {
        return this.relevantUid;
    }

    public ExecLinkeLinktSearchworkitemRequest setRootBegin(Long rootBegin) {
        this.rootBegin = rootBegin;
        return this;
    }
    public Long getRootBegin() {
        return this.rootBegin;
    }

    public ExecLinkeLinktSearchworkitemRequest setRootLength(Long rootLength) {
        this.rootLength = rootLength;
        return this;
    }
    public Long getRootLength() {
        return this.rootLength;
    }

    public ExecLinkeLinktSearchworkitemRequest setShowMode(String showMode) {
        this.showMode = showMode;
        return this;
    }
    public String getShowMode() {
        return this.showMode;
    }

    public ExecLinkeLinktSearchworkitemRequest setSignPathNotLike(String signPathNotLike) {
        this.signPathNotLike = signPathNotLike;
        return this;
    }
    public String getSignPathNotLike() {
        return this.signPathNotLike;
    }

    public ExecLinkeLinktSearchworkitemRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public ExecLinkeLinktSearchworkitemRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public ExecLinkeLinktSearchworkitemRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public ExecLinkeLinktSearchworkitemRequest setTagsOption(String tagsOption) {
        this.tagsOption = tagsOption;
        return this;
    }
    public String getTagsOption() {
        return this.tagsOption;
    }

    public ExecLinkeLinktSearchworkitemRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ExecLinkeLinktSearchworkitemRequest setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
        return this;
    }
    public String getTemplateLabel() {
        return this.templateLabel;
    }

    public ExecLinkeLinktSearchworkitemRequest setUpdatedAtAfter(Long updatedAtAfter) {
        this.updatedAtAfter = updatedAtAfter;
        return this;
    }
    public Long getUpdatedAtAfter() {
        return this.updatedAtAfter;
    }

    public ExecLinkeLinktSearchworkitemRequest setUpdatedAtBefore(Long updatedAtBefore) {
        this.updatedAtBefore = updatedAtBefore;
        return this;
    }
    public Long getUpdatedAtBefore() {
        return this.updatedAtBefore;
    }

    public ExecLinkeLinktSearchworkitemRequest setAssignedToIdsRepeatList(java.util.List<String> assignedToIdsRepeatList) {
        this.assignedToIdsRepeatList = assignedToIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAssignedToIdsRepeatList() {
        return this.assignedToIdsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setCcsRepeatList(java.util.List<String> ccsRepeatList) {
        this.ccsRepeatList = ccsRepeatList;
        return this;
    }
    public java.util.List<String> getCcsRepeatList() {
        return this.ccsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setCreatorsRepeatList(java.util.List<String> creatorsRepeatList) {
        this.creatorsRepeatList = creatorsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatorsRepeatList() {
        return this.creatorsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setModuleIdsRepeatList(java.util.List<Integer> moduleIdsRepeatList) {
        this.moduleIdsRepeatList = moduleIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getModuleIdsRepeatList() {
        return this.moduleIdsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setPriorityIdsRepeatList(java.util.List<Integer> priorityIdsRepeatList) {
        this.priorityIdsRepeatList = priorityIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getPriorityIdsRepeatList() {
        return this.priorityIdsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setProjectSignsRepeatList(java.util.List<String> projectSignsRepeatList) {
        this.projectSignsRepeatList = projectSignsRepeatList;
        return this;
    }
    public java.util.List<String> getProjectSignsRepeatList() {
        return this.projectSignsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setSignListRepeatList(java.util.List<String> signListRepeatList) {
        this.signListRepeatList = signListRepeatList;
        return this;
    }
    public java.util.List<String> getSignListRepeatList() {
        return this.signListRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setSignNotInRepeatList(java.util.List<String> signNotInRepeatList) {
        this.signNotInRepeatList = signNotInRepeatList;
        return this;
    }
    public java.util.List<String> getSignNotInRepeatList() {
        return this.signNotInRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setStageListRepeatList(java.util.List<Integer> stageListRepeatList) {
        this.stageListRepeatList = stageListRepeatList;
        return this;
    }
    public java.util.List<Integer> getStageListRepeatList() {
        return this.stageListRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setStampsRepeatList(java.util.List<String> stampsRepeatList) {
        this.stampsRepeatList = stampsRepeatList;
        return this;
    }
    public java.util.List<String> getStampsRepeatList() {
        return this.stampsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setStatusIdsRepeatList(java.util.List<Integer> statusIdsRepeatList) {
        this.statusIdsRepeatList = statusIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getStatusIdsRepeatList() {
        return this.statusIdsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setTagsRepeatList(java.util.List<Integer> tagsRepeatList) {
        this.tagsRepeatList = tagsRepeatList;
        return this;
    }
    public java.util.List<Integer> getTagsRepeatList() {
        return this.tagsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setTemplateIdsRepeatList(java.util.List<Integer> templateIdsRepeatList) {
        this.templateIdsRepeatList = templateIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getTemplateIdsRepeatList() {
        return this.templateIdsRepeatList;
    }

    public ExecLinkeLinktSearchworkitemRequest setTemplateLabelsRepeatList(java.util.List<String> templateLabelsRepeatList) {
        this.templateLabelsRepeatList = templateLabelsRepeatList;
        return this;
    }
    public java.util.List<String> getTemplateLabelsRepeatList() {
        return this.templateLabelsRepeatList;
    }

}
