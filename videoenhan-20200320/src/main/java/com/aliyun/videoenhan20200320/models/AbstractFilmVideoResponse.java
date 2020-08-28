// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractFilmVideoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AbstractFilmVideoResponseData data;

    public static AbstractFilmVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        AbstractFilmVideoResponse self = new AbstractFilmVideoResponse();
        return TeaModel.build(map, self);
    }

    public static class AbstractFilmVideoResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static AbstractFilmVideoResponseData build(java.util.Map<String, ?> map) throws Exception {
            AbstractFilmVideoResponseData self = new AbstractFilmVideoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
