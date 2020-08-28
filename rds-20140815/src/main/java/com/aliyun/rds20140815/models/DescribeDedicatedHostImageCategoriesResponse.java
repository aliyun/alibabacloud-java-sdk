// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostImageCategoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Images")
    @Validation(required = true)
    public DescribeDedicatedHostImageCategoriesResponseImages images;

    public static DescribeDedicatedHostImageCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostImageCategoriesResponse self = new DescribeDedicatedHostImageCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDedicatedHostImageCategoriesResponseImagesImages extends TeaModel {
        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        @NameInMap("ImageCode")
        @Validation(required = true)
        public String imageCode;

        public static DescribeDedicatedHostImageCategoriesResponseImagesImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostImageCategoriesResponseImagesImages self = new DescribeDedicatedHostImageCategoriesResponseImagesImages();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostImageCategoriesResponseImages extends TeaModel {
        @NameInMap("Images")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostImageCategoriesResponseImagesImages> images;

        public static DescribeDedicatedHostImageCategoriesResponseImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostImageCategoriesResponseImages self = new DescribeDedicatedHostImageCategoriesResponseImages();
            return TeaModel.build(map, self);
        }

    }

}
