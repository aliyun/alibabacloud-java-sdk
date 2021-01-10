// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountVOJsonStr")
    public String accountVOJsonStr;

    public static UpdateLinkeLinklogAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogAccountRequest self = new UpdateLinkeLinklogAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UpdateLinkeLinklogAccountRequest setAccountVOJsonStr(String accountVOJsonStr) {
        this.accountVOJsonStr = accountVOJsonStr;
        return this;
    }
    public String getAccountVOJsonStr() {
        return this.accountVOJsonStr;
    }

}
