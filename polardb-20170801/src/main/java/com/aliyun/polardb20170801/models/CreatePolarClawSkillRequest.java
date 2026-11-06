// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawSkillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BucketRegionId")
    public String bucketRegionId;

    /**
     * <strong>example:</strong>
     * <p>UserOwned</p>
     */
    @NameInMap("BucketType")
    public String bucketType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket-test</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>steelStorage</p>
     */
    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclawhub</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <strong>example:</strong>
     * <p>用于管理 PolarDB 技能的示例。</p>
     */
    @NameInMap("Summary")
    public String summary;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;PolarDB\&quot;]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
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
