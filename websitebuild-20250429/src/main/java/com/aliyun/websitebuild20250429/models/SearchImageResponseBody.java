// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SearchImageResponseBody extends TeaModel {
    /**
     * <p>Error code. The ErrorCode field is not returned if the request succeeded. If the request failed, the ErrorCode field is returned. For more information, see the error code list in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>error message.</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Image search Result</p>
     */
    @NameInMap("ImageResponse")
    public SearchImageResponseBodyImageResponse imageResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static SearchImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageResponseBody self = new SearchImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchImageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchImageResponseBody setImageResponse(SearchImageResponseBodyImageResponse imageResponse) {
        this.imageResponse = imageResponse;
        return this;
    }
    public SearchImageResponseBodyImageResponse getImageResponse() {
        return this.imageResponse;
    }

    public SearchImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class SearchImageResponseBodyImageResponseImageList extends TeaModel {
        /**
         * <p>Descriptive hues detected in the Image</p>
         * 
         * <strong>example:</strong>
         * <p>冷色调 蓝色</p>
         */
        @NameInMap("DescriptiveTones")
        public String descriptiveTones;

        /**
         * <p>Image height</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Image categorization. Valid values:  </p>
         * <ul>
         * <li>normal: Illustrations or article images.  </li>
         * <li>banner: Background images or image carousels.  </li>
         * <li>goods: Product or service images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("ImageCategory")
        public String imageCategory;

        /**
         * <p>Aspect ratio</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("ImageRatio")
        public String imageRatio;

        /**
         * <p>Image UUID</p>
         * 
         * <strong>example:</strong>
         * <p>70687446-821c-4ebd-9be6-b57dc0a3500a</p>
         */
        @NameInMap("ImageUuid")
        public String imageUuid;

        /**
         * <p>oss key</p>
         * 
         * <strong>example:</strong>
         * <p>1ad5/c728/cb40/2410/e01d/b24c/9acd/7d51/1ad5c728cb402410e01db24c9acd7d51</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <p>Quantized color palette (HEX, LAB) extracted by the algorithm</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;hex&quot;: &quot;#3a3f58&quot;, &quot;rgb&quot;: {&quot;r&quot;: 58, &quot;g&quot;: 63, &quot;b&quot;: 88 }, &quot;lab&quot;: {&quot;l&quot;: 27.81, &quot;a&quot;: 2.95, &quot;b&quot;: -16.52 }, &quot;percentage&quot;: 0.4521 }, {&quot;hex&quot;: &quot;#c8a16a&quot;, &quot;rgb&quot;: {&quot;r&quot;: 200, &quot;g&quot;: 161, &quot;b&quot;: 106 }, &quot;lab&quot;: {&quot;l&quot;: 69.35, &quot;a&quot;: 11.23, &quot;b&quot;: 35.18 }, &quot;percentage&quot;: 0.2355 }, {&quot;hex&quot;: &quot;#f1e8da&quot;, &quot;rgb&quot;: {&quot;r&quot;: 241, &quot;g&quot;: 232, &quot;b&quot;: 218 }, &quot;lab&quot;: {&quot;l&quot;: 93.17, &quot;a&quot;: 1.76, &quot;b&quot;: 7.91 }, &quot;percentage&quot;: 0.1873 } ]</p>
         */
        @NameInMap("QuantitativePalette")
        public String quantitativePalette;

        /**
         * <p>Image tags</p>
         * 
         * <strong>example:</strong>
         * <p>日出、奔跑</p>
         */
        @NameInMap("TagsFromImage")
        public String tagsFromImage;

        /**
         * <p>Temporary access URL of the image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/RollTicket_01.jpeg">https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/RollTicket_01.jpeg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>Image width</p>
         * 
         * <strong>example:</strong>
         * <p>154</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static SearchImageResponseBodyImageResponseImageList build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyImageResponseImageList self = new SearchImageResponseBodyImageResponseImageList();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyImageResponseImageList setDescriptiveTones(String descriptiveTones) {
            this.descriptiveTones = descriptiveTones;
            return this;
        }
        public String getDescriptiveTones() {
            return this.descriptiveTones;
        }

        public SearchImageResponseBodyImageResponseImageList setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SearchImageResponseBodyImageResponseImageList setImageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public String getImageCategory() {
            return this.imageCategory;
        }

        public SearchImageResponseBodyImageResponseImageList setImageRatio(String imageRatio) {
            this.imageRatio = imageRatio;
            return this;
        }
        public String getImageRatio() {
            return this.imageRatio;
        }

        public SearchImageResponseBodyImageResponseImageList setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public SearchImageResponseBodyImageResponseImageList setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public SearchImageResponseBodyImageResponseImageList setQuantitativePalette(String quantitativePalette) {
            this.quantitativePalette = quantitativePalette;
            return this;
        }
        public String getQuantitativePalette() {
            return this.quantitativePalette;
        }

        public SearchImageResponseBodyImageResponseImageList setTagsFromImage(String tagsFromImage) {
            this.tagsFromImage = tagsFromImage;
            return this;
        }
        public String getTagsFromImage() {
            return this.tagsFromImage;
        }

        public SearchImageResponseBodyImageResponseImageList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public SearchImageResponseBodyImageResponseImageList setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class SearchImageResponseBodyImageResponse extends TeaModel {
        /**
         * <p>Image List</p>
         */
        @NameInMap("ImageList")
        public java.util.List<SearchImageResponseBodyImageResponseImageList> imageList;

        /**
         * <p>Number of results per query.</p>
         * <p>Value range: 10–100. Default Value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>Token indicating the start of the next query. It is empty when there is no next query.</p>
         * 
         * <strong>example:</strong>
         * <p>2c6b65b6f9d625d4e2514a628bde8eb2e0b5e8707e68181f</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static SearchImageResponseBodyImageResponse build(java.util.Map<String, ?> map) throws Exception {
            SearchImageResponseBodyImageResponse self = new SearchImageResponseBodyImageResponse();
            return TeaModel.build(map, self);
        }

        public SearchImageResponseBodyImageResponse setImageList(java.util.List<SearchImageResponseBodyImageResponseImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<SearchImageResponseBodyImageResponseImageList> getImageList() {
            return this.imageList;
        }

        public SearchImageResponseBodyImageResponse setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public SearchImageResponseBodyImageResponse setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
