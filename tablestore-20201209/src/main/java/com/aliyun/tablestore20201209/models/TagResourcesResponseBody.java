// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>44FDC379-4443-560E-B652-9F7476D8854F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
