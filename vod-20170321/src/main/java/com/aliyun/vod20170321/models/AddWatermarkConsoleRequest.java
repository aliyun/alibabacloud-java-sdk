// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkConsoleRequest extends TeaModel {
    @NameInMap("Active")
    public String active;

    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Height")
    public String height;

    @NameInMap("HorizontalOffet")
    public String horizontalOffet;

    @NameInMap("HorizontalOffset")
    public String horizontalOffset;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Object")
    public String object;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Position")
    public String position;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("ScreenMode")
    public String screenMode;

    @NameInMap("Type")
    public String type;

    @NameInMap("VerticalOffset")
    public String verticalOffset;

    @NameInMap("VideoHeight")
    public Integer videoHeight;

    @NameInMap("VideoWidth")
    public Integer videoWidth;

    @NameInMap("WatermarkConfig")
    public String watermarkConfig;

    @NameInMap("Width")
    public String width;

    public static AddWatermarkConsoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkConsoleRequest self = new AddWatermarkConsoleRequest();
        return TeaModel.build(map, self);
    }

    public AddWatermarkConsoleRequest setActive(String active) {
        this.active = active;
        return this;
    }
    public String getActive() {
        return this.active;
    }

    public AddWatermarkConsoleRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AddWatermarkConsoleRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AddWatermarkConsoleRequest setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public AddWatermarkConsoleRequest setHorizontalOffet(String horizontalOffet) {
        this.horizontalOffet = horizontalOffet;
        return this;
    }
    public String getHorizontalOffet() {
        return this.horizontalOffet;
    }

    public AddWatermarkConsoleRequest setHorizontalOffset(String horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
        return this;
    }
    public String getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public AddWatermarkConsoleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWatermarkConsoleRequest setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public AddWatermarkConsoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddWatermarkConsoleRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public AddWatermarkConsoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddWatermarkConsoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddWatermarkConsoleRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public AddWatermarkConsoleRequest setScreenMode(String screenMode) {
        this.screenMode = screenMode;
        return this;
    }
    public String getScreenMode() {
        return this.screenMode;
    }

    public AddWatermarkConsoleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddWatermarkConsoleRequest setVerticalOffset(String verticalOffset) {
        this.verticalOffset = verticalOffset;
        return this;
    }
    public String getVerticalOffset() {
        return this.verticalOffset;
    }

    public AddWatermarkConsoleRequest setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }
    public Integer getVideoHeight() {
        return this.videoHeight;
    }

    public AddWatermarkConsoleRequest setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }
    public Integer getVideoWidth() {
        return this.videoWidth;
    }

    public AddWatermarkConsoleRequest setWatermarkConfig(String watermarkConfig) {
        this.watermarkConfig = watermarkConfig;
        return this;
    }
    public String getWatermarkConfig() {
        return this.watermarkConfig;
    }

    public AddWatermarkConsoleRequest setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

}
