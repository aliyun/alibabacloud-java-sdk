// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Images")
    public DescribeGatewayImagesResponseBodyImages images;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayImagesResponseBody self = new DescribeGatewayImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayImagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayImagesResponseBody setImages(DescribeGatewayImagesResponseBodyImages images) {
        this.images = images;
        return this;
    }
    public DescribeGatewayImagesResponseBodyImages getImages() {
        return this.images;
    }

    public DescribeGatewayImagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayImagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayImagesResponseBodyImagesImage extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("MD5")
        public String MD5;

        @NameInMap("ModifiedDate")
        public String modifiedDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("Version")
        public String version;

        public static DescribeGatewayImagesResponseBodyImagesImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayImagesResponseBodyImagesImage self = new DescribeGatewayImagesResponseBodyImagesImage();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayImagesResponseBodyImagesImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setMD5(String MD5) {
            this.MD5 = MD5;
            return this;
        }
        public String getMD5() {
            return this.MD5;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeGatewayImagesResponseBodyImagesImage setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeGatewayImagesResponseBodyImages extends TeaModel {
        @NameInMap("Image")
        public java.util.List<DescribeGatewayImagesResponseBodyImagesImage> image;

        public static DescribeGatewayImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayImagesResponseBodyImages self = new DescribeGatewayImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayImagesResponseBodyImages setImage(java.util.List<DescribeGatewayImagesResponseBodyImagesImage> image) {
            this.image = image;
            return this;
        }
        public java.util.List<DescribeGatewayImagesResponseBodyImagesImage> getImage() {
            return this.image;
        }

    }

}
