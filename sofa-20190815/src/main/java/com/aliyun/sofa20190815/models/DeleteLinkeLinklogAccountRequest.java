// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static DeleteLinkeLinklogAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogAccountRequest self = new DeleteLinkeLinklogAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
