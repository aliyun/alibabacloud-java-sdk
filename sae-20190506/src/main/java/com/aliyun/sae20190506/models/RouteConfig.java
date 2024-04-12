// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RouteConfig extends TeaModel {
    @NameInMap("routes")
    public java.util.List<PathConfig> routes;

    public static RouteConfig build(java.util.Map<String, ?> map) throws Exception {
        RouteConfig self = new RouteConfig();
        return TeaModel.build(map, self);
    }

    public RouteConfig setRoutes(java.util.List<PathConfig> routes) {
        this.routes = routes;
        return this;
    }
    public java.util.List<PathConfig> getRoutes() {
        return this.routes;
    }

}
