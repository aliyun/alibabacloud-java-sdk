// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterAttributeRequest extends TeaModel {
    @NameInMap("param")
    public UpdateClusterAttributeParam param;

    public static UpdateClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAttributeRequest self = new UpdateClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAttributeRequest setParam(UpdateClusterAttributeParam param) {
        this.param = param;
        return this;
    }
    public UpdateClusterAttributeParam getParam() {
        return this.param;
    }

}
