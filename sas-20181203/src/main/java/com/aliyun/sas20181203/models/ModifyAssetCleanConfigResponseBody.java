// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetCleanConfigResponseBody extends TeaModel {
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>952776BD-5546-59FC-8AF3-B54EBAD57***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAssetCleanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetCleanConfigResponseBody self = new ModifyAssetCleanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAssetCleanConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyAssetCleanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
