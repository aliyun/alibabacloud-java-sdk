// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillRequest extends TeaModel {
    /**
     * <p>The ID of the region where the OSS bucket that stores the skill files resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BucketRegionId")
    public String bucketRegionId;

    /**
     * <p>The type of the bucket used for skill files. UserOwned indicates a user-owned bucket. Hosted indicates a hosted bucket. You must have the required permissions to use a hosted bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>UserOwned</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    /**
     * <p>The name of the OSS bucket that resides in the same region as the current project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket-test</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The prefix of the OSS object. The prefix can contain digits and letters and must be 1 to 30 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>steelStorage</p>
     */
    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    /**
     * <p>The ID of the region where the parameter template resides.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclawhub</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The version of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <p>The brief description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>An example for managing PolarDB skills</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The tag details.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;PolarDB\&quot;]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarClawHub</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreatePolarClawSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawSkillRequest self = new CreatePolarClawSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawSkillRequest setBucketRegionId(String bucketRegionId) {
        this.bucketRegionId = bucketRegionId;
        return this;
    }
    public String getBucketRegionId() {
        return this.bucketRegionId;
    }

    public CreatePolarClawSkillRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public CreatePolarClawSkillRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public CreatePolarClawSkillRequest setOSSPrefix(String OSSPrefix) {
        this.OSSPrefix = OSSPrefix;
        return this;
    }
    public String getOSSPrefix() {
        return this.OSSPrefix;
    }

    public CreatePolarClawSkillRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolarClawSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CreatePolarClawSkillRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

    public CreatePolarClawSkillRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public CreatePolarClawSkillRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreatePolarClawSkillRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
