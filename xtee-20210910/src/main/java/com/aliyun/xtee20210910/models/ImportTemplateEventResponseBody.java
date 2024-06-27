// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportTemplateEventResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public Boolean data;

    public static ImportTemplateEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportTemplateEventResponseBody self = new ImportTemplateEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportTemplateEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportTemplateEventResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
