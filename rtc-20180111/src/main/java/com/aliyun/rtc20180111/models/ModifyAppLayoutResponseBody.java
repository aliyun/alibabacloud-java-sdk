// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppLayoutResponseBody extends TeaModel {
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
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppLayoutResponseBody self = new ModifyAppLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public ModifyAppLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
