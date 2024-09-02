// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GenerateMergedTableRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     */
    @NameInMap("body")
    public Schema body;

    /**
     * <p>The specifications of the OpenSearch instance. This parameter is used to check whether the OpenSearch instance meets the special limits on an exclusive instance.</p>
     * <p>Default value: opensearch.share.common.</p>
     * <p>For more information, see the description of the spec field in the Quota topic.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;opensearch.share.common&quot;</p>
     */
    @NameInMap("spec")
    public String spec;

    public static GenerateMergedTableRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateMergedTableRequest self = new GenerateMergedTableRequest();
        return TeaModel.build(map, self);
    }

    public GenerateMergedTableRequest setBody(Schema body) {
        this.body = body;
        return this;
    }
    public Schema getBody() {
        return this.body;
    }

    public GenerateMergedTableRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
