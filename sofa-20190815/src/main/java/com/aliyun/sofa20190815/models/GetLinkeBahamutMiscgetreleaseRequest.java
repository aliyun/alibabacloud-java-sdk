// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetreleaseRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetLinkeBahamutMiscgetreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetreleaseRequest self = new GetLinkeBahamutMiscgetreleaseRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetreleaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
