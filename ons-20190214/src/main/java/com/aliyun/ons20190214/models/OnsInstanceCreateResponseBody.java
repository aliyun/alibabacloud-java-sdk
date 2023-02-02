// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceCreateResponseBody extends TeaModel {
    /**
     * <p>The results that are returned.</p>
     */
    @NameInMap("Data")
    public OnsInstanceCreateResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsInstanceCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceCreateResponseBody self = new OnsInstanceCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceCreateResponseBody setData(OnsInstanceCreateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsInstanceCreateResponseBodyData getData() {
        return this.data;
    }

    public OnsInstanceCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsInstanceCreateResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the instance that you created.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The edition of the instance. Valid value:</p>
         * <br>
         * <p>*   **1**: Standard Edition</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        public static OnsInstanceCreateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceCreateResponseBodyData self = new OnsInstanceCreateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsInstanceCreateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsInstanceCreateResponseBodyData setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

    }

}
