// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateStoryRequest extends TeaModel {
    /**
     * <p>The address information.</p>
     */
    @NameInMap("address")
    public Address address;

    /**
     * <p>Custom tags for the story. You can specify a maximum of 20.</p>
     */
    @NameInMap("custom_labels")
    @Deprecated
    public java.util.Map<String, String> customLabels;

    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The maximum number of files to include. Must be ≤ 100 and ≥ min_image_count. Default: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("max_image_count")
    public Long maxImageCount;

    /**
     * <p>The minimum number of files to include. Must be &gt; 0 and ≤ max_image_count. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("min_image_count")
    public Long minImageCount;

    /**
     * <p>The end time for files to be included in the story. The value must be in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-30T16:00:00Z</p>
     */
    @NameInMap("story_end_time")
    public String storyEndTime;

    /**
     * <p>A user-specified ID for the story.</p>
     * 
     * <strong>example:</strong>
     * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
     */
    @NameInMap("story_id")
    public String storyId;

    /**
     * <p>The name for the story, up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Food</p>
     */
    @NameInMap("story_name")
    public String storyName;

    /**
     * <p>The start time for files to be included in the story. The value must be in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-12-30T16:00:00Z</p>
     */
    @NameInMap("story_start_time")
    public String storyStartTime;

    /**
     * <p>The story subtype, which depends on the story_type. For more information, see the list of subtypes below.</p>
     * 
     * <strong>example:</strong>
     * <p>Food</p>
     */
    @NameInMap("story_sub_type")
    public String storySubType;

    /**
     * <p>The story type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TagMemory</p>
     */
    @NameInMap("story_type")
    public String storyType;

    public static CreateStoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryRequest self = new CreateStoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoryRequest setAddress(Address address) {
        this.address = address;
        return this;
    }
    public Address getAddress() {
        return this.address;
    }

    @Deprecated
    public CreateStoryRequest setCustomLabels(java.util.Map<String, String> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    public CreateStoryRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateStoryRequest setMaxImageCount(Long maxImageCount) {
        this.maxImageCount = maxImageCount;
        return this;
    }
    public Long getMaxImageCount() {
        return this.maxImageCount;
    }

    public CreateStoryRequest setMinImageCount(Long minImageCount) {
        this.minImageCount = minImageCount;
        return this;
    }
    public Long getMinImageCount() {
        return this.minImageCount;
    }

    public CreateStoryRequest setStoryEndTime(String storyEndTime) {
        this.storyEndTime = storyEndTime;
        return this;
    }
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    public CreateStoryRequest setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }
    public String getStoryId() {
        return this.storyId;
    }

    public CreateStoryRequest setStoryName(String storyName) {
        this.storyName = storyName;
        return this;
    }
    public String getStoryName() {
        return this.storyName;
    }

    public CreateStoryRequest setStoryStartTime(String storyStartTime) {
        this.storyStartTime = storyStartTime;
        return this;
    }
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    public CreateStoryRequest setStorySubType(String storySubType) {
        this.storySubType = storySubType;
        return this;
    }
    public String getStorySubType() {
        return this.storySubType;
    }

    public CreateStoryRequest setStoryType(String storyType) {
        this.storyType = storyType;
        return this;
    }
    public String getStoryType() {
        return this.storyType;
    }

}
