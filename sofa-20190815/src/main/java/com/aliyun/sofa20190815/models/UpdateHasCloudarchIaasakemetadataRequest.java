// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasCloudarchIaasakemetadataRequest extends TeaModel {
    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    @NameInMap("Name")
    public String name;

    public static UpdateHasCloudarchIaasakemetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasCloudarchIaasakemetadataRequest self = new UpdateHasCloudarchIaasakemetadataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasCloudarchIaasakemetadataRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

    public UpdateHasCloudarchIaasakemetadataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
