// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationworkitemRequest extends TeaModel {
    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    @NameInMap("WorkItems")
    public java.util.List<UpdateLinkeBahamutIterationworkitemRequestWorkItems> workItems;

    public static UpdateLinkeBahamutIterationworkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationworkitemRequest self = new UpdateLinkeBahamutIterationworkitemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationworkitemRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

    public UpdateLinkeBahamutIterationworkitemRequest setWorkItems(java.util.List<UpdateLinkeBahamutIterationworkitemRequestWorkItems> workItems) {
        this.workItems = workItems;
        return this;
    }
    public java.util.List<UpdateLinkeBahamutIterationworkitemRequestWorkItems> getWorkItems() {
        return this.workItems;
    }

    public static class UpdateLinkeBahamutIterationworkitemRequestWorkItems extends TeaModel {
        @NameInMap("AcHour")
        public String acHour;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("AssignedToStaffId")
        public String assignedToStaffId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorStaffId")
        public String creatorStaffId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EsHour")
        public String esHour;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("IterationExternalId")
        public String iterationExternalId;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Link")
        public String link;

        @NameInMap("MergeRequestId")
        public String mergeRequestId;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("PriorityId")
        public String priorityId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusId")
        public String statusId;

        @NameInMap("StatusStage")
        public String statusStage;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Sys")
        public String sys;

        @NameInMap("Url")
        public String url;

        public static UpdateLinkeBahamutIterationworkitemRequestWorkItems build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutIterationworkitemRequestWorkItems self = new UpdateLinkeBahamutIterationworkitemRequestWorkItems();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setAcHour(String acHour) {
            this.acHour = acHour;
            return this;
        }
        public String getAcHour() {
            return this.acHour;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setCreatorStaffId(String creatorStaffId) {
            this.creatorStaffId = creatorStaffId;
            return this;
        }
        public String getCreatorStaffId() {
            return this.creatorStaffId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setEsHour(String esHour) {
            this.esHour = esHour;
            return this;
        }
        public String getEsHour() {
            return this.esHour;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setIterationExternalId(String iterationExternalId) {
            this.iterationExternalId = iterationExternalId;
            return this;
        }
        public String getIterationExternalId() {
            return this.iterationExternalId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setMergeRequestId(String mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public String getMergeRequestId() {
            return this.mergeRequestId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setSys(String sys) {
            this.sys = sys;
            return this;
        }
        public String getSys() {
            return this.sys;
        }

        public UpdateLinkeBahamutIterationworkitemRequestWorkItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
