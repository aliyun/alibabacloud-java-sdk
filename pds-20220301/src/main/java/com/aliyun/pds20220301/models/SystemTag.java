// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SystemTag extends TeaModel {
    @NameInMap("centric_score")
    public Float centricScore;

    @NameInMap("confidence")
    public Float confidence;

    @NameInMap("name")
    public String name;

    @NameInMap("parent_name")
    public String parentName;

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
