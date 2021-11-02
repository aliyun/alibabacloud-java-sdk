// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateCalculationRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CloudCodeUserId")
    public String cloudCodeUserId;

    @NameInMap("QueryString")
    public String queryString;

    public static CreateCalculationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCalculationRequest self = new CreateCalculationRequest();
        return TeaModel.build(map, self);
    }

    public CreateCalculationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCalculationRequest setCloudCodeUserId(String cloudCodeUserId) {
        this.cloudCodeUserId = cloudCodeUserId;
        return this;
    }
    public String getCloudCodeUserId() {
        return this.cloudCodeUserId;
    }

    public CreateCalculationRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

}
