// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdateActionResponseBody extends TeaModel {
    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("CreatedDate")
    public String createdDate;

    @NameInMap("Description")
    public String description;

    @NameInMap("Popularity")
    public Integer popularity;

    @NameInMap("Properties")
    public String properties;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static UpdateActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateActionResponseBody self = new UpdateActionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateActionResponseBody setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public UpdateActionResponseBody setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public UpdateActionResponseBody setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }
    public String getCreatedDate() {
        return this.createdDate;
    }

    public UpdateActionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateActionResponseBody setPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }
    public Integer getPopularity() {
        return this.popularity;
    }

    public UpdateActionResponseBody setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public UpdateActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateActionResponseBody setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
