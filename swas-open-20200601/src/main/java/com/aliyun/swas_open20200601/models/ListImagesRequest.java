// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ImageIds")
    public String imageIds;

    @NameInMap("ImageType")
    public String imageType;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListImagesRequest setImageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public String getImageIds() {
        return this.imageIds;
    }

    public ListImagesRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

}
