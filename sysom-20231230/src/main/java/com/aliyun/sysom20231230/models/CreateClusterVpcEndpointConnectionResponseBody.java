// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateClusterVpcEndpointConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateClusterVpcEndpointConnectionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateClusterVpcEndpointConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterVpcEndpointConnectionResponseBody self = new CreateClusterVpcEndpointConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterVpcEndpointConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateClusterVpcEndpointConnectionResponseBody setData(CreateClusterVpcEndpointConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateClusterVpcEndpointConnectionResponseBodyData getData() {
        return this.data;
    }

    public CreateClusterVpcEndpointConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateClusterVpcEndpointConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateClusterVpcEndpointConnectionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ep-xxx</p>
         */
        @NameInMap("endpointConnectionId")
        public String endpointConnectionId;

        public static CreateClusterVpcEndpointConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterVpcEndpointConnectionResponseBodyData self = new CreateClusterVpcEndpointConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateClusterVpcEndpointConnectionResponseBodyData setEndpointConnectionId(String endpointConnectionId) {
            this.endpointConnectionId = endpointConnectionId;
            return this;
        }
        public String getEndpointConnectionId() {
            return this.endpointConnectionId;
        }

    }

}
