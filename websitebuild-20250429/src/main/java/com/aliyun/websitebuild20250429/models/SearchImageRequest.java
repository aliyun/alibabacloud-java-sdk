// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SearchImageRequest extends TeaModel {
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
    public java.util.List<String> tags;

    @NameInMap("Text")
    public String text;

    public static SearchImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchImageRequest self = new SearchImageRequest();
        return TeaModel.build(map, self);
    }

    public SearchImageRequest setColorHex(String colorHex) {
        this.colorHex = colorHex;
        return this;
    }
    public String getColorHex() {
        return this.colorHex;
    }

    public SearchImageRequest setHasPerson(Boolean hasPerson) {
        this.hasPerson = hasPerson;
        return this;
    }
    public Boolean getHasPerson() {
        return this.hasPerson;
    }

    public SearchImageRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public SearchImageRequest setImageRatio(String imageRatio) {
        this.imageRatio = imageRatio;
        return this;
    }
    public String getImageRatio() {
        return this.imageRatio;
    }

    public SearchImageRequest setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }
    public Integer getMaxHeight() {
        return this.maxHeight;
    }

    public SearchImageRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchImageRequest setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return this;
    }
    public Integer getMaxWidth() {
        return this.maxWidth;
    }

    public SearchImageRequest setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
        return this;
    }
    public Integer getMinHeight() {
        return this.minHeight;
    }

    public SearchImageRequest setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
        return this;
    }
    public Integer getMinWidth() {
        return this.minWidth;
    }

    public SearchImageRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchImageRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public SearchImageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchImageRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public SearchImageRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public SearchImageRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
