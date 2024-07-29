// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCategoryCallbackResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartCategoryCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCategoryCallbackResponseBody self = new StartCategoryCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCategoryCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
