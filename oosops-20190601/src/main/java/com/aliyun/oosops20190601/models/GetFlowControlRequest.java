// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetFlowControlRequest extends TeaModel {
    @NameInMap("Api")
    public String api;

    @NameInMap("Service")
    public String service;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public Integer type;

    @NameInMap("Uid")
    public String uid;

    public static GetFlowControlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFlowControlRequest self = new GetFlowControlRequest();
        return TeaModel.build(map, self);
    }

    public GetFlowControlRequest setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public GetFlowControlRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public GetFlowControlRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public GetFlowControlRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
