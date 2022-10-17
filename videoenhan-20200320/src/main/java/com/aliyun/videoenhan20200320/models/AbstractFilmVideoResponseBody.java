// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoResponseBody extends TeaModel {
    @NameInMap("Data")
    public AbstractFilmVideoResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
