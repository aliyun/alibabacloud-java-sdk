// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeTrademarkDetailForInnerRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("Umid")
    public String umid;

    public static DescribeTrademarkDetailForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrademarkDetailForInnerRequest self = new DescribeTrademarkDetailForInnerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrademarkDetailForInnerRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public DescribeTrademarkDetailForInnerRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

}
