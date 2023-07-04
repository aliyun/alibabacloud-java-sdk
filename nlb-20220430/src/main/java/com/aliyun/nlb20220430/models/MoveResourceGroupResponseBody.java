// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class MoveResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public MoveResourceGroupResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MoveResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupResponseBody self = new MoveResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupResponseBody setData(MoveResourceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MoveResourceGroupResponseBodyData getData() {
        return this.data;
    }

    public MoveResourceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MoveResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveResourceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MoveResourceGroupResponseBodyData extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        public static MoveResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MoveResourceGroupResponseBodyData self = new MoveResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MoveResourceGroupResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
