// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SendLinkeBahamutFlowtasknoticeRequest extends TeaModel {
    @NameInMap("ObjectId")
    public String objectId;

    public static SendLinkeBahamutFlowtasknoticeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLinkeBahamutFlowtasknoticeRequest self = new SendLinkeBahamutFlowtasknoticeRequest();
        return TeaModel.build(map, self);
    }

    public SendLinkeBahamutFlowtasknoticeRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

}
