// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCurrentuserswitchbooleanRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutCurrentuserswitchbooleanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCurrentuserswitchbooleanRequest self = new GetLinkeBahamutCurrentuserswitchbooleanRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCurrentuserswitchbooleanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
