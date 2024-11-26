// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class ListClusterImagesRequest extends TeaModel {
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("image_hash")
    public String imageHash;

    @NameInMap("image_name")
    public String imageName;

    @NameInMap("page_no")
    public Integer pageNo;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("uid")
    public String uid;

    public static ListClusterImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterImagesRequest self = new ListClusterImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterImagesRequest setImageHash(String imageHash) {
        this.imageHash = imageHash;
        return this;
    }
    public String getImageHash() {
        return this.imageHash;
    }

    public ListClusterImagesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListClusterImagesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListClusterImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterImagesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
