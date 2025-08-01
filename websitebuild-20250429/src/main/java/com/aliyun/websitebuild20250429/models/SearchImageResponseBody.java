// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SearchImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

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
        @NameInMap("DescriptiveTones")
        public String descriptiveTones;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("ImageCategory")
        public String imageCategory;

        @NameInMap("ImageRatio")
        public String imageRatio;

        /**
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

        @NameInMap("QuantitativePalette")
        public String quantitativePalette;

        @NameInMap("TagsFromImage")
        public String tagsFromImage;

        /**
         * <strong>example:</strong>
         * <p><a href="https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/RollTicket_01.jpeg">https://other-general-huadong1.oss-cn-hangzhou.aliyuncs.com/uploadWidget/RollTicket_01.jpeg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
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
        @NameInMap("ImageList")
        public java.util.List<SearchImageResponseBodyImageResponseImageList> imageList;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
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
