// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListObjectProjectRequest extends TeaModel {
    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("CustomSource")
    public String customSource;

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

    @NameInMap("WithSource")
    public Boolean withSource;

    public static PopListObjectProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListObjectProjectRequest self = new PopListObjectProjectRequest();
        return TeaModel.build(map, self);
    }

    public PopListObjectProjectRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public PopListObjectProjectRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListObjectProjectRequest setCustomSource(String customSource) {
        this.customSource = customSource;
        return this;
    }
    public String getCustomSource() {
        return this.customSource;
    }

    public PopListObjectProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopListObjectProjectRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListObjectProjectRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public PopListObjectProjectRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PopListObjectProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PopListObjectProjectRequest setWithSource(Boolean withSource) {
        this.withSource = withSource;
        return this;
    }
    public Boolean getWithSource() {
        return this.withSource;
    }

}
