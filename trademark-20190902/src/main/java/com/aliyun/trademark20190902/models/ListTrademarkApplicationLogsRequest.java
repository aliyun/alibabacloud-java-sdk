// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkApplicationLogsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static ListTrademarkApplicationLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkApplicationLogsRequest self = new ListTrademarkApplicationLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrademarkApplicationLogsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
