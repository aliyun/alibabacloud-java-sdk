// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingImagesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>m-9timxhrrgopkec8ju</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListRenderingImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingImagesRequest self = new ListRenderingImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingImagesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListRenderingImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
