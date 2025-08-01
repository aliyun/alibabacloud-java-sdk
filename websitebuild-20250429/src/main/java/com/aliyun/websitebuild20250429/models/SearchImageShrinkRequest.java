// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SearchImageShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>#B0B0B0</p>
     */
    @NameInMap("ColorHex")
    public String colorHex;

    @NameInMap("HasPerson")
    public Boolean hasPerson;

    /**
     * <strong>example:</strong>
     * <p>WindowsWithMssqlStdLicense</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <strong>example:</strong>
     * <p>16:9</p>
     */
    @NameInMap("ImageRatio")
    public String imageRatio;

    /**
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("MaxHeight")
    public Integer maxHeight;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("MaxWidth")
    public Integer maxWidth;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinHeight")
    public Integer minHeight;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinWidth")
    public Integer minWidth;

    /**
     * <strong>example:</strong>
     * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Osskey。</p>
     * 
     * <strong>example:</strong>
     * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("Text")
    public String text;

    public static SearchImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageShrinkRequest self = new SearchImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageShrinkRequest setColorHex(String colorHex) {
        this.colorHex = colorHex;
        return this;
    }
    public String getColorHex() {
        return this.colorHex;
    }

    public SearchImageShrinkRequest setHasPerson(Boolean hasPerson) {
        this.hasPerson = hasPerson;
        return this;
    }
    public Boolean getHasPerson() {
        return this.hasPerson;
    }

    public SearchImageShrinkRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public SearchImageShrinkRequest setImageRatio(String imageRatio) {
        this.imageRatio = imageRatio;
        return this;
    }
    public String getImageRatio() {
        return this.imageRatio;
    }

    public SearchImageShrinkRequest setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }
    public Integer getMaxHeight() {
        return this.maxHeight;
    }

    public SearchImageShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchImageShrinkRequest setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }
    public Integer getMaxWidth() {
        return this.maxWidth;
    }

    public SearchImageShrinkRequest setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
        return this;
    }
    public Integer getMinHeight() {
        return this.minHeight;
    }

    public SearchImageShrinkRequest setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
        return this;
    }
    public Integer getMinWidth() {
        return this.minWidth;
    }

    public SearchImageShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchImageShrinkRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public SearchImageShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchImageShrinkRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public SearchImageShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
