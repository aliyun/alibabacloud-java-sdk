// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenTrafficMirrorServiceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information returned after traffic mirroring is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FCCF008-4C13-4231-BE77-D5203801A9E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenTrafficMirrorServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenTrafficMirrorServiceResponseBody self = new OpenTrafficMirrorServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenTrafficMirrorServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenTrafficMirrorServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenTrafficMirrorServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
