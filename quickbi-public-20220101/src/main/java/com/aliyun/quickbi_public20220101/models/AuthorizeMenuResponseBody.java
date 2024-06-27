// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AuthorizeMenuResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>188F0B12-00EF-41B3-944A-FB7EF06C9F43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of authorized menus.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Result")
    public Integer result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AuthorizeMenuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeMenuResponseBody self = new AuthorizeMenuResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthorizeMenuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeMenuResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public AuthorizeMenuResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
