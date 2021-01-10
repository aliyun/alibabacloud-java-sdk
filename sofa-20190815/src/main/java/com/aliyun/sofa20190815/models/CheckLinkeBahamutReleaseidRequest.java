// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleaseidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static CheckLinkeBahamutReleaseidRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleaseidRequest self = new CheckLinkeBahamutReleaseidRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleaseidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
