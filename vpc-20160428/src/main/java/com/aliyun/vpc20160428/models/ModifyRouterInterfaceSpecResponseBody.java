// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyRouterInterfaceSpecResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The specification of the router interface. Valid values:</p>
     * <ul>
     * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
     * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
     * <li><strong>Small.1</strong>: 10 Mbit/s</li>
     * <li><strong>Small.2</strong>: 20 Mbit/s</li>
     * <li><strong>Small.5</strong>: 50 Mbit/s</li>
     * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
     * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
     * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
     * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
     * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
     * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
     * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Small.1</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ModifyRouterInterfaceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouterInterfaceSpecResponseBody self = new ModifyRouterInterfaceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRouterInterfaceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRouterInterfaceSpecResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
