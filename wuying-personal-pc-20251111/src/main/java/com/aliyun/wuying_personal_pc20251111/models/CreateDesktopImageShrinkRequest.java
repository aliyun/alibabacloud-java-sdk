// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateDesktopImageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("AutoCleanUserData")
    public Boolean autoCleanUserData;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("EnableStartUpConfig")
    public Boolean enableStartUpConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("StartUpFilePathList")
    public String startUpFilePathListShrink;

    public static CreateDesktopImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopImageShrinkRequest self = new CreateDesktopImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopImageShrinkRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateDesktopImageShrinkRequest setAutoCleanUserData(Boolean autoCleanUserData) {
        this.autoCleanUserData = autoCleanUserData;
        return this;
    }
    public Boolean getAutoCleanUserData() {
        return this.autoCleanUserData;
    }

    public CreateDesktopImageShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDesktopImageShrinkRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public CreateDesktopImageShrinkRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateDesktopImageShrinkRequest setEnableStartUpConfig(Boolean enableStartUpConfig) {
        this.enableStartUpConfig = enableStartUpConfig;
        return this;
    }
    public Boolean getEnableStartUpConfig() {
        return this.enableStartUpConfig;
    }

    public CreateDesktopImageShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateDesktopImageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateDesktopImageShrinkRequest setStartUpFilePathListShrink(String startUpFilePathListShrink) {
        this.startUpFilePathListShrink = startUpFilePathListShrink;
        return this;
    }
    public String getStartUpFilePathListShrink() {
        return this.startUpFilePathListShrink;
    }

}
