// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    /**
     * <p>The IDs of the images. The value can be a JSON array that consists of up to 50 image IDs, in the format of `["xxx", "yyy", … "zzz"]`. Separate the image IDs with commas (,).</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   system</p>
     * <p>*   app</p>
     * <p>*   custom</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <p>The region ID of the images. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
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

    public ListImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
