// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestatusRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static CheckLinkeBahamutReleasestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestatusRequest self = new CheckLinkeBahamutReleasestatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
