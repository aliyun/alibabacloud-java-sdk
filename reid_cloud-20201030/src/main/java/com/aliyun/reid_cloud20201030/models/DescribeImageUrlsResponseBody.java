// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeImageUrlsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Urls")
    public DescribeImageUrlsResponseBodyUrls urls;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeImageUrlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageUrlsResponseBody self = new DescribeImageUrlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageUrlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageUrlsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeImageUrlsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeImageUrlsResponseBody setUrls(DescribeImageUrlsResponseBodyUrls urls) {
        this.urls = urls;
        return this;
    }
    public DescribeImageUrlsResponseBodyUrls getUrls() {
        return this.urls;
    }

    public DescribeImageUrlsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeImageUrlsResponseBodyUrlsImageUrl extends TeaModel {
        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("Url")
        public String url;

        public static DescribeImageUrlsResponseBodyUrlsImageUrl build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageUrlsResponseBodyUrlsImageUrl self = new DescribeImageUrlsResponseBodyUrlsImageUrl();
            return TeaModel.build(map, self);
        }

        public DescribeImageUrlsResponseBodyUrlsImageUrl setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeImageUrlsResponseBodyUrlsImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeImageUrlsResponseBodyUrls extends TeaModel {
        @NameInMap("ImageUrl")
        public java.util.List<DescribeImageUrlsResponseBodyUrlsImageUrl> imageUrl;

        public static DescribeImageUrlsResponseBodyUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageUrlsResponseBodyUrls self = new DescribeImageUrlsResponseBodyUrls();
            return TeaModel.build(map, self);
        }

        public DescribeImageUrlsResponseBodyUrls setImageUrl(java.util.List<DescribeImageUrlsResponseBodyUrlsImageUrl> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public java.util.List<DescribeImageUrlsResponseBodyUrlsImageUrl> getImageUrl() {
            return this.imageUrl;
        }

    }

}
