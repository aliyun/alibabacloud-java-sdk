// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNasesResponseBody extends TeaModel {
    // nas文件系统列表
    @NameInMap("Nases")
    public java.util.List<Nas> nases;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListNasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNasesResponseBody self = new ListNasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNasesResponseBody setNases(java.util.List<Nas> nases) {
        this.nases = nases;
        return this;
    }
    public java.util.List<Nas> getNases() {
        return this.nases;
    }

    public ListNasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
