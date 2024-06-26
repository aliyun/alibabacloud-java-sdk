// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsMysqlDataSourceResponseBody extends TeaModel {
    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("Data")
    public CreateOmsMysqlDataSourceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
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
        /**
         * <p>The ID of the data source record.</p>
         * 
         * <strong>example:</strong>
         * <p>e_1234abcd*****</p>
         */
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
