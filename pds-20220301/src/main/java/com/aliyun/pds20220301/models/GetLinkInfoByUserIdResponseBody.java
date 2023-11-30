// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoByUserIdResponseBody extends TeaModel {
    /**
     * <p>The information about the users.</p>
     */
    @NameInMap("items")
    public java.util.List<AccountLinkInfo> items;

    public static GetLinkInfoByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkInfoByUserIdResponseBody self = new GetLinkInfoByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkInfoByUserIdResponseBody setItems(java.util.List<AccountLinkInfo> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AccountLinkInfo> getItems() {
        return this.items;
    }

}
