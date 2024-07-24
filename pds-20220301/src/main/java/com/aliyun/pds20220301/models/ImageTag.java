// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImageTag extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("cover_file_category")
    public String coverFileCategory;

    /**
     * <strong>example:</strong>
     * <p>5d79206586bb5dd69fb34c349282718146c55da7</p>
     */
    @NameInMap("cover_file_id")
    public String coverFileId;

    /**
     * <strong>example:</strong>
     * <p>0.736</p>
     */
    @NameInMap("cover_overall_score")
    public Float coverOverallScore;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cover_tag_confidence")
    public Float coverTagConfidence;

    /**
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
     */
    @NameInMap("cover_url")
    public String coverUrl;

    /**
     * <strong>example:</strong>
     * <p>动物</p>
     */
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
