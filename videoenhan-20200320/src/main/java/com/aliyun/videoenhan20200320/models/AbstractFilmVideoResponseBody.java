// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public AbstractFilmVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9A5B872B-1BF0-4D84-90DA-A2EE1F072B82</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AbstractFilmVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbstractFilmVideoResponseBody self = new AbstractFilmVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public AbstractFilmVideoResponseBody setData(AbstractFilmVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbstractFilmVideoResponseBodyData getData() {
        return this.data;
    }

    public AbstractFilmVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AbstractFilmVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AbstractFilmVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/film-summary/EA61D012-5F89-4102-931E-419158BE2ADA_gb27k00.mp4?Expires=1584707613&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=weTexlBR1wmQlAhuU2JXaE7AyJ">http://algo-app-aic-vd-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/film-summary/EA61D012-5F89-4102-931E-419158BE2ADA_gb27k00.mp4?Expires=1584707613&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=weTexlBR1wmQlAhuU2JXaE7AyJ</a>****</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AbstractFilmVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbstractFilmVideoResponseBodyData self = new AbstractFilmVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbstractFilmVideoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
