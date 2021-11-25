// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    // 镜像详情列表
    @NameInMap("Images")
    public java.util.List<ImageItem> images;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 2
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setImages(java.util.List<ImageItem> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ImageItem> getImages() {
        return this.images;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
