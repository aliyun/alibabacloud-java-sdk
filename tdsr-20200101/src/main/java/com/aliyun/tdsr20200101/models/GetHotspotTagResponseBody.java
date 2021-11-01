// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotTagResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ObjectString")
    public String objectString;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHotspotTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotTagResponseBody self = new GetHotspotTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotTagResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHotspotTagResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetHotspotTagResponseBody setObjectString(String objectString) {
        this.objectString = objectString;
        return this;
    }
    public String getObjectString() {
        return this.objectString;
    }

    public GetHotspotTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
