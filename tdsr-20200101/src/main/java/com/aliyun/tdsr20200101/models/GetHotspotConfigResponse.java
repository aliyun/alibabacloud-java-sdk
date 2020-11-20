// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrMessage")
    @Validation(required = true)
    public String errMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("ObjectString")
    @Validation(required = true)
    public String objectString;

    public static GetHotspotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotConfigResponse self = new GetHotspotConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetHotspotConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetHotspotConfigResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetHotspotConfigResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHotspotConfigResponse setObjectString(String objectString) {
        this.objectString = objectString;
        return this;
    }
    public String getObjectString() {
        return this.objectString;
    }

}
