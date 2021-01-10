// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskUsersRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static ListClriskUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskUsersRequest self = new ListClriskUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskUsersRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
