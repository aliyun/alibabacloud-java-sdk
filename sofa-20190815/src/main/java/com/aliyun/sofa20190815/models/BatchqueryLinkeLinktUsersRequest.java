// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeLinktUsersRequest extends TeaModel {
    @NameInMap("Uids")
    public String uids;

    public static BatchqueryLinkeLinktUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeLinktUsersRequest self = new BatchqueryLinkeLinktUsersRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeLinktUsersRequest setUids(String uids) {
        this.uids = uids;
        return this;
    }
    public String getUids() {
        return this.uids;
    }

}
