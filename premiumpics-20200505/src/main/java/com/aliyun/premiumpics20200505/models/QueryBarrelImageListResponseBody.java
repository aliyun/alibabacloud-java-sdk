// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class QueryBarrelImageListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("Images")
    public java.util.List<QueryBarrelImageListResponseBodyImages> images;

    @NameInMap("NextId")
    public Integer nextId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBarrelImageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBarrelImageListResponseBody self = new QueryBarrelImageListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBarrelImageListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryBarrelImageListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryBarrelImageListResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public QueryBarrelImageListResponseBody setImages(java.util.List<QueryBarrelImageListResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<QueryBarrelImageListResponseBodyImages> getImages() {
        return this.images;
    }

    public QueryBarrelImageListResponseBody setNextId(Integer nextId) {
        this.nextId = nextId;
        return this;
    }
    public Integer getNextId() {
        return this.nextId;
    }

    public QueryBarrelImageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBarrelImageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBarrelImageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBarrelImageListResponseBodyImagesSpecifications extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Id")
        public Long id;

        /**
         * <p>ID</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Price")
        public String price;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("Width")
        public Integer width;

        public static QueryBarrelImageListResponseBodyImagesSpecifications build(java.util.Map<String, ?> map) throws Exception {
            QueryBarrelImageListResponseBodyImagesSpecifications self = new QueryBarrelImageListResponseBodyImagesSpecifications();
            return TeaModel.build(map, self);
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public QueryBarrelImageListResponseBodyImagesSpecifications setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class QueryBarrelImageListResponseBodyImages extends TeaModel {
        @NameInMap("BigImage")
        public String bigImage;

        @NameInMap("Buy")
        public Boolean buy;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("MidImage")
        public String midImage;

        @NameInMap("SmallImage")
        public String smallImage;

        @NameInMap("Specifications")
        public java.util.List<QueryBarrelImageListResponseBodyImagesSpecifications> specifications;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Title")
        public String title;

        public static QueryBarrelImageListResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            QueryBarrelImageListResponseBodyImages self = new QueryBarrelImageListResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public QueryBarrelImageListResponseBodyImages setBigImage(String bigImage) {
            this.bigImage = bigImage;
            return this;
        }
        public String getBigImage() {
            return this.bigImage;
        }

        public QueryBarrelImageListResponseBodyImages setBuy(Boolean buy) {
            this.buy = buy;
            return this;
        }
        public Boolean getBuy() {
            return this.buy;
        }

        public QueryBarrelImageListResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public QueryBarrelImageListResponseBodyImages setMidImage(String midImage) {
            this.midImage = midImage;
            return this;
        }
        public String getMidImage() {
            return this.midImage;
        }

        public QueryBarrelImageListResponseBodyImages setSmallImage(String smallImage) {
            this.smallImage = smallImage;
            return this;
        }
        public String getSmallImage() {
            return this.smallImage;
        }

        public QueryBarrelImageListResponseBodyImages setSpecifications(java.util.List<QueryBarrelImageListResponseBodyImagesSpecifications> specifications) {
            this.specifications = specifications;
            return this;
        }
        public java.util.List<QueryBarrelImageListResponseBodyImagesSpecifications> getSpecifications() {
            return this.specifications;
        }

        public QueryBarrelImageListResponseBodyImages setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryBarrelImageListResponseBodyImages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
