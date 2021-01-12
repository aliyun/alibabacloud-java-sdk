// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostImageCategoriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Images")
    public DescribeDedicatedHostImageCategoriesResponseBodyImages images;

    public static DescribeDedicatedHostImageCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostImageCategoriesResponseBody self = new DescribeDedicatedHostImageCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostImageCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostImageCategoriesResponseBody setImages(DescribeDedicatedHostImageCategoriesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeDedicatedHostImageCategoriesResponseBodyImages getImages() {
        return this.images;
    }

    public static class DescribeDedicatedHostImageCategoriesResponseBodyImagesImages extends TeaModel {
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageCode")
        public String imageCode;

        public static DescribeDedicatedHostImageCategoriesResponseBodyImagesImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostImageCategoriesResponseBodyImagesImages self = new DescribeDedicatedHostImageCategoriesResponseBodyImagesImages();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostImageCategoriesResponseBodyImagesImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeDedicatedHostImageCategoriesResponseBodyImagesImages setImageCode(String imageCode) {
            this.imageCode = imageCode;
            return this;
        }
        public String getImageCode() {
            return this.imageCode;
        }

    }

    public static class DescribeDedicatedHostImageCategoriesResponseBodyImages extends TeaModel {
        @NameInMap("Images")
        public java.util.List<DescribeDedicatedHostImageCategoriesResponseBodyImagesImages> images;

        public static DescribeDedicatedHostImageCategoriesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostImageCategoriesResponseBodyImages self = new DescribeDedicatedHostImageCategoriesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostImageCategoriesResponseBodyImages setImages(java.util.List<DescribeDedicatedHostImageCategoriesResponseBodyImagesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<DescribeDedicatedHostImageCategoriesResponseBodyImagesImages> getImages() {
            return this.images;
        }

    }

}
