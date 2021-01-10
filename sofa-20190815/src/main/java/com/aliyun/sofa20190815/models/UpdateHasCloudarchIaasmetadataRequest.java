// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchIaasmetadataRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("IaasId")
    public String iaasId;

    public static UpdateHasCloudarchIaasmetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchIaasmetadataRequest self = new UpdateHasCloudarchIaasmetadataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchIaasmetadataRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasCloudarchIaasmetadataRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchIaasmetadataRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

}
