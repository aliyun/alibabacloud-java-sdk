// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsResponseBody extends TeaModel {
    /**
     * <p>The list of models.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;SupportResponseSchema\&quot;: False, \&quot;ToolCall\&quot;: False, \&quot;ModelType\&quot;: \&quot;LLM\&quot;, \&quot;SupportReasoning\&quot;: False, \&quot;Model\&quot;: \&quot;ds1\&quot;, \&quot;SupportVision\&quot;: False, \&quot;MaxModelLength\&quot;: 4096}]</p>
     */
    @NameInMap("Models")
    public ModelGalleryModel models;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B6B54325-C98C-5937-87A3-2F96C07652EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of models.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListModelGalleryModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelGalleryModelsResponseBody self = new ListModelGalleryModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelGalleryModelsResponseBody setModels(ModelGalleryModel models) {
        this.models = models;
        return this;
    }
    public ModelGalleryModel getModels() {
        return this.models;
    }

    public ListModelGalleryModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelGalleryModelsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
