// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListTextToAvatarProjectRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("Status")
    public String status;

    @NameInMap("Title")
    public String title;

    public static PopListTextToAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListTextToAvatarProjectRequest self = new PopListTextToAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopListTextToAvatarProjectRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListTextToAvatarProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopListTextToAvatarProjectRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListTextToAvatarProjectRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public PopListTextToAvatarProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PopListTextToAvatarProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
