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
     * <li><p><strong>Mini.2</strong>: 2 Mbps</p>
     * </li>
     * <li><p><strong>Mini.5</strong>: 5 Mbps</p>
     * </li>
     * <li><p><strong>Small.1</strong>: 10 Mbps</p>
     * </li>
     * <li><p><strong>Small.2</strong>: 20 Mbps</p>
     * </li>
     * <li><p><strong>Small.5</strong>: 50 Mbps</p>
     * </li>
     * <li><p><strong>Middle.1</strong>: 100 Mbps</p>
     * </li>
     * <li><p><strong>Middle.2</strong>: 200 Mbps</p>
     * </li>
     * <li><p><strong>Middle.5</strong>: 500 Mbps</p>
     * </li>
     * <li><p><strong>Large.1</strong>: 1000 Mbps</p>
     * </li>
     * <li><p><strong>Large.2</strong>: 2000 Mbps</p>
     * </li>
     * <li><p><strong>Large.5</strong>: 5000 Mbps</p>
     * </li>
     * <li><p><strong>Xlarge.1</strong>: 10000 Mbps.</p>
     * </li>
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
