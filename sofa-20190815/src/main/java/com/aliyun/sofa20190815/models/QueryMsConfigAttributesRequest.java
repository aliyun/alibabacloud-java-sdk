// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigAttributesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceId")
    public String resourceId;

    public static QueryMsConfigAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigAttributesRequest self = new QueryMsConfigAttributesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigAttributesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryMsConfigAttributesRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public QueryMsConfigAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsConfigAttributesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryMsConfigAttributesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
