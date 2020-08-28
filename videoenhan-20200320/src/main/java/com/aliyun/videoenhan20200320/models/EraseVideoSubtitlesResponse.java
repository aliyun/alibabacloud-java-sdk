// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoSubtitlesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EraseVideoSubtitlesResponseData data;

    public static EraseVideoSubtitlesResponse build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoSubtitlesResponse self = new EraseVideoSubtitlesResponse();
        return TeaModel.build(map, self);
    }

    public static class EraseVideoSubtitlesResponseData extends TeaModel {
        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static EraseVideoSubtitlesResponseData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoSubtitlesResponseData self = new EraseVideoSubtitlesResponseData();
            return TeaModel.build(map, self);
        }

    }

}
