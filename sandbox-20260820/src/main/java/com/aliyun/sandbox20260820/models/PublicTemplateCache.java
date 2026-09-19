// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateCache extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("imageDigest")
    public String imageDigest;

    @NameInMap("imageSizeMB")
    public Integer imageSizeMB;

    @NameInMap("progress")
    public Integer progress;

    @NameInMap("readyTime")
    public String readyTime;

    @NameInMap("status")
    public String status;

    @NameInMap("statusReason")
    public String statusReason;

    @NameInMap("teamID")
    public String teamID;

    @NameInMap("templateID")
    public String templateID;

    public static PublicTemplateCache build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateCache self = new PublicTemplateCache();
        return TeaModel.build(map, self);
    }

    public PublicTemplateCache setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PublicTemplateCache setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public PublicTemplateCache setImageSizeMB(Integer imageSizeMB) {
        this.imageSizeMB = imageSizeMB;
        return this;
    }
    public Integer getImageSizeMB() {
        return this.imageSizeMB;
    }

    public PublicTemplateCache setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public PublicTemplateCache setReadyTime(String readyTime) {
        this.readyTime = readyTime;
        return this;
    }
    public String getReadyTime() {
        return this.readyTime;
    }

    public PublicTemplateCache setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PublicTemplateCache setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public PublicTemplateCache setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public PublicTemplateCache setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
