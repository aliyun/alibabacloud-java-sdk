// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SystemTag extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.877</p>
     */
    @NameInMap("centric_score")
    public Float centricScore;

    /**
     * <strong>example:</strong>
     * <p>0.98</p>
     */
    @NameInMap("confidence")
    public Float confidence;

    /**
     * <strong>example:</strong>
     * <p>篮球</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>运动</p>
     */
    @NameInMap("parent_name")
    public String parentName;

    /**
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
