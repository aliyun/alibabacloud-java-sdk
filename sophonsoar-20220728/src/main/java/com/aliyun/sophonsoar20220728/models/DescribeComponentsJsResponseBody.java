// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentsJsResponseBody extends TeaModel {
    /**
     * <p>The configuration of the JavaScript file for the component.</p>
     */
    @NameInMap("ComponentsJs")
    public String componentsJs;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentsJsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsJsResponseBody self = new DescribeComponentsJsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsJsResponseBody setComponentsJs(String componentsJs) {
        this.componentsJs = componentsJs;
        return this;
    }
    public String getComponentsJs() {
        return this.componentsJs;
    }

    public DescribeComponentsJsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
