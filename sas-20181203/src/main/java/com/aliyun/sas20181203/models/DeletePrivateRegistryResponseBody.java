// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeletePrivateRegistryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>818E3B38-F018-50FF-9A85-5A521747****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateRegistryResponseBody self = new DeletePrivateRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateRegistryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeletePrivateRegistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
