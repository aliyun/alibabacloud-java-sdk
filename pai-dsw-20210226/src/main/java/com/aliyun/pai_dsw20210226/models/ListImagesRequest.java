// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
    // 资源类型
    @NameInMap("AcceleratorTypeEquals")
    public String acceleratorTypeEquals;

    // 容器名称关键字
    @NameInMap("ImageNameContains")
    public String imageNameContains;

    // 镜像类型
    @NameInMap("ImageTypeEquals")
    public String imageTypeEquals;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setAcceleratorTypeEquals(String acceleratorTypeEquals) {
        this.acceleratorTypeEquals = acceleratorTypeEquals;
        return this;
    }
    public String getAcceleratorTypeEquals() {
        return this.acceleratorTypeEquals;
    }

    public ListImagesRequest setImageNameContains(String imageNameContains) {
        this.imageNameContains = imageNameContains;
        return this;
    }
    public String getImageNameContains() {
        return this.imageNameContains;
    }

    public ListImagesRequest setImageTypeEquals(String imageTypeEquals) {
        this.imageTypeEquals = imageTypeEquals;
        return this;
    }
    public String getImageTypeEquals() {
        return this.imageTypeEquals;
    }

}
