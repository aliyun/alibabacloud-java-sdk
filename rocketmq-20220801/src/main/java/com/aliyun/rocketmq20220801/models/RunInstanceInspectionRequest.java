// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class RunInstanceInspectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inspection-request-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;templateCode&quot;:&quot;rmq.traffic-capacity&quot;,&quot;parameters&quot;:{&quot;lookback&quot;:&quot;6h&quot;}}]</p>
     */
    @NameInMap("itemOverrides")
    public java.util.List<RunInstanceInspectionRequestItemOverrides> itemOverrides;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static RunInstanceInspectionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstanceInspectionRequest self = new RunInstanceInspectionRequest();
        return TeaModel.build(map, self);
    }

    public RunInstanceInspectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunInstanceInspectionRequest setItemOverrides(java.util.List<RunInstanceInspectionRequestItemOverrides> itemOverrides) {
        this.itemOverrides = itemOverrides;
        return this;
    }
    public java.util.List<RunInstanceInspectionRequestItemOverrides> getItemOverrides() {
        return this.itemOverrides;
    }

    public RunInstanceInspectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class RunInstanceInspectionRequestItemOverrides extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;lookback&quot;:&quot;30m&quot;}</p>
         */
        @NameInMap("parameters")
        public Object parameters;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq.consumer-health</p>
         */
        @NameInMap("templateCode")
        public String templateCode;

        public static RunInstanceInspectionRequestItemOverrides build(java.util.Map<String, ?> map) throws Exception {
            RunInstanceInspectionRequestItemOverrides self = new RunInstanceInspectionRequestItemOverrides();
            return TeaModel.build(map, self);
        }

        public RunInstanceInspectionRequestItemOverrides setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public RunInstanceInspectionRequestItemOverrides setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
