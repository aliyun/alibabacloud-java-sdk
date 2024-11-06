// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppLayoutResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>167466539798442****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>20A6D1E3-1F5F-5440-A4F1-EC7831646FE4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppLayoutResponseBody self = new CreateAppLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public CreateAppLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
