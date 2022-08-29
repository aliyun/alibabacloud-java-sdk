// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageTag extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("cover_file_category")
    public String coverFileCategory;

    @NameInMap("cover_file_id")
    public String coverFileId;

    @NameInMap("cover_overall_score")
    public Float coverOverallScore;

    @NameInMap("cover_tag_confidence")
    public Float coverTagConfidence;

    @NameInMap("cover_url")
    public String coverUrl;

    @NameInMap("name")
    public String name;

    public static ImageTag build(java.util.Map<String, ?> map) throws Exception {
        ImageTag self = new ImageTag();
        return TeaModel.build(map, self);
    }

    public ImageTag setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ImageTag setCoverFileCategory(String coverFileCategory) {
        this.coverFileCategory = coverFileCategory;
        return this;
    }
    public String getCoverFileCategory() {
        return this.coverFileCategory;
    }

    public ImageTag setCoverFileId(String coverFileId) {
        this.coverFileId = coverFileId;
        return this;
    }
    public String getCoverFileId() {
        return this.coverFileId;
    }

    public ImageTag setCoverOverallScore(Float coverOverallScore) {
        this.coverOverallScore = coverOverallScore;
        return this;
    }
    public Float getCoverOverallScore() {
        return this.coverOverallScore;
    }

    public ImageTag setCoverTagConfidence(Float coverTagConfidence) {
        this.coverTagConfidence = coverTagConfidence;
        return this;
    }
    public Float getCoverTagConfidence() {
        return this.coverTagConfidence;
    }

    public ImageTag setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public ImageTag setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
