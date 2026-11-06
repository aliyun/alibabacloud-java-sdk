// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarClawSkillRequest extends TeaModel {
    /**
     * <p>The region ID of the OSS bucket that stores the skill files.</p>
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
     * <p>The name of the OSS bucket to be disassociated.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket-test</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The skill name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclawhub</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The skill version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <p>The brief description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>An example used to manage PolarDB skills</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <p>The tag details.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;PolarDB\&quot;,\&quot;programming\&quot;]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarClawHub</p>
     */
    @NameInMap("Title")
    public String title;

    public static CheckPolarClawSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPolarClawSkillRequest self = new CheckPolarClawSkillRequest();
        return TeaModel.build(map, self);
    }

    public CheckPolarClawSkillRequest setBucketRegionId(String bucketRegionId) {
        this.bucketRegionId = bucketRegionId;
        return this;
    }
    public String getBucketRegionId() {
        return this.bucketRegionId;
    }

    public CheckPolarClawSkillRequest setBucketType(String bucketType) {
        this.bucketType = bucketType;
        return this;
    }
    public String getBucketType() {
        return this.bucketType;
    }

    public CheckPolarClawSkillRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public CheckPolarClawSkillRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckPolarClawSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CheckPolarClawSkillRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

    public CheckPolarClawSkillRequest setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public CheckPolarClawSkillRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CheckPolarClawSkillRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
