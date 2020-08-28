// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClusterGrafanaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Dashboards")
    @Validation(required = true)
    public java.util.List<DescribeClusterGrafanaResponseDashboards> dashboards;

    public static DescribeClusterGrafanaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterGrafanaResponse self = new DescribeClusterGrafanaResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeClusterGrafanaResponseDashboards extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        public static DescribeClusterGrafanaResponseDashboards build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterGrafanaResponseDashboards self = new DescribeClusterGrafanaResponseDashboards();
            return TeaModel.build(map, self);
        }

    }

}
