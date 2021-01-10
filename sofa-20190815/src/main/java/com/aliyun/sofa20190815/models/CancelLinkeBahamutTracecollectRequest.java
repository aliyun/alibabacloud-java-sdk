// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeBahamutTracecollectRequest extends TeaModel {
    @NameInMap("CollectTraceFormJsonStr")
    public String collectTraceFormJsonStr;

    @NameInMap("Id")
    public String id;

    public static CancelLinkeBahamutTracecollectRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeBahamutTracecollectRequest self = new CancelLinkeBahamutTracecollectRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeBahamutTracecollectRequest setCollectTraceFormJsonStr(String collectTraceFormJsonStr) {
        this.collectTraceFormJsonStr = collectTraceFormJsonStr;
        return this;
    }
    public String getCollectTraceFormJsonStr() {
        return this.collectTraceFormJsonStr;
    }

    public CancelLinkeBahamutTracecollectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
