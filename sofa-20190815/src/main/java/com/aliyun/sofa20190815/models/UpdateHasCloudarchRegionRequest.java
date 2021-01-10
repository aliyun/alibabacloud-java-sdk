// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchRegionRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("TheRegionId")
    public String theRegionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasCloudarchRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchRegionRequest self = new UpdateHasCloudarchRegionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchRegionRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasCloudarchRegionRequest setTheRegionId(String theRegionId) {
        this.theRegionId = theRegionId;
        return this;
    }
    public String getTheRegionId() {
        return this.theRegionId;
    }

    public UpdateHasCloudarchRegionRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
