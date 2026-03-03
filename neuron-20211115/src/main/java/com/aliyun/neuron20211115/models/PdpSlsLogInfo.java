// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpSlsLogInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://sls.console.aliyun.com/lognext/project/k8s-log-c42539518786e49fbb390929599dec9fa/logsearch/yunmall-customer112production">https://sls.console.aliyun.com/lognext/project/k8s-log-c42539518786e49fbb390929599dec9fa/logsearch/yunmall-customer112production</a></p>
     */
    @NameInMap("slsUrl")
    public String slsUrl;

    public static PdpSlsLogInfo build(java.util.Map<String, ?> map) throws Exception {
        PdpSlsLogInfo self = new PdpSlsLogInfo();
        return TeaModel.build(map, self);
    }

    public PdpSlsLogInfo setSlsUrl(String slsUrl) {
        this.slsUrl = slsUrl;
        return this;
    }
    public String getSlsUrl() {
        return this.slsUrl;
    }

}
