// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>745F051D-95FD-57EC-9DC1-79BB4883C6A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDefenseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseResourceResponseBody self = new DeleteDefenseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
