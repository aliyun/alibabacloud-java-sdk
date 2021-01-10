// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminsecretdicRequest extends TeaModel {
    @NameInMap("UniqueKey")
    public String uniqueKey;

    public static DeleteLinkeBahamutAdminsecretdicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminsecretdicRequest self = new DeleteLinkeBahamutAdminsecretdicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminsecretdicRequest setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }
    public String getUniqueKey() {
        return this.uniqueKey;
    }

}
