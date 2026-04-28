// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SystemTag extends TeaModel {
    /**
     * <p>The center value of the tag, which specifies whether the tag is the subject in the image. Valid values: 0 to 1. A value of 0 specifies the lowest proportion. A value of 1 specifies the highest proportion.</p>
     * 
     * <strong>example:</strong>
     * <p>0.877</p>
     */
    @NameInMap("centric_score")
    public Float centricScore;

    /**
     * <p>The confidence level of the tag. Valid values: 0 to 1. A value of 0 specifies the lowest confidence level. A value of 1 specifies the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.98</p>
     */
    @NameInMap("confidence")
    public Float confidence;

    /**
     * <p>The name of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>basketball</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the parent tag of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>sport</p>
     */
    @NameInMap("parent_name")
    public String parentName;

    /**
     * <p>The level of the tag. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("tag_level")
    public Integer tagLevel;

    public static SystemTag build(java.util.Map<String, ?> map) throws Exception {
        SystemTag self = new SystemTag();
        return TeaModel.build(map, self);
    }

    public SystemTag setCentricScore(Float centricScore) {
        this.centricScore = centricScore;
        return this;
    }
    public Float getCentricScore() {
        return this.centricScore;
    }

    public SystemTag setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public SystemTag setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SystemTag setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }
    public String getParentName() {
        return this.parentName;
    }

    public SystemTag setTagLevel(Integer tagLevel) {
        this.tagLevel = tagLevel;
        return this;
    }
    public Integer getTagLevel() {
        return this.tagLevel;
    }

}
