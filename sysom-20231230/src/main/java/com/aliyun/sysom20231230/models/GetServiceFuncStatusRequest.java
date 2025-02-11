// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetServiceFuncStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("params")
    public GetServiceFuncStatusRequestParams params;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>livetrace</p>
     */
    @NameInMap("service_name")
    public String serviceName;

    public static GetServiceFuncStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceFuncStatusRequest self = new GetServiceFuncStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceFuncStatusRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetServiceFuncStatusRequest setParams(GetServiceFuncStatusRequestParams params) {
        this.params = params;
        return this;
    }
    public GetServiceFuncStatusRequestParams getParams() {
        return this.params;
    }

    public GetServiceFuncStatusRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public static class GetServiceFuncStatusRequestParams extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mullprof</p>
         */
        @NameInMap("function_name")
        public String functionName;

        /**
         * <strong>example:</strong>
         * <p>i-2zei55fwj8nnu31h3z46</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <strong>example:</strong>
         * <p>1338904783509062</p>
         */
        @NameInMap("uid")
        public String uid;

        public static GetServiceFuncStatusRequestParams build(java.util.Map<String, ?> map) throws Exception {
            GetServiceFuncStatusRequestParams self = new GetServiceFuncStatusRequestParams();
            return TeaModel.build(map, self);
        }

        public GetServiceFuncStatusRequestParams setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetServiceFuncStatusRequestParams setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public GetServiceFuncStatusRequestParams setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
