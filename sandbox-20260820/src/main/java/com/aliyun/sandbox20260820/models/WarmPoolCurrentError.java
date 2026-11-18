// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class WarmPoolCurrentError extends TeaModel {
    /**
     * <p>The error code of the current error.</p>
     * 
     * <strong>example:</strong>
     * <p>SourceNotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the current error.</p>
     * 
     * <strong>example:</strong>
     * <p>Source template does not exist</p>
     */
    @NameInMap("message")
    public String message;

    public static WarmPoolCurrentError build(java.util.Map<String, ?> map) throws Exception {
        WarmPoolCurrentError self = new WarmPoolCurrentError();
        return TeaModel.build(map, self);
    }

    public WarmPoolCurrentError setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WarmPoolCurrentError setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
