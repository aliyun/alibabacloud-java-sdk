// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetPublishPriceTaskRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Status")
    public Long status;

    @NameInMap("Type")
    public String type;

    public static GetPublishPriceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublishPriceTaskRequest self = new GetPublishPriceTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetPublishPriceTaskRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPublishPriceTaskRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GetPublishPriceTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
