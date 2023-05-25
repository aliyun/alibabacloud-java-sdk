// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsMysqlDataSourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateOmsMysqlDataSourceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOmsMysqlDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsMysqlDataSourceResponseBody self = new CreateOmsMysqlDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOmsMysqlDataSourceResponseBody setData(CreateOmsMysqlDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOmsMysqlDataSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateOmsMysqlDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOmsMysqlDataSourceResponseBodyData extends TeaModel {
        @NameInMap("EndpointId")
        public String endpointId;

        public static CreateOmsMysqlDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsMysqlDataSourceResponseBodyData self = new CreateOmsMysqlDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOmsMysqlDataSourceResponseBodyData setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

}
