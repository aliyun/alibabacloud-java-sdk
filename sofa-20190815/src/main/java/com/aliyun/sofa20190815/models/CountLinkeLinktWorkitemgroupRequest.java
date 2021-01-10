// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeLinktWorkitemgroupRequest extends TeaModel {
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

    public static CountLinkeLinktWorkitemgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeLinktWorkitemgroupRequest self = new CountLinkeLinktWorkitemgroupRequest();
        return TeaModel.build(map, self);
    }

    public CountLinkeLinktWorkitemgroupRequest setAssignedToId(String assignedToId) {
        this.assignedToId = assignedToId;
        return this;
    }
    public String getAssignedToId() {
        return this.assignedToId;
    }

    public CountLinkeLinktWorkitemgroupRequest setBegin(Long begin) {
        this.begin = begin;
        return this;
    }
    public Long getBegin() {
        return this.begin;
    }

    public CountLinkeLinktWorkitemgroupRequest setCcsOption(String ccsOption) {
        this.ccsOption = ccsOption;
        return this;
    }
    public String getCcsOption() {
        return this.ccsOption;
    }

    public CountLinkeLinktWorkitemgroupRequest setCreatedAtAfter(Long createdAtAfter) {
        this.createdAtAfter = createdAtAfter;
        return this;
    }
    public Long getCreatedAtAfter() {
        return this.createdAtAfter;
    }

    public CountLinkeLinktWorkitemgroupRequest setCreatedAtBefore(Long createdAtBefore) {
        this.createdAtBefore = createdAtBefore;
        return this;
    }
    public Long getCreatedAtBefore() {
        return this.createdAtBefore;
    }

    public CountLinkeLinktWorkitemgroupRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CountLinkeLinktWorkitemgroupRequest setCustomFieldsSearchFormMap(String customFieldsSearchFormMap) {
        this.customFieldsSearchFormMap = customFieldsSearchFormMap;
        return this;
    }
    public String getCustomFieldsSearchFormMap() {
        return this.customFieldsSearchFormMap;
    }

    public CountLinkeLinktWorkitemgroupRequest setExpectedAtAfter(Long expectedAtAfter) {
        this.expectedAtAfter = expectedAtAfter;
        return this;
    }
    public Long getExpectedAtAfter() {
        return this.expectedAtAfter;
    }

    public CountLinkeLinktWorkitemgroupRequest setExpectedAtBefore(Long expectedAtBefore) {
        this.expectedAtBefore = expectedAtBefore;
        return this;
    }
    public Long getExpectedAtBefore() {
        return this.expectedAtBefore;
    }

    public CountLinkeLinktWorkitemgroupRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public CountLinkeLinktWorkitemgroupRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public CountLinkeLinktWorkitemgroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public CountLinkeLinktWorkitemgroupRequest setLength(Long length) {
        this.length = length;
        return this;
    }
    public Long getLength() {
        return this.length;
    }

    public CountLinkeLinktWorkitemgroupRequest setModuleIdsOption(String moduleIdsOption) {
        this.moduleIdsOption = moduleIdsOption;
        return this;
    }
    public String getModuleIdsOption() {
        return this.moduleIdsOption;
    }

    public CountLinkeLinktWorkitemgroupRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public CountLinkeLinktWorkitemgroupRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public CountLinkeLinktWorkitemgroupRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public CountLinkeLinktWorkitemgroupRequest setParentProjectSign(String parentProjectSign) {
        this.parentProjectSign = parentProjectSign;
        return this;
    }
    public String getParentProjectSign() {
        return this.parentProjectSign;
    }

    public CountLinkeLinktWorkitemgroupRequest setParentSign(String parentSign) {
        this.parentSign = parentSign;
        return this;
    }
    public String getParentSign() {
        return this.parentSign;
    }

    public CountLinkeLinktWorkitemgroupRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CountLinkeLinktWorkitemgroupRequest setRelatedProjectSign(String relatedProjectSign) {
        this.relatedProjectSign = relatedProjectSign;
        return this;
    }
    public String getRelatedProjectSign() {
        return this.relatedProjectSign;
    }

    public CountLinkeLinktWorkitemgroupRequest setRelevantProjectSign(String relevantProjectSign) {
        this.relevantProjectSign = relevantProjectSign;
        return this;
    }
    public String getRelevantProjectSign() {
        return this.relevantProjectSign;
    }

    public CountLinkeLinktWorkitemgroupRequest setRelevantUid(String relevantUid) {
        this.relevantUid = relevantUid;
        return this;
    }
    public String getRelevantUid() {
        return this.relevantUid;
    }

    public CountLinkeLinktWorkitemgroupRequest setRootBegin(Long rootBegin) {
        this.rootBegin = rootBegin;
        return this;
    }
    public Long getRootBegin() {
        return this.rootBegin;
    }

    public CountLinkeLinktWorkitemgroupRequest setRootLength(Long rootLength) {
        this.rootLength = rootLength;
        return this;
    }
    public Long getRootLength() {
        return this.rootLength;
    }

    public CountLinkeLinktWorkitemgroupRequest setShowMode(String showMode) {
        this.showMode = showMode;
        return this;
    }
    public String getShowMode() {
        return this.showMode;
    }

    public CountLinkeLinktWorkitemgroupRequest setSignPathNotLike(String signPathNotLike) {
        this.signPathNotLike = signPathNotLike;
        return this;
    }
    public String getSignPathNotLike() {
        return this.signPathNotLike;
    }

    public CountLinkeLinktWorkitemgroupRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public CountLinkeLinktWorkitemgroupRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public CountLinkeLinktWorkitemgroupRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CountLinkeLinktWorkitemgroupRequest setTagsOption(String tagsOption) {
        this.tagsOption = tagsOption;
        return this;
    }
    public String getTagsOption() {
        return this.tagsOption;
    }

    public CountLinkeLinktWorkitemgroupRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CountLinkeLinktWorkitemgroupRequest setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
        return this;
    }
    public String getTemplateLabel() {
        return this.templateLabel;
    }

    public CountLinkeLinktWorkitemgroupRequest setUpdatedAtAfter(Long updatedAtAfter) {
        this.updatedAtAfter = updatedAtAfter;
        return this;
    }
    public Long getUpdatedAtAfter() {
        return this.updatedAtAfter;
    }

    public CountLinkeLinktWorkitemgroupRequest setUpdatedAtBefore(Long updatedAtBefore) {
        this.updatedAtBefore = updatedAtBefore;
        return this;
    }
    public Long getUpdatedAtBefore() {
        return this.updatedAtBefore;
    }

    public CountLinkeLinktWorkitemgroupRequest setAssignedToIdsRepeatList(java.util.List<String> assignedToIdsRepeatList) {
        this.assignedToIdsRepeatList = assignedToIdsRepeatList;
        return this;
    }
    public java.util.List<String> getAssignedToIdsRepeatList() {
        return this.assignedToIdsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setCcsRepeatList(java.util.List<String> ccsRepeatList) {
        this.ccsRepeatList = ccsRepeatList;
        return this;
    }
    public java.util.List<String> getCcsRepeatList() {
        return this.ccsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setCreatorsRepeatList(java.util.List<String> creatorsRepeatList) {
        this.creatorsRepeatList = creatorsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatorsRepeatList() {
        return this.creatorsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setModuleIdsRepeatList(java.util.List<Integer> moduleIdsRepeatList) {
        this.moduleIdsRepeatList = moduleIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getModuleIdsRepeatList() {
        return this.moduleIdsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setPriorityIdsRepeatList(java.util.List<Integer> priorityIdsRepeatList) {
        this.priorityIdsRepeatList = priorityIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getPriorityIdsRepeatList() {
        return this.priorityIdsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setProjectSignsRepeatList(java.util.List<String> projectSignsRepeatList) {
        this.projectSignsRepeatList = projectSignsRepeatList;
        return this;
    }
    public java.util.List<String> getProjectSignsRepeatList() {
        return this.projectSignsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setSignListRepeatList(java.util.List<String> signListRepeatList) {
        this.signListRepeatList = signListRepeatList;
        return this;
    }
    public java.util.List<String> getSignListRepeatList() {
        return this.signListRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setSignNotInRepeatList(java.util.List<String> signNotInRepeatList) {
        this.signNotInRepeatList = signNotInRepeatList;
        return this;
    }
    public java.util.List<String> getSignNotInRepeatList() {
        return this.signNotInRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setStageListRepeatList(java.util.List<Integer> stageListRepeatList) {
        this.stageListRepeatList = stageListRepeatList;
        return this;
    }
    public java.util.List<Integer> getStageListRepeatList() {
        return this.stageListRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setStampsRepeatList(java.util.List<String> stampsRepeatList) {
        this.stampsRepeatList = stampsRepeatList;
        return this;
    }
    public java.util.List<String> getStampsRepeatList() {
        return this.stampsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setStatusIdsRepeatList(java.util.List<Integer> statusIdsRepeatList) {
        this.statusIdsRepeatList = statusIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getStatusIdsRepeatList() {
        return this.statusIdsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setTagsRepeatList(java.util.List<Integer> tagsRepeatList) {
        this.tagsRepeatList = tagsRepeatList;
        return this;
    }
    public java.util.List<Integer> getTagsRepeatList() {
        return this.tagsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setTemplateIdsRepeatList(java.util.List<Integer> templateIdsRepeatList) {
        this.templateIdsRepeatList = templateIdsRepeatList;
        return this;
    }
    public java.util.List<Integer> getTemplateIdsRepeatList() {
        return this.templateIdsRepeatList;
    }

    public CountLinkeLinktWorkitemgroupRequest setTemplateLabelsRepeatList(java.util.List<String> templateLabelsRepeatList) {
        this.templateLabelsRepeatList = templateLabelsRepeatList;
        return this;
    }
    public java.util.List<String> getTemplateLabelsRepeatList() {
        return this.templateLabelsRepeatList;
    }

}
