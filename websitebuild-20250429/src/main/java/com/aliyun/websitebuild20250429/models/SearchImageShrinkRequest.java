// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SearchImageShrinkRequest extends TeaModel {
    /**
     * <p>The color.</p>
     * 
     * <strong>example:</strong>
     * <p>#B0B0B0</p>
     */
    @NameInMap("ColorHex")
    public String colorHex;

    /**
     * <p>Specifies whether the image contains a person.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasPerson")
    public Boolean hasPerson;

    /**
     * <p>The image category. Valid values:</p>
     * <ul>
     * <li>normal: illustrations or article images.</li>
     * <li>banner: background images or carousel images.</li>
     * <li>goods: product or service images.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WindowsWithMssqlStdLicense</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    /**
     * <p>The aspect ratio of the image. Valid values:
     * &quot;16:9&quot;
     * &quot;4:3&quot;
     * &quot;2:1&quot;
     * &quot;1:1&quot;
     * &quot;3:4&quot;
     * &quot;9:16&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>16:9</p>
     */
    @NameInMap("ImageRatio")
    public String imageRatio;

    /**
     * <p>The maximum height of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("MaxHeight")
    public Integer maxHeight;

    /**
     * <p>The number of entries per page for paging queries. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The maximum width of the image, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("MaxWidth")
    public Integer maxWidth;

    /**
     * <p>The minimum height of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinHeight")
    public Integer minHeight;

    /**
     * <p>The minimum width of the image, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinWidth")
    public Integer minWidth;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous call. You do not need to set this parameter for the first request. If NextToken is specified, the PageSize and PageNumber request parameters do not take effect, and the TotalCount value in the response is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>FFh3Xqm+JgZ/U9Jyb7wdVr9LWk80Tghn5UZjbcWEVEderBcbVF+Y6PS0i8PpCL4PQZ3e0C9oEH0Asd4tJEuGtkl2WuKdiWZpEwadNydQdJPFM=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The OSS key.</p>
     * 
     * <strong>example:</strong>
     * <p>backend/detection/objects/r-0008ujvfksltf5j45n81/task-000hckiuwyau0gwn17vq.jpg</p>
     */
    @NameInMap("OssKey")
    public String ossKey;

    /**
     * <p>The number of returned results. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The start position of the returned results. Valid values: 0 to 499. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Integer start;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The description text used to search for images.</p>
     * <blockquote>
     * <p>Maximum length: 512 characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>卫浴五金产品，表面采用拉丝不锈钢材质，整体色调为现代银灰色，呈现简约且富有质感的风格。产品包括淋浴花洒、水龙头及毛巾架等配件，均具备防锈、耐腐蚀性能，适用于潮湿环境。各部件连接处设计精密，配有隐藏式螺丝结构，提升整体美观度。水龙头和花洒喷头支持多模式出水，把手操作顺滑，符合人体工学设计。所有五金件通过国家节水认证，支持冷热水接入，安装方式为壁挂式。</p>
     */
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
