// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceCreateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsInstanceCreateResponseBodyData data;

    public static OnsInstanceCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceCreateResponseBody self = new OnsInstanceCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsInstanceCreateResponseBody setData(OnsInstanceCreateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsInstanceCreateResponseBodyData getData() {
        return this.data;
    }

    public static class OnsInstanceCreateResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

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
