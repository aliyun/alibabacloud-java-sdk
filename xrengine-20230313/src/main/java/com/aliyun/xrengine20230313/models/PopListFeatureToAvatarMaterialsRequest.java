// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListFeatureToAvatarMaterialsRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("ListStatus")
    public String listStatus;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Tags")
    public String tags;

    public static PopListFeatureToAvatarMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListFeatureToAvatarMaterialsRequest self = new PopListFeatureToAvatarMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public PopListFeatureToAvatarMaterialsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListFeatureToAvatarMaterialsRequest setListStatus(String listStatus) {
        this.listStatus = listStatus;
        return this;
    }
    public String getListStatus() {
        return this.listStatus;
    }

    public PopListFeatureToAvatarMaterialsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListFeatureToAvatarMaterialsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
