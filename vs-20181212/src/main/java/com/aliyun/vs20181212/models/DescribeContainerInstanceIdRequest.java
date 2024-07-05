// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeContainerInstanceIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PodIndex")
    public Integer podIndex;

    public static DescribeContainerInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerInstanceIdRequest self = new DescribeContainerInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerInstanceIdRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeContainerInstanceIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeContainerInstanceIdRequest setPodIndex(Integer podIndex) {
        this.podIndex = podIndex;
        return this;
    }
    public Integer getPodIndex() {
        return this.podIndex;
    }

}
