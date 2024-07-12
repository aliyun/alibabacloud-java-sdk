// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetModelFeatureFGInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;features&quot;: [{&quot;feature_name&quot;: &quot;item_id&quot;,&quot;feature_type&quot;: &quot;id_feature&quot;,&quot;value_type&quot;: &quot;String&quot;,&quot;expression&quot;: &quot;item:item_id&quot;,&quot;default_value&quot;: &quot;-1024&quot;,&quot;combiner&quot;: &quot;mean&quot;,&quot;need_prefix&quot;: false},{&quot;feature_name&quot;: &quot;f1&quot;,&quot;feature_type&quot;: &quot;lookup_feature&quot;,&quot;value_type&quot;: &quot;Integer&quot;,&quot;map&quot;: &quot;item:f1&quot;,&quot;key&quot;: &quot;user:1&quot;,&quot;default_value&quot;: &quot;0&quot;,&quot;combiner&quot;: &quot;mean&quot;,&quot;need_prefix&quot;: false,&quot;needDiscrete&quot;: false,&quot;needWeighting&quot;: false,&quot;needKey&quot;: false}],&quot;reserves&quot;: [&quot;f1&quot;]}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>6B662A64-E4BF-56F8-BF5F-4C63F34EC0A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetModelFeatureFGInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelFeatureFGInfoResponseBody self = new GetModelFeatureFGInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelFeatureFGInfoResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetModelFeatureFGInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
