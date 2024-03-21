// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAdminTrademarkApplicationLogsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static ListAdminTrademarkApplicationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdminTrademarkApplicationLogsRequest self = new ListAdminTrademarkApplicationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListAdminTrademarkApplicationLogsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
