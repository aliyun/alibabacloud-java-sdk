// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Count")
    @Validation(required = true)
    public Integer count;

    @NameInMap("IsCompleted")
    @Validation(required = true)
    public Boolean isCompleted;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeVpnSslServerLogsResponseData data;

    public static DescribeVpnSslServerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsResponse self = new DescribeVpnSslServerLogsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpnSslServerLogsResponseData extends TeaModel {
        @NameInMap("Logs")
        @Validation(required = true)
        public java.util.List<String> logs;

        public static DescribeVpnSslServerLogsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnSslServerLogsResponseData self = new DescribeVpnSslServerLogsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
