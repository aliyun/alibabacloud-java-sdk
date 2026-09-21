// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateCache extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-09-18T10:00:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <strong>example:</strong>
     * <p>sha256:8f3c2a1b</p>
     */
    @NameInMap("imageDigest")
    public String imageDigest;

    /**
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("imageSizeMB")
    public Integer imageSizeMB;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("progress")
    public Integer progress;

    /**
     * <strong>example:</strong>
     * <p>2026-09-18T10:05:00Z</p>
     */
    @NameInMap("readyTime")
    public String readyTime;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>镜像预热任务排队中</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>us7dxqaezw5uu7aa2cm5</p>
     */
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
