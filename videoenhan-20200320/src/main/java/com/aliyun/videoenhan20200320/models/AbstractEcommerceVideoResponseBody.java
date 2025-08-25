// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public AbstractEcommerceVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>50B33B81-CCB8-42BC-8A73-AC838618936E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AbstractEcommerceVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoResponseBody self = new AbstractEcommerceVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public AbstractEcommerceVideoResponseBody setData(AbstractEcommerceVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbstractEcommerceVideoResponseBodyData getData() {
        return this.data;
    }

    public AbstractEcommerceVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbstractEcommerceVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AbstractEcommerceVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/shop-video-abs/2020-03-20-19/YVgDynxB.jpg?Expires=1584707249&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=e5Q3O%2ByA6H7UhYJeMZxz4p70de">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/shop-video-abs/2020-03-20-19/YVgDynxB.jpg?Expires=1584707249&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=e5Q3O%2ByA6H7UhYJeMZxz4p70de</a>****</p>
         */
        @NameInMap("VideoCoverUrl")
        public String videoCoverUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/shop-video-abs/2020-03-20-19/YVgDynxB.mp4?Expires=1584707249&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=KErufmbHvTUYYLRj6i42wY7Tew">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/shop-video-abs/2020-03-20-19/YVgDynxB.mp4?Expires=1584707249&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=KErufmbHvTUYYLRj6i42wY7Tew</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AbstractEcommerceVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbstractEcommerceVideoResponseBodyData self = new AbstractEcommerceVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbstractEcommerceVideoResponseBodyData setVideoCoverUrl(String videoCoverUrl) {
            this.videoCoverUrl = videoCoverUrl;
            return this;
        }
        public String getVideoCoverUrl() {
            return this.videoCoverUrl;
        }

        public AbstractEcommerceVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
