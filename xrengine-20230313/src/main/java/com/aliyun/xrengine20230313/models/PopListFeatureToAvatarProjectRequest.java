// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListFeatureToAvatarProjectRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("Status")
    public String status;

    @NameInMap("Title")
    public String title;

    public static PopListFeatureToAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListFeatureToAvatarProjectRequest self = new PopListFeatureToAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopListFeatureToAvatarProjectRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListFeatureToAvatarProjectRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListFeatureToAvatarProjectRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public PopListFeatureToAvatarProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PopListFeatureToAvatarProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
