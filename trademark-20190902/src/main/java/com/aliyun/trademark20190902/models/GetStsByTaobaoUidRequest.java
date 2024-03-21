// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetStsByTaobaoUidRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("TbUid")
    public String tbUid;

    public static GetStsByTaobaoUidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsByTaobaoUidRequest self = new GetStsByTaobaoUidRequest();
        return TeaModel.build(map, self);
    }

    public GetStsByTaobaoUidRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public GetStsByTaobaoUidRequest setTbUid(String tbUid) {
        this.tbUid = tbUid;
        return this;
    }
    public String getTbUid() {
        return this.tbUid;
    }

}
