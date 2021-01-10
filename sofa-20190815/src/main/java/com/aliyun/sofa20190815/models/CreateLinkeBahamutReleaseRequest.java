// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutReleaseRequest extends TeaModel {
    @NameInMap("AoneReleaseId")
    public String aoneReleaseId;

    @NameInMap("AppGroup")
    public String appGroup;

    @NameInMap("MergeDeadline")
    public Long mergeDeadline;

    @NameInMap("MergeStartTime")
    public Long mergeStartTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("PrePubDeadline")
    public Long prePubDeadline;

    @NameInMap("ReleaseDate")
    public Long releaseDate;

    @NameInMap("SubmitDeadline")
    public Long submitDeadline;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ManagersRepeatList")
    public java.util.List<String> managersRepeatList;

    public static CreateLinkeBahamutReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutReleaseRequest self = new CreateLinkeBahamutReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutReleaseRequest setAoneReleaseId(String aoneReleaseId) {
        this.aoneReleaseId = aoneReleaseId;
        return this;
    }
    public String getAoneReleaseId() {
        return this.aoneReleaseId;
    }

    public CreateLinkeBahamutReleaseRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public CreateLinkeBahamutReleaseRequest setMergeDeadline(Long mergeDeadline) {
        this.mergeDeadline = mergeDeadline;
        return this;
    }
    public Long getMergeDeadline() {
        return this.mergeDeadline;
    }

    public CreateLinkeBahamutReleaseRequest setMergeStartTime(Long mergeStartTime) {
        this.mergeStartTime = mergeStartTime;
        return this;
    }
    public Long getMergeStartTime() {
        return this.mergeStartTime;
    }

    public CreateLinkeBahamutReleaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeBahamutReleaseRequest setPrePubDeadline(Long prePubDeadline) {
        this.prePubDeadline = prePubDeadline;
        return this;
    }
    public Long getPrePubDeadline() {
        return this.prePubDeadline;
    }

    public CreateLinkeBahamutReleaseRequest setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }
    public Long getReleaseDate() {
        return this.releaseDate;
    }

    public CreateLinkeBahamutReleaseRequest setSubmitDeadline(Long submitDeadline) {
        this.submitDeadline = submitDeadline;
        return this;
    }
    public Long getSubmitDeadline() {
        return this.submitDeadline;
    }

    public CreateLinkeBahamutReleaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateLinkeBahamutReleaseRequest setManagersRepeatList(java.util.List<String> managersRepeatList) {
        this.managersRepeatList = managersRepeatList;
        return this;
    }
    public java.util.List<String> getManagersRepeatList() {
        return this.managersRepeatList;
    }

}
