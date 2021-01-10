// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attribute")
    public AddMsConfigAttributesResponseBodyAttribute attribute;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static AddMsConfigAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMsConfigAttributesResponseBody self = new AddMsConfigAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMsConfigAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMsConfigAttributesResponseBody setAttribute(AddMsConfigAttributesResponseBodyAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public AddMsConfigAttributesResponseBodyAttribute getAttribute() {
        return this.attribute;
    }

    public AddMsConfigAttributesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddMsConfigAttributesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class AddMsConfigAttributesResponseBodyAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Desc")
        public String desc;

        public static AddMsConfigAttributesResponseBodyAttribute build(java.util.Map<String, ?> map) throws Exception {
            AddMsConfigAttributesResponseBodyAttribute self = new AddMsConfigAttributesResponseBodyAttribute();
            return TeaModel.build(map, self);
        }

        public AddMsConfigAttributesResponseBodyAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public AddMsConfigAttributesResponseBodyAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddMsConfigAttributesResponseBodyAttribute setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddMsConfigAttributesResponseBodyAttribute setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

}
