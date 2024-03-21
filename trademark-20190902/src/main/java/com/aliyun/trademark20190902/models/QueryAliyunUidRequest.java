// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryAliyunUidRequest extends TeaModel {
    @NameInMap("TbUid")
    public String tbUid;

    public static QueryAliyunUidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAliyunUidRequest self = new QueryAliyunUidRequest();
        return TeaModel.build(map, self);
    }

    public QueryAliyunUidRequest setTbUid(String tbUid) {
        this.tbUid = tbUid;
        return this;
    }
    public String getTbUid() {
        return this.tbUid;
    }

}
