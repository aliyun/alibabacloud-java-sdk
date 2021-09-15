// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishHotspotResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrMessage")
    public String errMessage;

    public static PublishHotspotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishHotspotResponseBody self = new PublishHotspotResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishHotspotResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public PublishHotspotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishHotspotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PublishHotspotResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

}
