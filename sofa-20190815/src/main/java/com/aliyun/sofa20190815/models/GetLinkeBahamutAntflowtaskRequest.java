// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAntflowtaskRequest extends TeaModel {
    @NameInMap("ObjectId")
    public String objectId;

    public static GetLinkeBahamutAntflowtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAntflowtaskRequest self = new GetLinkeBahamutAntflowtaskRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAntflowtaskRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

}
