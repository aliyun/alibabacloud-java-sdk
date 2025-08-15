// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class CreateOssScanConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>5DFD6277-CC36-57F7-ACE6-F5952123****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOssScanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssScanConfigResponseBody self = new CreateOssScanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssScanConfigResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOssScanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
