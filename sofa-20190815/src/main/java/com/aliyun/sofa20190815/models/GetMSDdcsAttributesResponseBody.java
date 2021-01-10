// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMSDdcsAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attribute")
    public GetMSDdcsAttributesResponseBodyAttribute attribute;

    public static GetMSDdcsAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMSDdcsAttributesResponseBody self = new GetMSDdcsAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMSDdcsAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMSDdcsAttributesResponseBody setAttribute(GetMSDdcsAttributesResponseBodyAttribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public GetMSDdcsAttributesResponseBodyAttribute getAttribute() {
        return this.attribute;
    }

    public static class GetMSDdcsAttributesResponseBodyAttribute extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static GetMSDdcsAttributesResponseBodyAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetMSDdcsAttributesResponseBodyAttribute self = new GetMSDdcsAttributesResponseBodyAttribute();
            return TeaModel.build(map, self);
        }

        public GetMSDdcsAttributesResponseBodyAttribute setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetMSDdcsAttributesResponseBodyAttribute setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetMSDdcsAttributesResponseBodyAttribute setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetMSDdcsAttributesResponseBodyAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
