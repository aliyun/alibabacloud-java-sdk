// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetFormResponseBody extends TeaModel {
    /**
     * <p>The metadata of the asset in the component. The value is a JSON array and contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: the parameter name.</li>
     * <li><strong>defaultValue</strong>: the default parameter value.</li>
     * <li><strong>description</strong>: the parameter description.</li>
     * <li><strong>required</strong>: indicates whether the parameter is required. Valid values: <strong>true</strong> and <strong>false</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;defaultValue&quot;: &quot;&quot;,
     *         &quot;description&quot;: &quot;assetname&quot;,
     *         &quot;name&quot;: &quot;assetname&quot;,
     *         &quot;required&quot;: true
     *     }
     * ]</p>
     */
    @NameInMap("ComponentAssetForm")
    public String componentAssetForm;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D1651AC-31CC-5CC4-A14E-626B3FCC1022</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentAssetFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetFormResponseBody self = new DescribeComponentAssetFormResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetFormResponseBody setComponentAssetForm(String componentAssetForm) {
        this.componentAssetForm = componentAssetForm;
        return this;
    }
    public String getComponentAssetForm() {
        return this.componentAssetForm;
    }

    public DescribeComponentAssetFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
