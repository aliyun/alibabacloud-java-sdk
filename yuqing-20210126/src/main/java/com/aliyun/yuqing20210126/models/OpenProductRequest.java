// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class OpenProductRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("productInstance")
    public ProductInstance productInstance;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    public static OpenProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenProductRequest self = new OpenProductRequest();
        return TeaModel.build(map, self);
    }

    public OpenProductRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public OpenProductRequest setProductInstance(ProductInstance productInstance) {
        this.productInstance = productInstance;
        return this;
    }
    public ProductInstance getProductInstance() {
        return this.productInstance;
    }

    public OpenProductRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenProductRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
