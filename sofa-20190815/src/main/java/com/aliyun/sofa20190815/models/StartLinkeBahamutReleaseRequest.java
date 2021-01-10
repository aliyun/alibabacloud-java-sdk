// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLinkeBahamutReleaseRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static StartLinkeBahamutReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLinkeBahamutReleaseRequest self = new StartLinkeBahamutReleaseRequest();
        return TeaModel.build(map, self);
    }

    public StartLinkeBahamutReleaseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
