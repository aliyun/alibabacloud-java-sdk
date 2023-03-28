// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcPrefixListResponseBody extends TeaModel {
    /**
     * <p>The ID of the prefix list.</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcPrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcPrefixListResponseBody self = new ModifyVpcPrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcPrefixListResponseBody setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public ModifyVpcPrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
