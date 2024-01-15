// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAnnotationDataSetRequest extends TeaModel {
    /**
     * <p>The data structure of the request.</p>
     */
    @NameInMap("body")
    public MLDataSetParam body;

    /**
     * <p>The unique identifier of the dataset.</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    public static CreateAnnotationDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnotationDataSetRequest self = new CreateAnnotationDataSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnnotationDataSetRequest setBody(MLDataSetParam body) {
        this.body = body;
        return this;
    }
    public MLDataSetParam getBody() {
        return this.body;
    }

    public CreateAnnotationDataSetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

}
