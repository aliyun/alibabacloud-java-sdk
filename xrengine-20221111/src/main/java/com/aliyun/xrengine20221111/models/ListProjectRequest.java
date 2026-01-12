// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListProjectRequest extends TeaModel {
    @NameInMap("BizUsage")
    public String bizUsage;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("ExcludedBizUsage")
    public String excludedBizUsage;

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

    @NameInMap("Type")
    public String type;

    @NameInMap("WithSource")
    public Boolean withSource;

    @NameInMap("WithUser")
    public Boolean withUser;

    public static ListProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRequest self = new ListProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRequest setBizUsage(String bizUsage) {
        this.bizUsage = bizUsage;
        return this;
    }
    public String getBizUsage() {
        return this.bizUsage;
    }

    public ListProjectRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListProjectRequest setExcludedBizUsage(String excludedBizUsage) {
        this.excludedBizUsage = excludedBizUsage;
        return this;
    }
    public String getExcludedBizUsage() {
        return this.excludedBizUsage;
    }

    public ListProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListProjectRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListProjectRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListProjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListProjectRequest setWithSource(Boolean withSource) {
        this.withSource = withSource;
        return this;
    }
    public Boolean getWithSource() {
        return this.withSource;
    }

    public ListProjectRequest setWithUser(Boolean withUser) {
        this.withUser = withUser;
        return this;
    }
    public Boolean getWithUser() {
        return this.withUser;
    }

}
