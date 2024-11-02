// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentsJsResponseBody extends TeaModel {
    /**
     * <p>The configuration of the JavaScript file for the component.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;js&quot;: &quot;<a href="https://xxxxx.oss-cn-zhangjiakou.aliyuncs.com/componentUpload/xxxxx">https://xxxxx.oss-cn-zhangjiakou.aliyuncs.com/componentUpload/xxxxx</a>&quot;,
     *         &quot;name&quot;: &quot;python3&quot;,
     *         &quot;ownType&quot;: &quot;sys&quot;
     *     }
     * ]</p>
     */
    @NameInMap("ComponentsJs")
    public String componentsJs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58A518BC-E4A8-5BD7-AFEA-366046ED9073</p>
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
