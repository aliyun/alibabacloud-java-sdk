// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class EndpointStatusDetail extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{ 	&quot;slot-j6co2fcd&quot;: {   	&quot;Ip&quot;: &quot;10.0.0.2&quot;, 		&quot;Port&quot;: 7001 	}, 	&quot;slot-asdgys4d&quot;: {   	&quot;Ip&quot;: &quot;10.0.0.3&quot;, 		&quot;Port&quot;: 7002 	} }</p>
     */
    @NameInMap("IpPortMapping")
    public java.util.Map<String, IpPort> ipPortMapping;

    public static EndpointStatusDetail build(java.util.Map<String, ?> map) throws Exception {
        EndpointStatusDetail self = new EndpointStatusDetail();
        return TeaModel.build(map, self);
    }

    public EndpointStatusDetail setIpPortMapping(java.util.Map<String, IpPort> ipPortMapping) {
        this.ipPortMapping = ipPortMapping;
        return this;
    }
    public java.util.Map<String, IpPort> getIpPortMapping() {
        return this.ipPortMapping;
    }

}
