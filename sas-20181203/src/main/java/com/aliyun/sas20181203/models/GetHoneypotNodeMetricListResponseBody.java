// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotNodeMetricListResponseBody extends TeaModel {
    /**
     * <p>The monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;code&quot;: &quot;200&quot;,
     *     &quot;datapoints&quot;: &quot;[{\&quot;timestamp\&quot;:1698375060000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:67084.0,\&quot;Maximum\&quot;:67084.0,\&quot;Average\&quot;:67084.0},{\&quot;timestamp\&quot;:1698375120000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:63704.0,\&quot;Maximum\&quot;:63704.0,\&quot;Average\&quot;:63704.0},{\&quot;timestamp\&quot;:1698375180000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:67624.0,\&quot;Maximum\&quot;:67624.0,\&quot;Average\&quot;:67624.0},{\&quot;timestamp\&quot;:1698375240000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:68432.0,\&quot;Maximum\&quot;:68432.0,\&quot;Average\&quot;:68432.0},{\&quot;timestamp\&quot;:1698375300000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:70148.0,\&quot;Maximum\&quot;:70148.0,\&quot;Average\&quot;:70148.0},{\&quot;timestamp\&quot;:1698375360000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:63612.0,\&quot;Maximum\&quot;:63612.0,\&quot;Average\&quot;:63612.0},{\&quot;timestamp\&quot;:1698375420000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:68032.0,\&quot;Maximum\&quot;:68032.0,\&quot;Average\&quot;:68032.0},{\&quot;timestamp\&quot;:1698375480000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:67400.0,\&quot;Maximum\&quot;:67400.0,\&quot;Average\&quot;:67400.0},{\&quot;timestamp\&quot;:1698375540000,\&quot;instanceId\&quot;:\&quot;i-bp18jn50nid83nsu****\&quot;,\&quot;ip\&quot;:\&quot;1.1.1.1\&quot;,\&quot;userId\&quot;:\&quot;132776878515****\&quot;,\&quot;Minimum\&quot;:65352.0,\&quot;Maximum\&quot;:65352.0,\&quot;Average\&quot;:65352.0}]&quot;,
     *     &quot;period&quot;: &quot;60&quot;,
     *     &quot;requestId&quot;: &quot;AFE33E4E-70A3-5BAE-AEA8-4D3BF3A75067&quot;,
     *     &quot;success&quot;: true
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>48F523DA-4C7E-5417-B872-E313E5A4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHoneypotNodeMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotNodeMetricListResponseBody self = new GetHoneypotNodeMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotNodeMetricListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHoneypotNodeMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
