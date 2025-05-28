// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ChangeVisibilityModelResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of menus that are successfully modified.</p>
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

    public static ChangeVisibilityModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityModelResponseBody self = new ChangeVisibilityModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeVisibilityModelResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

    public ChangeVisibilityModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
