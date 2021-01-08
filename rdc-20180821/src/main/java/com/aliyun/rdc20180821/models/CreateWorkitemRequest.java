// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class CreateWorkitemRequest extends TeaModel {
    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("Author")
    public String author;

    @NameInMap("AssignedTo")
    public String assignedTo;

    @NameInMap("TemplateId")
    public Integer templateId;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Description")
    public String description;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("AKProjectId")
    public Integer AKProjectId;

    @NameInMap("CfList")
    public String cfList;

    @NameInMap("Verifier")
    public String verifier;

    @NameInMap("PriorityId")
    public Integer priorityId;

    @NameInMap("SeriousLevelId")
    public Integer seriousLevelId;

    @NameInMap("WatcherUsers")
    public String watcherUsers;

    @NameInMap("ModuleIds")
    public String moduleIds;

    public static CreateWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemRequest self = new CreateWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public CreateWorkitemRequest setAuthor(String author) {
        this.author = author;
        return this;
    }
    public String getAuthor() {
        return this.author;
    }

    public CreateWorkitemRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public CreateWorkitemRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public CreateWorkitemRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateWorkitemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkitemRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public CreateWorkitemRequest setAKProjectId(Integer AKProjectId) {
        this.AKProjectId = AKProjectId;
        return this;
    }
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    public CreateWorkitemRequest setCfList(String cfList) {
        this.cfList = cfList;
        return this;
    }
    public String getCfList() {
        return this.cfList;
    }

    public CreateWorkitemRequest setVerifier(String verifier) {
        this.verifier = verifier;
        return this;
    }
    public String getVerifier() {
        return this.verifier;
    }

    public CreateWorkitemRequest setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
        return this;
    }
    public Integer getPriorityId() {
        return this.priorityId;
    }

    public CreateWorkitemRequest setSeriousLevelId(Integer seriousLevelId) {
        this.seriousLevelId = seriousLevelId;
        return this;
    }
    public Integer getSeriousLevelId() {
        return this.seriousLevelId;
    }

    public CreateWorkitemRequest setWatcherUsers(String watcherUsers) {
        this.watcherUsers = watcherUsers;
        return this;
    }
    public String getWatcherUsers() {
        return this.watcherUsers;
    }

    public CreateWorkitemRequest setModuleIds(String moduleIds) {
        this.moduleIds = moduleIds;
        return this;
    }
    public String getModuleIds() {
        return this.moduleIds;
    }

}
