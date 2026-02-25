// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebLogEntry extends TeaModel {
    /**
     * <p>The message returned. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a success message is returned.</li>
     * <li>If the request failed, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    public static WebLogEntry build(java.util.Map<String, ?> map) throws Exception {
        WebLogEntry self = new WebLogEntry();
        return TeaModel.build(map, self);
    }

    public WebLogEntry setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
