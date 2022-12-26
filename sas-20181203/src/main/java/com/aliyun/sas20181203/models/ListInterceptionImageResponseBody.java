// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInterceptionImageResponseBody extends TeaModel {
    @NameInMap("ImageList")
    public java.util.List<ListInterceptionImageResponseBodyImageList> imageList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInterceptionImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterceptionImageResponseBody self = new ListInterceptionImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterceptionImageResponseBody setImageList(java.util.List<ListInterceptionImageResponseBodyImageList> imageList) {
        this.imageList = imageList;
        return this;
    }
    public java.util.List<ListInterceptionImageResponseBodyImageList> getImageList() {
        return this.imageList;
    }

    public ListInterceptionImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInterceptionImageResponseBodyImageList extends TeaModel {
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageUuid")
        public String imageUuid;

        public static ListInterceptionImageResponseBodyImageList build(java.util.Map<String, ?> map) throws Exception {
            ListInterceptionImageResponseBodyImageList self = new ListInterceptionImageResponseBodyImageList();
            return TeaModel.build(map, self);
        }

        public ListInterceptionImageResponseBodyImageList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInterceptionImageResponseBodyImageList setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

    }

}
