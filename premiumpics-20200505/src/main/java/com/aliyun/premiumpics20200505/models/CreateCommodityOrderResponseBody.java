// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class CreateCommodityOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCommodityOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommodityOrderResponseBody self = new CreateCommodityOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommodityOrderResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public CreateCommodityOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommodityOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
