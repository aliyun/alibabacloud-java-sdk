// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebWAFConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable Web Application Firewall (WAF). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables WAF.</li>
     * <li><strong>false</strong>: disables WAF.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWAF")
    public Boolean enableWAF;

    public static WebWAFConfig build(java.util.Map<String, ?> map) throws Exception {
        WebWAFConfig self = new WebWAFConfig();
        return TeaModel.build(map, self);
    }

    public WebWAFConfig setEnableWAF(Boolean enableWAF) {
        this.enableWAF = enableWAF;
        return this;
    }
    public Boolean getEnableWAF() {
        return this.enableWAF;
    }

}
