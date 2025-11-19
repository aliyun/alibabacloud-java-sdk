// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateDesktopImageRequest extends TeaModel {
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
    public java.util.List<String> startUpFilePathList;

    public static CreateDesktopImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopImageRequest self = new CreateDesktopImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopImageRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateDesktopImageRequest setAutoCleanUserData(Boolean autoCleanUserData) {
        this.autoCleanUserData = autoCleanUserData;
        return this;
    }
    public Boolean getAutoCleanUserData() {
        return this.autoCleanUserData;
    }

    public CreateDesktopImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDesktopImageRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public CreateDesktopImageRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateDesktopImageRequest setEnableStartUpConfig(Boolean enableStartUpConfig) {
        this.enableStartUpConfig = enableStartUpConfig;
        return this;
    }
    public Boolean getEnableStartUpConfig() {
        return this.enableStartUpConfig;
    }

    public CreateDesktopImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateDesktopImageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateDesktopImageRequest setStartUpFilePathList(java.util.List<String> startUpFilePathList) {
        this.startUpFilePathList = startUpFilePathList;
        return this;
    }
    public java.util.List<String> getStartUpFilePathList() {
        return this.startUpFilePathList;
    }

}
