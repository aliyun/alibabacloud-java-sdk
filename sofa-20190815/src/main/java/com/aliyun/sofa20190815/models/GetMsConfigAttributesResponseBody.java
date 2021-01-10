// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsConfigAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Attribute")
    public GetMsConfigAttributesResponseBodyAttribute attribute;

    public static GetMsConfigAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsConfigAttributesResponseBody self = new GetMsConfigAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsConfigAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsConfigAttributesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsConfigAttributesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsConfigAttributesResponseBody setAttribute(GetMsConfigAttributesResponseBodyAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public GetMsConfigAttributesResponseBodyAttribute getAttribute() {
        return this.attribute;
    }

    public static class GetMsConfigAttributesResponseBodyAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static GetMsConfigAttributesResponseBodyAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetMsConfigAttributesResponseBodyAttribute self = new GetMsConfigAttributesResponseBodyAttribute();
            return TeaModel.build(map, self);
        }

        public GetMsConfigAttributesResponseBodyAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetMsConfigAttributesResponseBodyAttribute setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMsConfigAttributesResponseBodyAttribute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsConfigAttributesResponseBodyAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
