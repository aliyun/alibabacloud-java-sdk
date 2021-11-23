// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateRecordIndexFileResponseBody extends TeaModel {
    @NameInMap("Duration")
    public Float duration;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    @NameInMap("Width")
    public Integer width;

    public static CreateRecordIndexFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordIndexFileResponseBody self = new CreateRecordIndexFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecordIndexFileResponseBody setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public CreateRecordIndexFileResponseBody setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateRecordIndexFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRecordIndexFileResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateRecordIndexFileResponseBody setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
