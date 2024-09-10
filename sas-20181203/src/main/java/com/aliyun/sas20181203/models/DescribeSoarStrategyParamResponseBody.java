// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyParamResponseBody extends TeaModel {
    /**
     * <p>The parameters of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;summary&quot;:[{&quot;name&quot;:&quot;email&quot;,&quot;type&quot;:&quot;String&quot;,&quot;isRequired&quot;:false,&quot;fromProperty&quot;:&quot;notifyConfig.email&quot;}]}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The process information of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;edges&quot;:[{&quot;level&quot;:0,&quot;removeFlag&quot;:0,&quot;source&quot;:1,&quot;target&quot;:8}]}</p>
     */
    @NameInMap("ProcessInfo")
    public String processInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSoarStrategyParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyParamResponseBody self = new DescribeSoarStrategyParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyParamResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeSoarStrategyParamResponseBody setProcessInfo(String processInfo) {
        this.processInfo = processInfo;
        return this;
    }
    public String getProcessInfo() {
        return this.processInfo;
    }

    public DescribeSoarStrategyParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
