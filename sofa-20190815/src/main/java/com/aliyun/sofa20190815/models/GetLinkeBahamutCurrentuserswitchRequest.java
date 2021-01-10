// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCurrentuserswitchRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutCurrentuserswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCurrentuserswitchRequest self = new GetLinkeBahamutCurrentuserswitchRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCurrentuserswitchRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
