// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class ListModelGalleryModelsResponseBody extends TeaModel {
    @NameInMap("Models")
    public ModelGalleryModel models;

    @NameInMap("RequestId")
    public String requestId;

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
